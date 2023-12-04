package com.mycompany;

import java.util.Scanner;

public class PalindromeAlgorithm {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int r, sum = 0, temp, n;

        System.out.println("Enter a number to be checked: ");
        n = scanner.nextInt();
        // int n = 454; /* The number variable to be checked for palindrome */

        temp = n;

        while (n > 0) {
            System.out.println("----------NEW ITERATION----------");
            r = n % 10; // Getting the remainder
            System.out.println("Value of r: " + r);
            sum = (sum * 10) + r;
            System.out.println("Value of sum: " + sum);
            n = n / 10;
            System.out.println("Value of n: " + n + "\n");
        }

        System.out.println("Value of sum: " + sum + "\n");

        if (temp == sum) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }

        scanner.close();
    }
}
