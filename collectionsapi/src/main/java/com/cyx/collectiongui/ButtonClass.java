package com.cyx.collectiongui;

import javax.swing.JButton;

import com.formdev.flatlaf.FlatClientProperties;

public class ButtonClass extends JButton {

    ButtonClass(String title, String color) {
        String background = "background: " + color;

        setText(title);
        putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold;" +
            background
        );
    }
}
