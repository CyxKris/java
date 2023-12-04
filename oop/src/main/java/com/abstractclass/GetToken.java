package com.abstractclass;

import java.util.Random;

public class GetToken {

    public String generateToken(String tokenAnswer) {
        Random random = new Random();

        String numbers = "0123456789";

        char[] token = new char[4];

        for (int i = 0; i < 4; i++) {
            token[i] = numbers.charAt(random.nextInt(numbers.length()));
        }

        return new String(token);
    }

    public String generateToken(String tokenAnswer, int tokenLength) {
        Random random = new Random();

        String numbers = "0123456789";

        char[] token = new char[tokenLength];

        for (int i = 0; i < tokenLength; i++) {
            token[i] = numbers.charAt(random.nextInt(numbers.length()));
        }

        return new String(token);
    }
}

