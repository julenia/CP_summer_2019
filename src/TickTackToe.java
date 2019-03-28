//import java.util.stream.*;
public class TickTackToe {
    public static void main(String[] args) {
        //In this programme it is assumed that Player 1 plays X that has value 1, and Player 2 plays 0 with value -1.
        // Empty filled is noted as 0.
        int[][] game = new int[][]{
                new int[]{1, -1, 1},
                new int[]{-1, 1, -1},
                new int[]{-1, 1, 1},
        };
        boolean finish = false;

        for (int i = 0; i <= 2; i++) {
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
                if ((game[0][i] + game[1][i] + game[2][i]) == 3) {
                    System.out.println("Player 1 won, congrats!");
                    break;
                } else if ((game[0][i] + game[1][i] + game[2][i]) == -3) {
                    System.out.println("Player 2 won, congrats!");
                    break;
                } else if (game[i][0] + game[i][1] + game[i][2] == 3) {
                    System.out.println("Player 1 won, congrats!");
                    break;
                } else if (game[i][0] + game[i][1] + game[i][2] == -3) {
                    System.out.println("Player 2 won, congrats!");
                    break;

                }
            }
        }
        //Checking possible winning configurations on diagonal
        if (game[0][0] + game[1][1] + game[2][2] == 3) {
            System.out.println("Player 1 won, congrats!");
        } else if (game[0][0] + game[1][1] + game[2][2] == -3) {
            System.out.println("Player 2 won, congrats!");
        } else if (game[0][2] + game[1][1] + game[2][0] == 3) {
            System.out.println("Player 1 won, congrats!");
        } else if (game[0][2] + game[1][1] + game[2][0] == -3) {
            System.out.println("Player 2 won, congrats!");
        // When none of the above is true - there is no winner
        } else System.out.println("Noone won this game :(");


    }

}