import java.util.*;

public class _8_CompanyUsers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, List<String>> companyData = new LinkedHashMap<>();

        String command = sc.nextLine();
        while (!command.equals("End")) {
            String companyName = command.split(" -> ")[0];
            String employeeID = command.split(" -> ")[1];

            if(companyData.containsKey(companyName)) {

                List<String> currentEmployees = companyData.get(companyName);

                if(!currentEmployees.contains(employeeID)) {
                    currentEmployees.add(employeeID);
                }
            } else {
                companyData.put(companyName, new ArrayList<>());
                companyData.get(companyName).add(employeeID);
            }

            command = sc.nextLine();
        }

        companyData.entrySet().forEach(entry -> {
                 System.out.println(entry.getKey());
                 entry.getValue().forEach(employee -> System.out.println("-- " + employee));
        });

    }
}
