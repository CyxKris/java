import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        // A simple math program that finds the hypotenuse of an imaginary triangle
        // a2 + b2 = c2

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        // Getting the values
        System.out.println("Enter the value of the first side");
        a = scanner.nextDouble();

        System.out.println("Enter the value of the second side");
        b = scanner.nextDouble();

        c = Math.sqrt((a * a) + (b * b));
        // * Is the same thing as:
        c = Math.hypot(a, b);
        
        System.out.println("The value of the hypotenuse is: " + c);

        scanner.close();

    }
}
