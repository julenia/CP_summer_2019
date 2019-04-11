package src.pl.waw.sgh.obj;

public class Rectangle {

    double parA;
    double parB;

    public void setParams(double parA, double b){
        this.parA = parA;
        parB = b;
    }

    public double caclSurface(){
        return parA * parB;
    }


}
