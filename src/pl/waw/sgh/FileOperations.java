package src.pl.waw.sgh;

import java.io.File;

public class FileOperations {
    public static void main(String[] args) {
        String path = "myfile.txt";
        File file = new File(path);

        String temp = System.getenv("TEMP");
        System.out.println(temp);
    }
}
