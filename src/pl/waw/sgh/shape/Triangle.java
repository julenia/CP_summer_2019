package src.pl.waw.sgh.shape;

public class Triangle extends shape{
    public Triangle (double parA, double parB){
        super(parA, parB);
    }

    public Triangle(double parA){
        super(parA);
        parB=0.5*parA*Math.sqrt(2);
    }

    public double calcSurface() {
        return 0.5*parA*parB;
    }



    @Override
    public String toString() {
        return "Triangle{" +
                "parA=" + parA +
                ", parB=" + parB +
                '}';
    }
}
