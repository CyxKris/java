package com.cyx.collectiongui;

import javax.swing.JTextField;

import com.formdev.flatlaf.FlatClientProperties;

public class TextFieldClass extends JTextField {

    public TextFieldClass(String placeholder) {
        putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT,
            placeholder
        );
    }
}
