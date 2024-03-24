import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _1_CountRealNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeMap<Double, Integer> numbersCount = new TreeMap<>();

        double[] nums = Arrays.stream(sc.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        for (double num: nums) {
            if(numbersCount.containsKey(num)) {
                numbersCount.put(num, numbersCount.get(num) + 1);
            } else {
                numbersCount.put(num, 1);
            }
        }

        for (Map.Entry<Double, Integer> kvp : numbersCount.entrySet()) {
            String keyFormatted = new DecimalFormat("#.####").format(kvp.getKey());
            System.out.printf("%s -> %d%n", keyFormatted, kvp.getValue());
        }
    }
}
