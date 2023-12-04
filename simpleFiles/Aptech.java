import java.util.Scanner;

class Aptech {


    String school;
    Scanner input = new Scanner(System.in);

    void display() {
        // Asking the user to input data
        System.out.println("Enter the name of your school: ");
        // Storing the input in the school variable
        school = input.next();

        // Printing out the school variable
        System.out.println("The name of your school is: " + school);
    }

    // !Assignment:
    // *Create a class 'employee' that will display the following:
    // *Employee id, name, department, gender and address
}