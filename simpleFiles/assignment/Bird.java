package assignment;

public class Bird extends Animal {

    @Override
    void move() {
        System.out.println("Bird is flying.");
    }

    @Override
    void speak() {
        System.out.println("Bird is tweeting.");
    }
    
}
