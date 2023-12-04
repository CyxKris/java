package com.mycompany;

import java.util.Random;

public class OTPCode {

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

        // System.out.println("\nYour OTP is: " + new String(otp));
        return new String(otp);

    }
}
