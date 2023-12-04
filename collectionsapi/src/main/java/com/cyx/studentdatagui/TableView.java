package com.cyx.studentdatagui;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.formdev.flatlaf.FlatClientProperties;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

import net.miginfocom.swing.MigLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TableView extends Container {

    CardLayout cardLayout;
    static JTable table;

    private TableView() {
        init();
    }

    static TableView tableView;
    static DefaultTableModel defaultTableModel;
    
    
    public static TableView getInstance() {
        if (tableView == null) {
            tableView = new TableView();
            tableView.init();
        }

        return tableView;
    }

    public void getDatabaseData() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gui_db", "root", "");

            String query = "SELECT * FROM students";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            // preparedStatement.executeQuery();

            ResultSet resultSet = preparedStatement.executeQuery();
            ResultSetMetaData resultSetMetaData = (ResultSetMetaData) resultSet.getMetaData();
            defaultTableModel = (DefaultTableModel) table.getModel();

            int columns = resultSetMetaData.getColumnCount();
            String[] columnName = new String[columns];
            for (int i = 0; i < columns; i++) {
                columnName[i] = resultSetMetaData.getColumnName(i + 1);
            }

            defaultTableModel.setColumnIdentifiers(columnName);

            while (resultSet.next()) {
                String id = String.valueOf(resultSet.getInt("studID"));

                String firstName = resultSet.getString("firstName");
                String lastName = resultSet.getString("lastName");
                String program = resultSet.getString("program");

                String[] tableData = { id, firstName, lastName, program };
                defaultTableModel.addRow(tableData);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void init() {
        cardLayout = new CardLayout();
        setLayout(cardLayout);

        JLabel tableLabel = new JLabel("View Student Data");
        tableLabel.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold +5");

        // ?THE FORM CONTROL BUTTONS
        JButton nextButton = new JButton("Next");
        nextButton.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold;");

        JButton nextButton1 = new JButton("Next");
        nextButton1.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold;");

        JButton backButton = new JButton("Back");
        backButton.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold;");

        JButton backButton1 = new JButton("Back");
        backButton1.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold;");

        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                nextButtonActionPerformed(event);
            }
        });

        nextButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                nextButtonActionPerformed(event);
            }
        });

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                backButtonActionPerformed(event);
            }
        });

        backButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                backButtonActionPerformed(event);
            }
        });

        JPanel tablePanel = new JPanel(new MigLayout("wrap, fillx, insets 20", "fill"));

        // Object[][] data = new Object[][] {
        //         { "001", "Cyx", "Aero", "Java" },
        //         { "002", "Elizabeth", "Blackburn", "Biology" },
        //         { "003", "Pedro", "Pascal", "Theatre" },
        //         { "004", "Mary", "Alcott", "Literature" }
        // };

        // String[] columnNames = { "ID", "FIRST NAME", "LAST NAME", "PROGRAM" };
        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        getDatabaseData();

        tablePanel.add(tableLabel, "gapx 3px, gapy 20px");
        tablePanel.add(scrollPane);
        tablePanel.add(nextButton, "gapbefore push");

        JPanel recordPanel = new JPanel(new MigLayout("wrap, fillx, insets 20", "fill"));

        JLabel recordLabel = new JLabel("Update Record");
        recordLabel.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold +5");

        recordPanel.add(recordLabel, "gapx 3px, gapy 20px");
        recordPanel.add(backButton, "gapbefore push");

        this.add(tablePanel, "1");
        this.add(recordPanel, "2");
    }

    protected void backButtonActionPerformed(ActionEvent event) {
        cardLayout.previous(this);
    }

    protected void nextButtonActionPerformed(ActionEvent event) {
        cardLayout.next(this);
    }
}
