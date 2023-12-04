package com.mycompany;

import java.util.Random;
import java.util.Scanner;

public class GenerateOTP implements Runnable {

    String OTP (int length) {

        char[] otp = new char[length];

        try {

            String numbers = "0123456789";

            Random random = new Random();

            for (int i = 0; i < length; i++) {
                otp[i] = numbers.charAt(random.nextInt(numbers.length()));
                // System.out.println(otp);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("\nYour OTP is: " + new String(otp));
        return new String(otp);

    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the desired length of the OTP to be generated: ");
        int length = scanner.nextInt();
        OTP(length);

        scanner.close();
    }

    // @Override
    // public void run() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'run'");
    // }
}
