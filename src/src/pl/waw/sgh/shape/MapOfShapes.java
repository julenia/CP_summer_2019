package src.pl.waw.sgh.shape;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapOfShapes {

    public static void main(String[] args) {
        Map<String,shape> myMapShape = new HashMap<String, shape>();
        myMapShape.put("C1", new Circle(5));
        myMapShape.put("R1", new Rectangle(7,8));
        myMapShape.put("C2", new Circle(6));

        Circle c2 =(Circle)myMapShape.get("C2");
        System.out.println("c2: " + c2);

        for(String k:myMapShape.keySet()){
            System.out.println(k+" is "+ myMapShape.get(k));
        }

        Collection shapes = myMapShape.values();
    }
}
