package shape;

public class Rectangle extends Shape{

    protected double width;
    protected double length;

    public Rectangle() {
        this.width = 5;
        this.length = 4;
        this.color = "white";
        this.filled = false;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.color = "red";
        this.filled = false;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimetr() {
        return 2*width+2*length;
    }

    @Override
    public String toString() {
        return "Our rectangle: his width — "+this.width+", his length — "+this.length+", and filled — "+this.filled+", and his color — "+this.color+".";
    }
}
