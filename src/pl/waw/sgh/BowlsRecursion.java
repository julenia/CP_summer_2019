package src.pl.waw.sgh;

public class BowlsRecursion {

    private static int sumBowls(int row){
        if (row == 1) return 1;
        else return sumBowls(row -1)+ row;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("sum=" + sumBowls(n));
    }
}
