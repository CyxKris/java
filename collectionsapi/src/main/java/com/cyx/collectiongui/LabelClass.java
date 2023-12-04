package com.cyx.collectiongui;

import javax.swing.JLabel;

import com.formdev.flatlaf.FlatClientProperties;

public class LabelClass extends JLabel {

    public LabelClass(String labelText, String sizeIncrement) {
        String font = "font: bold +" + sizeIncrement;
        setText(labelText);
        putClientProperty(FlatClientProperties.STYLE, "" +
            font
        );
    }
}
