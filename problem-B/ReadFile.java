import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadFile {

    public static String[] readFile(String fileName) {
        File file = new File(fileName);
        String[] lines = new String[1000];
        Scanner sc;
        try {
            sc = new Scanner(file);
            int i = 0;
            while (sc.hasNext()) {
                lines[i] = sc.nextLine();
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return lines;

    }

    public static void main(String[] args) {
        readFile("problem-B\\Text.txt");
        String[] l = readFile("problem-B\\Text.txt");
        for (int i = 0; i < l.length; i++) {
            if (l[i] != null) {
                System.out.println("[" + i + "]: " + l[i]);
            }
        }
    }
}