package assignment;

public class Square extends Rectangle {

    // int length;

    void setLength(int length) {
        this.length = length;
    }

    @Override
    int getArea() {
        return length * length;
    }

    @Override
    int getPerimeter() {
        return 4 * length;
    }
    
}
