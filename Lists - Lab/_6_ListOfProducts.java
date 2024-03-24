import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _6_ListOfProducts {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        List<String> products = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String product = sc.nextLine();
            products.add(product);
        }

        Collections.sort(products);

        for (int i = 0; i < products.size(); i++) {
            System.out.println(i + 1 + "." + products.get(i));
        }
    }
}
