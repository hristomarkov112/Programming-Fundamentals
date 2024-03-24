import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _3_MergingLists {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] numbers1 = sc.nextLine().split(" ");
        String[] numbers2 = sc.nextLine().split(" ");
        List<String> resultNumbers = new ArrayList<>();

        int firstSeqIdx = 0;
        int secondSeqidx = 0;
        boolean isFirstSeqIdx = true;

        while (firstSeqIdx >= 0 && firstSeqIdx < numbers1.length && secondSeqidx >= 0 && secondSeqidx < numbers2.length) {
            if(isFirstSeqIdx) {
                resultNumbers.add(numbers1[firstSeqIdx]);
                firstSeqIdx += 1;
                isFirstSeqIdx = false;
            } else {
                resultNumbers.add(numbers2[secondSeqidx]);
                secondSeqidx += 1;
                isFirstSeqIdx = true;
            }
        }

        for (int i = firstSeqIdx; i < numbers1.length; i++) {
            resultNumbers.add(numbers1[i]);
        }

        for (int i = secondSeqidx; i < numbers2.length; i++) {
            resultNumbers.add(numbers2[i]);
        }

        for (String num:resultNumbers) {
            System.out.print(num + " ");
        }
    }
}
