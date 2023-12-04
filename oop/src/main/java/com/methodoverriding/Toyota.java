package com.methodoverriding;

public class Toyota extends Vehicle {
    // This is a child class from the Vehicle class. Therefore it is known as a subclass
    // The parent class, Vehicle is known as a superclass

    // METHODS  
    public void name() {
        System.out.println("The brand of this car is Toyota");
    }

    // The following 'move' method overrides the 'move' method inherited from the parent class 'Vehicle'.
    // This is known as *METHOD OVERRIDING*
    void move() {
        System.out.println("A Toyota car can move");

        // To access the method from the parent class, you use the 'super' keyword
        super.move();
    }

    // private void callSuper() {
    //     super.move();
    // }
}
