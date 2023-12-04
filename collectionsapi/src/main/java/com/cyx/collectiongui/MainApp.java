package com.cyx.collectiongui;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;

import com.cyx.collection.Employee;
import com.formdev.flatlaf.FlatClientProperties;

import net.miginfocom.swing.MigLayout;
import raven.toast.Notifications;

public class MainApp extends JPanel {
    private Container mainContainer;
    private CardLayout cardLayout;

    private JTextField idField, nameField, departmentField;
    private JTextArea resultTextArea;

    private Employee employee;
    private Map<Integer, Employee> employeesMap = new HashMap<>();

    public MainApp() {
        init();
    }

    public void init() {
        setLayout(new MigLayout("fill, insets 20", "[center]", "[center]"));

        mainContainer = new Container();
        cardLayout = new CardLayout();
        mainContainer.setLayout(cardLayout);

        JPanel formPanel = new JPanel(new MigLayout("wrap, fillx, insets 30 45", "fill, 350:280"));
        formPanel.putClientProperty(FlatClientProperties.STYLE, "" +
            "arc: 20;" +
            "background: lighten(@background, 3%)"
        );


        JLabel message, idLabel, nameLabel, departmentLabel;
        JPanel buttonPanel;
        JButton saveButton, viewDataButton;

        // ?FORM TITLE
        message = new LabelClass("Add New Employee", "10");

        // ?ID FORM SECTION
        idLabel = new LabelClass("ID", "2");
        idField = new TextFieldClass("Enter Employee ID");

        // ?NAME FORM SECTION
        nameLabel = new LabelClass("Name", "2");
        nameField = new TextFieldClass("Enter Employee Name");

        // ?DEPARTMENT FORM SECTION
        departmentLabel = new LabelClass("Department", "2");
        departmentField = new TextFieldClass("Enter Employee Department");

        // ?BUTTON PANEL
        buttonPanel = new JPanel();
        buttonPanel.putClientProperty(FlatClientProperties.STYLE, "" +
            "opaque: false"
        );

        // ?SAVE BUTTON
        saveButton = new ButtonClass("Save", "@accentColor");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                saveButtonActionPerformed(event);
            }
        });

        // ?VIEW DATA BUTTON
        viewDataButton = new ButtonClass("View Data", "#823038");
        viewDataButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                viewDataButtonActionPerformed(event);
            }
        });

        // ?ADDING BUTTONS TO BUTTON PANEL
        buttonPanel.add(saveButton);
        buttonPanel.add(viewDataButton);


        // ?ADDING ELEMENTS TO FORM PANEL
        formPanel.add(message);
        formPanel.add(idLabel, "gapy 5");
        formPanel.add(idField);
        formPanel.add(nameLabel, "gapy 5");
        formPanel.add(nameField);
        formPanel.add(departmentLabel, "gapy 5");
        formPanel.add(departmentField);
        formPanel.add(buttonPanel, "gapbefore push");



        // ?THE RESULT PANEL
        JPanel resultPanel = new JPanel(new MigLayout("wrap, fillx, insets 30 45", "fill, 350:280"));
        resultPanel.putClientProperty(FlatClientProperties.STYLE, "" +
            "arc: 20;" +
            "background: lighten(@background, 3%)"
        );

        JLabel resultLabel = new LabelClass("Your Results", "10");

        resultTextArea = new JTextArea();
        resultTextArea.setRows(10);
        resultTextArea.setLineWrap(true);

        JScrollPane scrollPane = new JScrollPane(
                resultTextArea,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
        );

        JButton backButton = new ButtonClass("Back", "@background");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                backButtonActionPerformed(event);
            }
        });


        resultPanel.add(resultLabel);
        resultPanel.add(scrollPane);
        resultPanel.add(backButton, "gapbefore push");




        // ?ADDING THE FORM PANEL AND RESULT PANEL TO THE MAIN CONTAINER
        mainContainer.add(formPanel, "1");
        mainContainer.add(resultPanel, "2");



        // ?ADDING THE MAIN CONTAINER TO THE MAIN APP
        add(mainContainer);
    }

    protected void backButtonActionPerformed(ActionEvent event) {
        cardLayout.previous(mainContainer);
    }

    protected void viewDataButtonActionPerformed(ActionEvent event) {

        String mapData = "";

        if (employeesMap.size() >= 1) {

            for (Map.Entry<Integer, Employee> m : employeesMap.entrySet()) {
                mapData += "********DATA SET********\nKEY: " + m.getKey() + ";\tVALUE: " + m.getValue() + "\n-----DETAILS-----\nID: "
                        + employee.getEmployeeID() + "\nNAME: " + employee.getEmployeeName() + "\nDEPARTMENT: "
                        + employee.getEmployeeDepartment() + "\n\n";
                // System.out.println(mapData);
            }

            resultTextArea.setText(mapData);

            cardLayout.next(mainContainer);
        } else {
            Notifications.getInstance().show(
                    Notifications.Type.ERROR,
                    Notifications.Location.TOP_CENTER,
                    "NO DATA HAS BEEN ADDED!"
            );
        }
        
    }

    protected void saveButtonActionPerformed(ActionEvent event) {
        if ((idField.getText().isEmpty()) || (nameField.getText().isEmpty()) || (departmentField.getText().isEmpty())) {
            Notifications.getInstance().show(
                    Notifications.Type.ERROR,
                    Notifications.Location.TOP_CENTER,
                    "FILL ALL THE FIELDS!"
            );
        } else {
            employee = new Employee(idField.getText(), nameField.getText(), departmentField.getText());

            employeesMap.put(Integer.parseInt(idField.getText()), employee);
            
            System.out.println(employeesMap.size());

            idField.setText("");
            nameField.setText("");
            departmentField.setText("");

            Notifications.getInstance().show(
                Notifications.Type.SUCCESS,
                Notifications.Location.TOP_CENTER,
                "RECORD SAVED SUCCESSFULLY!"
            );
        }
    }
}
