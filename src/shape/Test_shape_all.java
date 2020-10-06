package shape;
import java.lang.*;
public class Test_shape_all {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle(2, "green", true);
        Circle c3 = new Circle(5,"", false);
        System.out.println(c1.toString());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimetr());
        System.out.println(c2.toString());
        System.out.println(c2.getArea());
        System.out.println(c2.getPerimetr());
        System.out.println(c3.toString());
        System.out.println(c3.getArea());
        System.out.println(c3.getPerimetr());
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5,8, "blue", false);
        Rectangle r3 = new Rectangle(10, 11,"none",false);
        System.out.println(r1.toString());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimetr());
        System.out.println(r2.toString());
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimetr());
        System.out.println(r3.toString());
        System.out.println(r3.getArea());
        System.out.println(r3.getPerimetr());
        Square s1 = new Square(2,"red", false);
        Square s2 = new Square(8, "blue", true);
        Square s3 = new Square(0,"",false);
        System.out.println(s1.toString());
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimetr());
        System.out.println(s2.toString());
        System.out.println(s2.getArea());
        System.out.println(s2.getPerimetr());
        System.out.println(s3.toString());
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimetr());



    }
}
