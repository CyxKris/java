package com.mycompany.newclass.guiapp;

import javax.swing.*;
import java.awt.*;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDeepOceanIJTheme;

import raven.toast.Notifications;

public class ImageAppGui extends JFrame {

    public ImageAppGui() {
        init();
    }

    public void init() {
        setTitle("Image Saver");
        setSize(1000, 600);
        setContentPane(new AppMainPanel());
        Notifications.getInstance().setJFrame(this);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        FlatRobotoFont.install();

        FlatLaf.registerCustomDefaultsSource("com.mycompany.themes");
        FlatMaterialDeepOceanIJTheme.setup();
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 14));

        new ImageAppGui();
    }
}
