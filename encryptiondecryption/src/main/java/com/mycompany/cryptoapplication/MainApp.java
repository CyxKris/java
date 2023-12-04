package com.mycompany.cryptoapplication;

import javax.swing.*;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto_mono.FlatRobotoMonoFont;
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import raven.toast.Notifications;

import java.awt.*;


public class MainApp extends JFrame {
    public MainApp() {
        init();
    }

    public void init() {
        setTitle("Encryption Form");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(1200, 700));
        setLocationRelativeTo(null);
        setContentPane(new FormPage());
        setVisible(true);
        Notifications.getInstance().setJFrame(this);
    }

    public static void main(String[] args) {
        FlatRobotoMonoFont.install();

        FlatLaf.registerCustomDefaultsSource("cyx.themes");
        FlatDarkPurpleIJTheme.setup();
        UIManager.put("defaultFont", new Font(FlatRobotoMonoFont.FAMILY, Font.PLAIN, 13));

        new MainApp();
    }
}
