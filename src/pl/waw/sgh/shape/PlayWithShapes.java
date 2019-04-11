package src.pl.waw.sgh.shape;

public class PlayWithShapes {
    public static void main(String[] args) {
        shape s1 = new shape(5);
        System.out.println(s1.toString());

        Rectangle r1 = new Rectangle(3,8);
        System.out.println(r1);
        System.out.println(r1.calcSurface());
    }
}
