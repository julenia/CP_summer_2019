package src.pl.waw.sgh;

import java.util.Scanner;

public class BowlingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        Integer numb = scanner.nextInt();
        int sum = 0;

        while(numb>0){
            sum=sum+numb;
            numb--;
        }
        System.out.println("The sum is: " + sum);
    }
}
