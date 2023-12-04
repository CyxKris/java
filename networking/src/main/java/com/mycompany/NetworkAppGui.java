package com.mycompany;

import javax.swing.JFrame;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class NetworkAppGui extends JFrame {
    JPanel mainPanel = new JPanel();

    public NetworkAppGui() {
        init();
    }

    public void init() {
        setTitle("NetworkApp");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 700);
        setLocationRelativeTo(null);

        mainPanel.setLayout(new MigLayout("fill, insets 20", "[center]", "[center]"));
        mainPanel.add(new NetworkFormGui());

        setContentPane(mainPanel);
        setVisible(true);
    }
}
