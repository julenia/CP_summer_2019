public class Hello {

    public static void main(String[] inputargs) {
        System.out.println("Hello!!!");

        Integer a = 5;
        Integer b, c;
        b = a;
        c = b + 4;
        c= new Integer(5);

        if (c==a) System.out.println("c==a");
        if (c.equals(a)) System.out.println("c equals a");

        System.out.println("b=" + b);
        System.out.println("c=" + c);

        String s1 = "abc";
        String s2 = null;

        String s3 = s1.toUpperCase();

        System.out.println(s3.charAt(1));
        s1 = "Hello John";

        int j = s1.indexOf("Jo");
        System.out.println(j);

        System.out.println(s1.substring(3, 6));


    }

}

