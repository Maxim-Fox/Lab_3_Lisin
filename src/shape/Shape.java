package shape;
import java.lang.*;

public abstract class Shape{
    protected String color;
    protected boolean filled;

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFiiled(){
        return filled;
    }

    public void setFiiled(boolean filled){
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimetr();
    public abstract String toString();
}
