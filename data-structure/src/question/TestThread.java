package question;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/6/10 20:14
 * @Description: 多线程
 */
public class TestThread {
    public static void main(String[] args) {
        Thread thread = new MyThread1(1, 1000);
        thread.run();

        Thread runnable = new Thread(new MyThread2(1, 1000));
        runnable.setPriority(8);
        runnable.start();
    }


    public static class MyThread1 extends Thread {
        private Integer startIndex;
        private Integer endIndex;

        public MyThread1(Integer startIndex, Integer endIndex) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }


        @Override
        public void run() {
            System.out.println("MyThread1开始执行！！！！！！！！！！！！！！");
            for (int i = startIndex; i <= endIndex; i++) {
                System.out.println(i);
            }
            System.out.println("MyThread1执行结束！！！！！！！！！！！！！！");
        }

    }


    public static class MyThread2 implements Runnable{
        private Integer startIndex;
        private Integer endIndex;

        public MyThread2(Integer startIndex, Integer endIndex) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        @Override
        public void run() {
            System.out.println("MyThread2开始执行！！！！！！！！！！！！！！");
            for (int i = startIndex; i <= endIndex; i++) {
                System.out.println(i);
            }
            System.out.println("MyThread2执行结束！！！！！！！！！！！！！！");
        }
    }
}
