package assignment;

public class Dog extends Animal {

    @Override
    void move() {
        System.out.println("Dog is moving.");
    }

    @Override
    void speak() {
        System.out.println("Dog is barking.");
    }
    
}
