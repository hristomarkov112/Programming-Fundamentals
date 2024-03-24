import java.util.Scanner;

public class _3_ExtractFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String path = sc.nextLine();
        String[] partsPath = path.split("\\\\");
        String fullFileName = partsPath[partsPath.length - 1];

        String fileName = fullFileName.split("\\.")[0];
        String extension = fullFileName.split("\\.")[1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extension);
    }
}
