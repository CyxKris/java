package assignment;

public class Employee {
    String name;
    String id;
    double salary;

    void setName(String name) {
        this.name = name;
    }

    void setID(String id) {
        this.id = id;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    void giveRaise() {
        double raise = salary * 0.25;

        salary += raise;
    }

    void displayData() {
        System.out.println("\n-----EMPLOYEE-----" + "\nNAME: " + name + "\nID: " + id + "\nSALARY: " + salary + "\n");
    }
}
