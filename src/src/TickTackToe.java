package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class TickTackToe {
    public static void main(String[] args) throws FileNotFoundException {
        int n=3;
        boolean finish = false;
        boolean empty = false;
        int diag1 = 0;
        int diag2 = 0;
        String path = "C:/Users/julli/IdeaProjects/CP_summer_2019/ticktacktoe.csv";
        File file = new File(path);

         int[][] game = new int[][]{
                new int[]{0, 0, 0},
                new int[]{0, 0, 0},
                new int[]{0, 0, 0},
        };

        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            String[] cells = line.split(";");
            for(int i=0;i<=(n-1);i++){
                //In this programme it is assumed that Player 1 plays X that has value 1, and Player 2 plays 0 with value -1.
                // Empty filled is noted as 0.

                for (int j=0;j<=(n-1);j++){
                    String res = cells[i];
                    if (res.equals("X")){
                        game[i][j] = 1;
                    }
                    else if (res.equals("O")){
                        game[i][j] = -1;
                    }
                    else if (res.equals("") || res.equals(" ") || res.equals(0)) {
                        game[i][j] = 0;
                        System.out.println("Game is not finished, keep on playing!");
                        break;
                    }
                    else {
                        System.out.println("Board is not filled in correctly");
                        break;
                    }

                }
            }

        }


        for (int i = 0; i <= (n-1); i++) {
            int row = 0;
            int col = 0;

            for (int j = 0; j <= (n-1); j++) {
                // Checking if there are empty spaces on the board.
                if (game[i][j] == 0) {
                    empty = true;
                    break;
                }
            }
            if (empty == true) {
                System.out.println("Game is not finished, keep on playing!");
                break;
            }
            else {
                //Checking possible winning configurations in rows and columns

                for (int j = 0; j <= (n-1); j++) {
                    row = row + game[i][j];
                    col = col + game[j][i];
                    if (row == n || col == n) {
                        System.out.println("Player 1 won, congrats!");
                        finish=true;
                        break;

                    } else if (row == -n || col == -n) {
                        System.out.println("Player 2 won, congrats!");
                        finish = true;
                        break;
                    }
                                    }
                diag1 = diag1 + game[i][i];
                diag2 = diag1 + game[i][n-i];
            }

            }
        if (finish == false) {
            if (diag1 == n || diag2 == n) {
                System.out.println("Player 1 won, congrats!");
            } else if (diag1 == -n || diag2 == -n) {
                System.out.println("Player 2 won, congrats!");
            } else {
                System.out.println("Noone won this game :(");
            }
        }

    }

}

