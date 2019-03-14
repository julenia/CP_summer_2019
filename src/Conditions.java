public class Conditions {

    public static void main(String[] args) {
        boolean p = true;
        boolean q = false;

        boolean t = p && q; // AND
        boolean v = p || q; // OR
        boolean w = p && !q ;// AND NEGATION

        if (t) {
            System.out.println("t is true");
        } else{
            System.out.println("t is false");
        }

        if (v) {
            System.out.println("v is true");
        }
        int a = 7;

        if (5 > a) {
            System.out.println("5>a");
        }
    }
}
