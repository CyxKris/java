package com.maths;

import javax.swing.UIManager;
import java.awt.*;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.fonts.roboto_mono.FlatRobotoMonoFont;

public class MathsExample {

    public static void main(String[] args) {
        // double x = 24.55;
        // double y = 4.32;

        // // *return the maximum of two numbers
        // System.out.println("\nMaximum number of x and y is: " + Math.max(x, y));

        // // *return the square root of a number
        // System.out.println("\nSquare root of y, " + y + " is: " + Math.sqrt(y));

        // // *return a number to the power of another number
        // System.out.println("\nVariable x, " + x + " to the power of variable y, " + y + " is: " + Math.pow(x, y));

        // // *generate a pseudorandom number between 0 and 20
        // System.out.println("\nA random number between 0 and 20: " + (int) Math.floor(Math.random() * 20));

        // // *generate a pseudorandom number between 5 and 50
        // System.out.println("\nA random number between 5 and 50: " + (5 + (int) Math.floor(Math.random() * 50)));
        

        FlatRobotoMonoFont.install();

        FlatDarkLaf.setup();
        UIManager.put("defaultFont", new Font(FlatRobotoMonoFont.FAMILY, Font.PLAIN, 14));

        new MathsGui();
    }
}
