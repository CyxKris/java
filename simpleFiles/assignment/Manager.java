package assignment;

public class Manager extends Employee {
    String department;

    void setDepartment(String department) {
        this.department = department;
    }

    @Override
    void giveRaise() {
        double raise = salary * 0.5;

        salary += raise;
    }

    @Override
    void displayData() {
        System.out.println("-----MANAGER-----\nNAME: " + name + "\nID: " + id + "\nDEPARTMENT: " + department + "\nSALARY: " + salary + "\n");
    }
}
