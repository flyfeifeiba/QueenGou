package question;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/6/10 20:17
 * @Description: runnable
 */
public class MyThread2 implements Runnable{
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
