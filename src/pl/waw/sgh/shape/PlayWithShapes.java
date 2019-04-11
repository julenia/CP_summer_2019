package src.pl.waw.sgh.shape;

public class PlayWithShapes {
    public static void main(String[] args) {
        //shape s1 = new shape(5);
        //System.out.println(s1.toString());

        Rectangle r1 = new Rectangle(3,8);
        System.out.println(r1);
        System.out.println(r1.calcSurface());

        Circle c1 = new Circle(2);
        System.out.println(c1);
        System.out.println(c1.calcSurface());

        Square sq1 = new Square(3);
        System.out.println(sq1);
        System.out.println(sq1.calcSurface());

        shape[] myShapes = new shape[3];
        myShapes[0] = r1;
        myShapes[1] = c1;
        myShapes[2] = new Rectangle(2,9);

        for(shape s:myShapes){
            System.out.println(s);
            System.out.println(s.calcSurface());
        }

    }
}
