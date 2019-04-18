package src.pl.waw.sgh.shape;

public abstract class shape implements Comparable<shape> {

    double parA;
    double parB;

    public shape(double parA, double parB){
        setParams(parA, parB);
    }

    public shape(double parA){
        setParams(parA, 0);
    }

    public void setParams(double parA, double parB){
        this.parA = parA;
        this.parB = parB;
    }

    public abstract double calcSurface();

    public int compareTo(shape shape) {
        //Compate the value of our surface with the surface of the given shape
        return Double.valueOf(calcSurface()).compareTo(shape.calcSurface());
    }

    @Override
    public String toString() {
        return "Shape[parA= "+ parA + " , parB=" +parB+ "]";
   }

}
