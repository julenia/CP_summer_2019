package pl.waw.sgh.shape;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListOfShapes {

    public static void main(String[] args) {

        List<shape> myShapeList = new ArrayList();
        Rectangle r1 = new Rectangle(4,5);
        myShapeList.add(new Circle(8));
        myShapeList.add(new Rectangle(4,5));
        myShapeList.add(r1);
        myShapeList.add(new Rectangle(2,3));

        myShapeList.set(1, new Circle(3));
        myShapeList.remove(0);
        System.out.println("Position of my rectangle: "
                + myShapeList.indexOf(new Rectangle(4,5)));
        System.out.println("Position of R1: "
                + myShapeList.indexOf(r1));
        //myShapeList.add;

        for(shape s : myShapeList) {
            System.out.println(s + "surface: " + s.calcSurface());
        }
        System.out.println();

        Collections.sort(myShapeList);

        for(shape s : myShapeList) {
            System.out.println(s + "surface: " + s.calcSurface());
        }

        System.out.println("Sorted by parA+parB");
        Collections.sort(myShapeList, new ShapeComparator());
        for(shape s : myShapeList) {
            System.out.println(s + "surface: " + s.calcSurface());
        }



    }
}
