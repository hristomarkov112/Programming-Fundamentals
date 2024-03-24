package _2_Articles;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String articleData = sc.nextLine();
        String title = articleData.split(", ")[0];
        String content = articleData.split(", ")[1];
        String author = articleData.split(", ")[2];


        Article article = new Article(title, content, author);

        int n = Integer.parseInt(sc.nextLine());
        for (int count = 1; count <= n ; count++) {
            String command = sc.nextLine();
            String[] commandParts = command.split(": ");
            String commandName = commandParts[0];
            String commandParameter = commandParts[1];

            switch (commandName) {
                case "Edit":
                    article.edit(commandParameter);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(commandParameter);
                    break;
                case "Rename":
                    article.rename(commandParameter);
                    break;
            }
        }

        //крайното състояние на статията

        //отпечатване
        System.out.printf("%s - %s: %s", article.getTitle(), article.getContent(), article.getAuthor());
    }
}