package com.abstractclass;
// IMPORTS
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    public char[] generatePassword(int length) {
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$_";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
        Random random = new Random();
        char[] password = new char[length];

        password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
        password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        password[3] = numbers.charAt(random.nextInt(numbers.length()));

        for (int i = 4; i < length; i++) {
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        return password;
    }

    public static void main(String[] args) {
        PasswordGenerator generator = new PasswordGenerator();

        int amount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many characters should your password have? ");
        amount = scanner.nextInt();



        System.out.println("\nYour password is: ");
        System.out.print(generator.generatePassword(amount));

        scanner.close();
    }

}
