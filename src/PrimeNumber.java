package src;

public class PrimeNumber {
    public static void main(String[] args) {
        int max = 101;
        boolean rest = false;
        for (int n = 2; n <= max; n++) {

            for (int i = 2; i < Math.round(0.5*n); i++) {
                if ((n % i) == 0) {
                    rest = true;
                    break;

                } else {
                    rest = false;
                }

            }
            if (rest == false) System.out.println("Prime number " + n);

        }
    }
}