package assignment;

public class Triangle extends Shape {

    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void getArea() {
        System.out.println("Area of triangle is: " + (base * height) / 2);
    }
    
}
