package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/4/4 11:06
 * @Version 1.0
 */
public class LambdaTest {
    public static void main(String [] args) {
        Long startTime = System.currentTimeMillis();
        for (Integer i = 0; i < 100000000; i++) {
            String.valueOf(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

    }
}
