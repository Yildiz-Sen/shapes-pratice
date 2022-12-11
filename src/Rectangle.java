/**
 *
 * FIRST, COMPLETE Shape interface
 * THEN, COMPLETE Rectangle, Square, and Circle classes
 * LASTLY, COMPLETE TestShapes class
 */

//implement Shape interface and provide abstract method implementation
public class Rectangle implements Shape{

    /*
    Define instance variables of rectangle as below
    Instance variables must be encapsulated
    double width
    double height
     */
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /*
        Override area and perimeter methods here
        REMEMBER:
        Area of a rectangle can be found as => width * height
        Perimeter of a rectangle can be found as => 2 * (width + height)
        */
    @java.lang.Override
    public double area(double sizeA) {
        return width * height;
    }

    @java.lang.Override
    public double perimeter(double sizeB) {
       return 2 * (width + height);
    }


    //Override toString() method here
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
