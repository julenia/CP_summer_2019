package src.pl.waw.sgh.shape;

public class Rectangle extends shape {

    public Rectangle(double parA, double parB) {
        super(parA, parB);
    }

    public double  calcSurface() {
        return parA*parB;
    }



}
