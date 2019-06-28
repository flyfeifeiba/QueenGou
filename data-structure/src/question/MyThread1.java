package question;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/6/10 20:16
 * @Description: thread
 */
public class MyThread1 extends Thread {
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
