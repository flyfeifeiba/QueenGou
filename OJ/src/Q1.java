import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/4/12 14:22
 * @Version 1.0
 */
public class Q1 {
    private static List<Integer> priceList;
    private static Integer maxPrice;

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.nextLine();

        String line;
        initData();
        for (int i = 0; i < number; i++) {
            line = scanner.nextLine();
            if (line.charAt(0) == 'E') {
                eOperation(Integer.valueOf(line.substring(2)));
            }
            if (line.charAt(0) == 'D') {
                dOperation();
            }
            printAmount();

        }
    }

    public static void initData() {
        priceList = new ArrayList<>();
        maxPrice = 0;
    }



    public static void eOperation(Integer number) {
        priceList.add(number);
        maxPrice = maxPrice > number ? maxPrice : number;


    }

    public static void dOperation() {
        priceList.remove(0);
        maxPrice = findMaxPrice();
    }

    public static void printAmount() {
        System.out.println(maxPrice * priceList.size());
    }

    public static int findMaxPrice() {
        return priceList.stream().max(Integer::max).get();
    }

}
