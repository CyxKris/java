package assignment;

public class Car {
    String make = "";
    String model = "";
    int year = 0;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void setMake(String make) {
        this.make = make;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setYear(int year) {
        this.year = year;
    }

    void displayDetails() {
        System.out.println("\nMAKE: " + make + "\nMODEL: " + model + "\nYEAR: " + year);
    }
}
