package src.pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "myfile.txt";
        File file = new File(path);
        String cwd = System.getProperty("user.dir");

        String temp = System.getenv("TEMP");
        System.out.println(temp);
        System.out.println(System.getProperty("java.io.tmpdir"));
        System.out.println(cwd);

        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            System.out.println(line);

        }

        System.out.println(file.length());
        System.out.println(file.getAbsolutePath());
        //System.out.println(file.getCanonicalPath());
        System.out.println(file.getParentFile());

    }
}
