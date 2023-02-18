import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class SimpleIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = null;
        System.out.print("Enter the file name and name(must start with problem-C\\\\YourFileName): ");
        String fileName = sc.next();
        while (true) {
            file = new File(fileName);
            if (file.exists() && !file.isDirectory())
                break;
            else {
                System.out.print("Your input does not exist or is a directory. Enter appropriate file name:");
                fileName = sc.next();
            }

        }
        System.out.print("Enter another file name and path:");
        String fileNameSecond = sc.next();
        while (true) {
            if (!fileName.equals(fileNameSecond))
                break;
            else {
                System.out.print("This file already written. Try again:");
                fileNameSecond = sc.next();
            }
        }
        sc.close();
        int count = 0;
        int i = 0;
        String[] strings = new String[1000];
        try {
            Scanner scanner = new Scanner(new File(fileName));

            while (scanner.hasNext()) {
                strings[i] = scanner.nextLine();
                i++;
            }
            while (strings[i].equals("I")) {
                count++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int j = 0; j < strings.length; j++) {
            if (strings[j] != null) {
                System.out.println(strings[j] + " " + count);
            }
        }

    }
}