package assignment;

public class Student extends Person {
    String studentID;

    void setID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    void displayData() {
        System.out.println("-----STUDENT-----" + "\nNAME: " + name + "\nAGE: " + age + "\nID: " + studentID + "\n");
    }
}
