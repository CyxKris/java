package com.cyx.internalization;

import java.util.Locale;

public class Internalization {
    

    public static void main(String[] args) {
        Locale[] availableLocales = Locale.getAvailableLocales();

        System.out.println("Installed locales list: ");

        // for (int i = 0; i < availableLocales.length; i++) { 
            // they're a lot so the length is divided by 3
        for (int i = 0; i < (availableLocales.length / 3); i++) {
            System.out.println(i + " : " + availableLocales[i]);
        }
    }
}
