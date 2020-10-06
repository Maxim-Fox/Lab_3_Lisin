package shape;
import java.math.*;
public class Circle extends Shape{

    protected double radius;

    public Circle(){
        this.radius = 3;
        this.color = "green";
        this.filled = false;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }


    public Circle(double radius){
        this.radius = radius;
        this.color = "blue";
        this.filled = false;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return "Our shape: circle, his radius — " + this.radius +", his filled — " +this.filled+", and color — "+this.color+".";
    }
}
