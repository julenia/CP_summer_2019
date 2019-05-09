package src.pl.waw.sgh;

public class SumArgs {

    public static void main(String[] args) {
        double sum = 0;
        for (int i=0; i<args.length;i++){
            String arg = args[i];
            sum += Double.valueOf(arg);
        }
        System.out.println("Sum: " + sum);

    }
}
