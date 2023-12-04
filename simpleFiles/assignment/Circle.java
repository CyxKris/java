package assignment;

public class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void getArea() {
        System.out.println("Area of Circle with " + radius + " radius: " + (radius * 2) * 3.14);
    }
    
}
