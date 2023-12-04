package com.abstractclass;
// IMPORTS
import java.util.Scanner;

public class PasswordDisplay {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PasswordDisplay display = new PasswordDisplay();

        System.out.println("How many characters should your password contain?");
        int passwordLength = scanner.nextInt();

        System.out.println("\nDo you want to generate a token as well?");
        System.out.println("Y / N : ");
        String tokenAnswer = scanner.next();

        int tokenLength;

        if (tokenAnswer.toLowerCase().equals("y")) {
            System.out.println("Do you want to specify the amount of digits your token should have?");
            System.out.println("Y / N : ");
            String tokenDigitAnswer = scanner.next();

            if (tokenDigitAnswer.toLowerCase().equals("y")) {
                System.out.println("How many digits should your token have?");
                tokenLength = scanner.nextInt();
                display.generateAll(passwordLength, tokenAnswer, tokenLength);
            } else if (tokenDigitAnswer.toLowerCase().equals("n")) {
                display.generateAll(passwordLength, tokenAnswer);
            } else {
                System.out.println("Invalid Answer!");
            }
            
        }

        scanner.close();
    }
    
    void generateAll(int passwordLength, String tokenAnswer) {
        Scanner scanner = new Scanner(System.in);

        PasswordGenerator generator = new PasswordGenerator();
        char password[] = generator.generatePassword(passwordLength);
        System.out.println("This is your password: ");
        System.out.print(password);

        GetToken token = new GetToken();

        if (tokenAnswer.toLowerCase().equals("y")) {
            System.out.println("This is your token: ");
            System.out.println(token.generateToken(tokenAnswer));
        } else if (tokenAnswer.toLowerCase().equals("n")) {
            System.out.println("You don't want to generate a token...The program has been aborted.");
        } else {
            System.out.println("Invalid answer!");
        }

        scanner.close();
    }
    
    void generateAll(int passwordLength, String tokenAnswer, int tokenLength) {
        Scanner scanner = new Scanner(System.in);

        PasswordGenerator generator = new PasswordGenerator();
        char password[] = generator.generatePassword(passwordLength);
        System.out.println("This is your password: ");
        System.out.print(password);

        GetToken token = new GetToken();

        if (tokenAnswer.toLowerCase().equals("y")) {
            System.out.println("This is your token: ");
            System.out.println(token.generateToken(tokenAnswer, tokenLength));
        } else if (tokenAnswer.toLowerCase().equals("n")) {
            System.out.println("You don't want to generate a token...The program has been aborted.");
        } else {
            System.out.println("Invalid answer!");
        }

        scanner.close();
    }

}
