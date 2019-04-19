package src.pl.waw.sgh.shape;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOfShapes {
    public static void main(String[] args) {
        Set<shape> mySetShapes = new HashSet<shape>();
        mySetShapes.add(new Circle(6));
        mySetShapes.add(new Rectangle(3,5));
        mySetShapes.add(new Circle(8));

        for(shape sh:mySetShapes){
            System.out.println(sh + " surf: " + sh.calcSurface());
        }

        System.out.println();
        Set<shape> myTreeSet = new TreeSet<shape>(mySetShapes);

        mySetShapes.add(new Rectangle(3,5));
        mySetShapes.add(new Circle(8));
        myTreeSet.addAll(mySetShapes);

        for(shape sh:mySetShapes){
            System.out.println(sh + " surf: " + sh.calcSurface());
        }
    }
}
