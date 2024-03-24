import java.util.*;

public class _2_WordSynonim {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, List<String>> synonims = new LinkedHashMap<>();

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            String synonym = sc.nextLine();

            if (!synonims.containsKey(word)) {
                synonims.put(word, new ArrayList<>());
            }

            synonims.get(word).add(synonym);
        }

        for (Map.Entry<String, List<String>> kvp : synonims.entrySet()) {
            System.out.printf("%s - %s%n",
                    kvp.getKey(),
                    String.join( ", ", kvp.getValue()));
        }
    }
}
