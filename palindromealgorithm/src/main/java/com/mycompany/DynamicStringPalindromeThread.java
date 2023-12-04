
package com.mycompany;

import java.util.Scanner;

public class DynamicStringPalindromeThread extends Thread {

    public String run(String text) {
        Scanner scanner = new Scanner(System.in);
        String result = "";

        try {

            String reverse = "";

            int length = text.length();

            for (int i = length - 1; i >= 0; i--) {
                reverse = reverse + text.charAt(i);
            }

            if (text.equals(reverse)) {
                result = "Your string/number is a palindrome!";
            } else {
                result = "Your string/number is not a palindrome!";
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        scanner.close();

        return result;

    }
}
