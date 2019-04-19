package pl.waw.sgh.shape;

public class Square extends shape {
    public Square(double parA){
        super(parA);
    }
    public double calcSurface() {
        return parA*parA;
    }
}
