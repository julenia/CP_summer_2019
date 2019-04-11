package src.pl.waw.sgh.shape;

public class shape {

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

    @Override
    public String toString() {
        return "Shape[parA= "+ parA + " , parB=" +parB+ "]";
   }

}
