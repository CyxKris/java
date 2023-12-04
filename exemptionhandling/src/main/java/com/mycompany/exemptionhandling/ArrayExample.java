package com.mycompany.exemptionhandling;

// ?IMPORTS
import java.io.FileWriter;
import java.io.IOException;

public class ArrayExample {
    FileWriter fileWriter = null;

    void displayArray() {
        String items[] = new String[5];
        items[0] = "Cup";
        items[1] = "Table";
        items[2] = "Hand";
        items[3] = "Computer";
        items[4] = "Keyboard";

        int numbers[] = new int[2];
        numbers[0] = 20;
        numbers[1] = 2;
        int result = numbers[0] / numbers[1];


        try {

            // *Printing out the string array, items
            System.out.print("\n{ ");
            for (int i = 0; i < items.length; i++) {
                System.out.print(items[i] + ", ");
            }
            System.out.print("}");

            System.out.println();

            // *Printing out the integer array, numbers
            System.out.println("Result of " + numbers[0] + " / " + numbers[1] + " is: " + result);

            // *Working with FileWriter
            fileWriter = new FileWriter("C:\\Users\\cyxkr\\Documents\\Programming\\Java\\charter.txt");
            fileWriter.write("I love to eat pizza!");
            fileWriter.close();

        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | IOException e) {
            System.out.println(e);
        }
    }
}
