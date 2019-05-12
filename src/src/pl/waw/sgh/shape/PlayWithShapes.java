package src.pl.waw.sgh.shape;

import java.util.Arrays;

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

        Triangle t1 = new Triangle(4,3);
        System.out.println(t1);
        System.out.println(t1.calcSurface());

        Triangle t2 = new Triangle(4);
        System.out.println(t2);
        System.out.println(t2.calcSurface());

        shape[] myShapes = new shape[3];
        myShapes[0] = r1;
        myShapes[1] = c1;
        myShapes[2] = new Rectangle(2,9);

        Arrays.sort(myShapes);

        for(shape s:myShapes){
            System.out.println(s);
            System.out.println(s.calcSurface());
            //if shape inherits from or implements interface
            if (s instanceof PerimeterCalculation){
                //Cast - look ar s as a Perimeter Calculation object
                PerimeterCalculation pc = ((PerimeterCalculation)s);
                System.out.println("Perimeter: " + pc.calcPerimeter());
            }
        }

    }
}
