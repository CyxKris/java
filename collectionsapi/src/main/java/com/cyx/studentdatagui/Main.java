package com.cyx.studentdatagui;

import java.awt.Font;

import javax.swing.*;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;

import raven.toast.Notifications;

public class Main extends JFrame {
    private Main() {
        // init();
    }


    public void init() {
        setTitle("Student Registration Program");
        setSize(1100, 650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(new App());
        Notifications.getInstance().setJFrame(this);
        setVisible(true);
    }

    private static Main main;

    public static Main getInstance() {
        if (main == null) {
            main = new Main();
        }

        return main;
    }


    public static void main (String[] args) {
        FlatRobotoFont.install();
        
        FlatLaf.registerCustomDefaultsSource("com.cyx.themes");
        FlatDarkLaf.setup();
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 14));

        Main.getInstance().init();
    }
}
