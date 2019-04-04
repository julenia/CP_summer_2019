package src.pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileSize {


    public static long sumSize(File inFile){
        long sum = 0;
        if(inFile.isDirectory()){
            for (File f: inFile.listFiles()){
                System.out.println(f.toString() + " " + f.length());
                sum += sumSize(f);
            }
        } else {
            return inFile.length();

        }
        return sum;

    }

    public static void main(String[] args) throws IOException {
        String INPUT_PATH = "C:\\temp";
        File mypath = new File(INPUT_PATH);

        System.out.println("The size is: " + sumSize(mypath));
    }
}
