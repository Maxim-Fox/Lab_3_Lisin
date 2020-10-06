package shape;

public class Square extends Rectangle {

    public Square(){
        super();
    }

    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }

    public Square(double side){
        super(side, side);
    }

    public double getSide(){
        return super.getWidth();
    }

    public void getSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString(){
        return "Our square: his filled — "+this.filled+", his color — "+this.color+", and his side — "+this.width+".";
    }

}
