package com.mycompany;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import net.miginfocom.swing.MigLayout;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto_mono.FlatRobotoMonoFont;


public class ResultSetGui extends JPanel {
    private static JTextArea resultArea;

    public ResultSetGui() {
        init();
    }

    public void init() {
        setLayout(new MigLayout("fill, insets 20", "[center]", "[center]"));

        JPanel resultPanel = new JPanel(new MigLayout("wrap, fillx, insets 30 45", "fill, 350:280"));
        resultPanel.putClientProperty(FlatClientProperties.STYLE, "" +
                "arc: 20;" +
                "background: lighten(@background, 3%)");

        JLabel tableLabel = new JLabel("View Staff Data");
        tableLabel.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold +5");

        resultArea = new JTextArea();

        resultArea = new JTextArea();
        resultArea.setRows(10);
        resultArea.setLineWrap(true);

        JScrollPane scrollPane = new JScrollPane(
                resultArea,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        JButton getResultsButton = new JButton("Get Results");
        getResultsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                getResultsButtonActionPerformed(event);
            }
        });

        resultPanel.add(tableLabel);
        resultPanel.add(scrollPane);
        resultPanel.add(getResultsButton, "gapbefore push");

        add(resultPanel);
    }

    protected void getResultsButtonActionPerformed(ActionEvent event) {
        ResultSetExample resultSetExample = new ResultSetExample();
        String result = resultSetExample.displayData();

        resultArea.setText(result);
    }

    public static void main(String[] args) {

        FlatRobotoMonoFont.install();

        FlatLaf.registerCustomDefaultsSource("com.cyx.themes");
        FlatDarkLaf.setup();
        UIManager.put("defaultFont", new Font(FlatRobotoMonoFont.FAMILY, Font.PLAIN, 14));

        JFrame mainFrame = new JFrame();
        mainFrame.setTitle("Simple Form");
        mainFrame.setSize(1100, 650);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.add(new ResultSetGui());
        mainFrame.setVisible(true);
    }
}

/*
 * Create a new project, menuproject
 * create new class Notepad
 */
