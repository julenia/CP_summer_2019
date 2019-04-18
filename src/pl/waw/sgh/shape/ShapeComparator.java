package src.pl.waw.sgh.shape;

import java.util.Comparator;

public class ShapeComparator implements Comparator<shape> {

    @Override
    public int compare(shape shape1, shape o2) {
        Double sumParsO1 = Double.valueOf(shape1.parA+shape1.parB);
        Double sumParsO2 = Double.valueOf(o2.parA+o2.parB);
        return sumParsO1.compareTo(sumParsO2);
    }
}
