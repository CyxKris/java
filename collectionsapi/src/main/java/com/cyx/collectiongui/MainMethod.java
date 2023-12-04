package com.cyx.collectiongui;

import javax.swing.*;
import java.awt.Font;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto_mono.FlatRobotoMonoFont;

import raven.toast.Notifications;

public class MainMethod extends JFrame {

    public MainMethod() {
        init();
    }

    public void init() {
        setTitle("Simple Form");
        setSize(1100, 650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(new MainApp());
        Notifications.getInstance().setJFrame(this);
        setVisible(true);
    }


    public static void main(String[] args) {
        FlatRobotoMonoFont.install();

        FlatLaf.registerCustomDefaultsSource("com.cyx.themes");
        FlatDarkLaf.setup();
        UIManager.put("defaultFont", new Font(FlatRobotoMonoFont.FAMILY, Font.PLAIN, 14));

        new MainMethod();
    }
}
