package src.pl.waw.sgh.obj;

import org.w3c.dom.css.Rect;

public class Rectangle {

    Double parA;
    double parB;

    public Rectangle(){
        parA = 5.0;
        parB = 6.0;
    }

    public Rectangle(double parA, double parB) {
        setParams(parA, parB);
    }

    public Rectangle(double parA){
        this(parA, 0.0);
        //this.parA=parA;
    }

    public void setParams(double parA, double b){
        this.parA = parA;
        parB = b;
    }

    public double caclSurface(){
        return parA * parB;
    }


}
