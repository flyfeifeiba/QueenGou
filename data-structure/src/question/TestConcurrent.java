package question;

import java.beans.Transient;
import java.util.*;
import java.util.concurrent.*;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/6/13 14:32
 * @Description: 测试hashmap
 */
public class TestConcurrent {

    public static void main(String[] args) throws InterruptedException {
//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(1, 1);
//
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(100, 200, 100, TimeUnit.MINUTES, new ArrayBlockingQueue<Runnable>(200000));
//
//        for (int i = 0; i < 10000; i++) {
//            threadPoolExecutor.submit(new Runnable() {
//                @Override
//                public void run() {
//                    Integer number = map.get(1);
//                    number++;
//                    map.put(1, number);
//                }
//            });
//        }
//        Thread.sleep(1000);
//        System.out.println(map.get(1));
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6);
        ArrayList<String> result = numList.stream().reduce(new ArrayList<String>(), (a, b) -> {
            a.add("element-" + Integer.toString(b));
            return a;
        }, (a, b) -> null);
        System.out.println(result);


    }
}
