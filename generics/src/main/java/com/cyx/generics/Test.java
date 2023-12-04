package com.cyx.generics;

public class Test {


    static <T> void displayData(T element) {
        System.out.println("\nYour data is: " + element);
    }

    public static void main(String[] args) {
        displayData("Primary");
        displayData(1.234);
        displayData(40);
    }


}
