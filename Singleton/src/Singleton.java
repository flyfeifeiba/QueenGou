/**
 * @Author: yuanyuan.wang
 * @Date: 2019/4/19 10:40
 * @Version 1.0
 */
public class Singleton {
    private static Singleton INSTANCE = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return INSTANCE;
    }
}
