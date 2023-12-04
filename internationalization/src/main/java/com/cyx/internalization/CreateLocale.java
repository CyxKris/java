package com.cyx.internalization;

import java.util.Locale;
import java.util.Scanner;

public class CreateLocale {

    public static void main(String[] args) {
        Locale locale1 = new Locale("hausa", "NIG");
        Locale locale2 = new Locale("igbo", "NIG");
        Locale locale3 = new Locale("yoruba", "NIG");
        // Locale locale1 = new Locale.Builder().setLanguage("hausa").setRegion("NGA").build();
        // Locale locale2 = new Locale.Builder().setLanguage("igbo").setRegion("NGA").build();
        // Locale locale3 = new Locale.Builder().setLanguage("yoruba").setRegion("NGA").build();


        Scanner scanner = new Scanner(System.in);

        System.out.println("CHOOSE YOUR LANGUAGE: ");
        System.out.println("[A: HAUSA]\t[B: IGBO]\t[C: YORUBA]\t[D: ENGLISH]");
        String language = scanner.next();

        switch (language.toUpperCase()) {
            case "A":
                System.out.println("\nYou've chosen your language as Hausa!");
                System.out.println("Barka da zuwa!");
                break;
            case "B":
                System.out.println("\nYou've chosen your language as Igbo!");
                System.out.println("Ndewo");
                break;
            case "C":
                System.out.println("\nYou've chosen your language as Yoruba!");
                System.out.println("Kaabo");
                break;
            case "D":
                System.out.println("\nYou've chosen your language as English!");
                System.out.println("Welcome");
                break;
            default:
                System.out.println("\nYou didn't choose a valid option!!");
        }

        scanner.close();

        // System.out.println("Locale1: " + locale1);
        // System.out.println("Language: " + locale1.getDisplayLanguage());
        // System.out.println("Country Name: " + locale1.getDisplayCountry());
    }

}
