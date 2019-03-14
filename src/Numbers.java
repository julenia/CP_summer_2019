public class Numbers {

    public static void main(String[] args) {
        float f1 = 455.3f;
        double d1 = f1;
        //float f2 = d1;

        int a =6;
        long b = a;
        int c = Long.valueOf(b).intValue();
        Long bb = Long.valueOf(a);
        int cc = bb.intValue();

        int i = 0;
        i++; // i = i+1;
        i--; // i= i-1;
        i = 8;
        a = i++; //
        System.out.println(a);
        i = 8;
        a = ++i;
        System.out.println(a);
        // Pi to the power 2
        double res = Math.pow(Math.PI, 2);
        System.out.println(res);
        System.out.println(i);
        // the rest of the division
        a = i % 2;
        System.out.println(a);
    }
}
