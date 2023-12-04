package com.cyx.studentdatagui;

import javax.swing.*;


public class App extends JTabbedPane {
    public App() {
        init();
    }

    public void init() {
        add("Register", RegisterForm.getInstance());
        add("Table", TableView.getInstance());
    }
}
