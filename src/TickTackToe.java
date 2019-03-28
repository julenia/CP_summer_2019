package src;

public class TickTackToe {
    public static void main(String[] args) {
        //In this programme it is assumed that Player 1 plays X that has value 1, and Player 2 plays 0 with value -1.
        // Empty filled is noted as 0.
        int[][] game = new int[][]{
                new int[]{1, -1, 1},
                new int[]{-1, -1, -1},
                new int[]{-1, 1, 1},
        };
        boolean finish = false;
        int diag1 = 0;
        int diag2 = 0;

        for (int i = 0; i <= 2; i++) {
            int row = 0;
            int col = 0;

            for (int j = 0; j <= 2; j++) {
                // Checking if there are empty spaces on the board.
                if (game[i][j] == 0) {
                    finish = true;
                    break;
                }
            }
            if (finish == true) {
                System.out.println("Game is not finished, keep on playing!");
                break;
            }
            else {
                //Checking possible winning configurations in rows and columns

                for (int j = 0; j <= 2; j++) {
                    row = row + game[i][j];
                    col = col + game[j][i];
                    if (row == 3 || col == 3) {
                        System.out.println("Player 1 won, congrats!");
                        finish=true;
                        break;

                    } else if (row == -3 || col == -3) {
                        System.out.println("Player 2 won, congrats!");
                        finish = true;
                        break;
                    }
                                    }
                diag1 = diag1 + game[i][i];
                diag2 = diag1 + game[i][2-i];
            }

            }
        if (finish == false) {
            if (diag1 == 3 || diag2 == 3) {
                System.out.println("Player 1 won, congrats!");
            } else if (diag1 == -3 || diag2 == -3) {
                System.out.println("Player 2 won, congrats!");
            } else {
                System.out.println("Noone won this game :(");
            }
        }

    }

}

