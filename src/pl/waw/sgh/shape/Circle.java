package src.pl.waw.sgh.shape;

public class Circle extends shape {
    public Circle(double parA) {
        super(parA);
    }
    public double calcSurface(){
        return Math.PI*parA*parA;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "parA=" + parA +
                '}';
    }
}
