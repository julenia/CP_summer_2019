package src.stock;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.io.File;
//import java.io.Path;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class stockCalc {

    public static void main(String[] args) throws IOException {

       String[] dir = {"C:\\Users\\julli\\IdeaProjects\\CP_summer_2019\\GOOG.csv", "C:\\Users\\julli\\IdeaProjects\\CP_summer_2019\\IBM.csv", "C:\\Users\\julli\\IdeaProjects\\CP_summer_2019\\MSFT.csv"};
       String[] out = {"C:\\Users\\julli\\IdeaProjects\\CP_summer_2019\\GOOG1.csv", "C:\\Users\\julli\\IdeaProjects\\CP_summer_2019\\IBM1.csv", "C:\\Users\\julli\\IdeaProjects\\CP_summer_2019\\MSFT1.csv"};
       for (int p = 0; p <= 2; p++) {
            String path = dir[p];
            File file = new File(path);
            String path_out=out[p];
            File outFile = new File(path_out);
            int n = 24;
            int m = 7;
            double stock[][] = new double[m][(n - 1)];
            String header[][] = new String[(m + 1)][1];
            String date[][] = new String[1][(n - 1)];
            Scanner fileScanner = new Scanner(file);

            try {
                FileWriter fw = new FileWriter(outFile, true);
                BufferedWriter bw = new BufferedWriter(fw);
                int i=0;
                outerloop:
                while (fileScanner.hasNext()) {
                        String line = fileScanner.nextLine();
                        String[] cells = line.split(",");
                        for (int j = 0; j <= (m - 1); j++) {
                            if (i == 0) {
                                header[j][i] = cells[j];
                                header[m][i] = "Change";
                                bw.append(header[j][i]);
                                bw.append(',');
                            }

                            if (j == 0 && i > 0) {

                                date[0][(i - 1)] = cells[0];
                            }
                            if (i > 0 && j > 0) {
                                stock[(j - 1)][(i - 1)] = 0;
                                stock[(j - 1)][(i - 1)] = Double.valueOf(cells[j]);
                            }
                            if (i == (n - 1) && j == (m - 1)) break outerloop;

                        }
                        i++;

                    }

                bw.append(header[m][0]);
                bw.append(',');
                bw.newLine();
                bw.flush();

                for (i = 0; i <= (n - 2); i++) {
                    stock[(m - 1)][i] = (stock[3][i] - stock[0][i]) / stock[0][i];

                }
                for (i = 0; i <= (n - 2); i++) {
                    bw.append(date[0][i]);
                    bw.append(',');
                    for (int j = 0; j <= (m - 1); j++) {
                        bw.append(Double.toString(stock[j][i]));
                        bw.append(',');

                    }
                    bw.newLine();
                    bw.flush();
                }

                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


    }












