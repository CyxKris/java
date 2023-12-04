package assignment;

public class Rectangle {
    int length;
    int width;

    void setLength(int length) {
        this.length = length;
    }

    void setWidth(int width) {
        this.width = width;
    }

    int getArea() {
        return length * width;
    }

    int getPerimeter() {
        return (2 * length) + (2 * width);
    }
}
