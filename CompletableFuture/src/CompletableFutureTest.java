import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/12/3 17:13
 * @Description: 测试CompletableFuture
 */
public class CompletableFutureTest {
    private static final int LAST_INDEX = 1000000;
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Long startTime = System.currentTimeMillis();
        CompletableFuture<Integer> oddFuture = CompletableFuture.supplyAsync(() -> calSum(1));
        CompletableFuture<Integer> evenFuture = CompletableFuture.supplyAsync(() -> calSum(2));
        System.out.println(oddFuture.get() + evenFuture.get());
        Long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    private static int calSum(int initIndex) {
        int sum = 0;
        for (int i = initIndex; i < LAST_INDEX; i = i + 2) {
            sum += i;
        }
        return sum;
    }
}
