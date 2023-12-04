package com.mycompany;

import java.util.Scanner;

public class SimpleStringPalindrome {
    
    boolean getResult(String text) {
        Scanner scanner = new Scanner(System.in);

        String reverse = "";
        boolean result;

        int length = text.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }

        if (text.equals(reverse)) {
            // result = "Your string/number is a palindrome!";
            result = true;

        } else {
            // result = "Your string/number is not a palindrome!";
            result = false;
        }
        scanner.close();

        return result;
    }

}
