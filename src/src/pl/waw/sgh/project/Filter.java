package src.pl.waw.sgh.project;

import java.io.*;
import java.util.Scanner;

public class Filter {
    public static void main(String[] args) throws FileNotFoundException {
        String[] dir = {"C:\\Users\\julli\\OneDrive\\Pulpit\\Salestack\\project\\CNTNT marketing 12.05.2019 - all leads.csv"};
        String[] out = {"C:\\Users\\julli\\OneDrive\\Pulpit\\Salestack\\project\\CNTNT marketing 12.05.2019 - all leads selected.csv"};
        String path = dir[0];
        File file = new File(path);
        String path_out=out[0];
        File outFile = new File(path_out);
        int m=29;
        int n=1000000;
        String data[][] = new String[m][n];
        Scanner fileScanner = new Scanner(file);
        try {
            FileWriter fw = new FileWriter(outFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            int j=0;
            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                String[] cells = line.split(",");
                for (int i = 0; i <= (m - 1); i++) {
                    data[i][j]=cells[i];
                    System.out.println(cells[i]);
                }
            }
            j++;
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    }
