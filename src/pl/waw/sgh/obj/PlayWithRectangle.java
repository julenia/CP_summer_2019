package src.pl.waw.sgh.obj;

public class PlayWithRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4.9, 2.0);
        //r1.setParams(3.0, 4.0);
        System.out.println("R1 surface: " + r1.caclSurface());

        Rectangle r2 = new Rectangle();
        System.out.println("R2 surface: " + r2.caclSurface());

        Rectangle r3 = new Rectangle();
        System.out.println("R2 surface: " + r2.caclSurface());
    }
}
