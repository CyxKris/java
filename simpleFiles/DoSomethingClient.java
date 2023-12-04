import java.rmi.Naming;
import java.util.Scanner;

public class DoSomethingClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // DoSomething getDoSomething = (DoSomething) Naming.lookup("assignment");
            DoSomething getDoSomething = (DoSomething) Naming.lookup("rmi://localhost:5000/assignment");
            System.out.println("Please enter your name: ");
            String name = scanner.next();

            System.out.println(getDoSomething.sayName(name));

            System.out.println("\nPlease enter a number: ");
            int a = scanner.nextInt();
            System.out.println("Enter another number: ");
            int b = scanner.nextInt();

            System.out.println("The result of " + a + " * " + b + " is: ");
            System.out.print(getDoSomething.multiply(a, b));

        } catch (Exception e) {
            System.out.println(e);
        }
        scanner.close();
    }
}
