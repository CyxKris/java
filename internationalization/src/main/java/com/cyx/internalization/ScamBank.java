package com.cyx.internalization;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto_mono.FlatRobotoMonoFont;
import com.formdev.flatlaf.intellijthemes.FlatMonocaiIJTheme;

import net.miginfocom.swing.MigLayout;
import raven.toast.Notifications;

public class ScamBank extends JFrame {

    JComboBox<String> languageComboBox;
    ImageIcon icon = new ImageIcon("images/atm.png");

    JLabel langMessage, langLanguage;

    Container container;
    CardLayout cardLayout;

    JButton proceedButton, hausaBackButton, igboBackButton, yorubaBackButton, englishBackButton;
    
    public ScamBank() {
        init();
    }

    public void init() {
        setTitle("ScamBank ATM");
        setIconImage(icon.getImage());
        setSize(800, 600);
        setLayout(new MigLayout("fill, insets 20", "[center]", "[center]"));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Notifications.getInstance().setJFrame(this);


        container = new Container();
        cardLayout = new CardLayout();
        container.setLayout(cardLayout);

        JPanel mainPanel = new JPanel(new MigLayout("wrap, fillx, insets 30 45", "fill"));

        JLabel heading, message, languageLabel;

        heading = new JLabel("Welcome to ScamBank ATM!");
        heading.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold +15"
        );

        message = new JLabel("NOTE: Nobody at this bank is responsible for your mistakes/decisions.");
        message.putClientProperty(FlatClientProperties.STYLE, "" +
                "[light]foreground:lighten(@foreground, 30%);" +
                "[dark]foreground:darken(@foreground, 30%);" +
                "font: -2"
        );


        languageLabel = new JLabel("Select your language below");
        languageLabel.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold +5"
        );

        String[] languages = { "English", "Hausa", "Igbo", "Yoruba" };
        languageComboBox = new JComboBox<>(languages);
        languageComboBox.setSelectedIndex(0);

        proceedButton = new JButton("PROCEED");
        proceedButton.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold;");

        proceedButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                proceedButtonActionPerformed(event);
            }
        });

        langMessage = new JLabel();
        langLanguage = new JLabel();


        mainPanel.add(heading);
        mainPanel.add(message);
        mainPanel.add(languageLabel);
        mainPanel.add(languageComboBox);
        mainPanel.add(proceedButton, "gapbefore push");
        mainPanel.add(langMessage);
        mainPanel.add(langLanguage);


        JPanel hausaPanel = new JPanel(new MigLayout("wrap, fillx, insets 30 45", "fill"));

        JLabel hausaGreeting = new JLabel("Barka da zuwa!");
        hausaGreeting.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold +15"
        );

        JLabel hausaMessage = new JLabel("NOTE: Ku tuna, za a yi muku zamba.");
        hausaMessage.putClientProperty(FlatClientProperties.STYLE, "" +
                "[light]foreground:lighten(@foreground, 30%);" +
                "[dark]foreground:darken(@foreground, 30%);" +
                "font: -1"
        );

        hausaBackButton = new JButton("Koma Baya");
        hausaBackButton.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold;");

        hausaBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                hausaBackButtonActionPerformed(event);
            }
        });


        hausaPanel.add(hausaGreeting);
        hausaPanel.add(hausaMessage);
        hausaPanel.add(hausaBackButton, "gapbefore push");



        JPanel igboPanel = new JPanel(new MigLayout("wrap, fillx, insets 30 45", "fill"));

        JLabel igboGreeting = new JLabel("Ndewo!");
        igboGreeting.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold +15"
        );

        JLabel igboMessage = new JLabel("NOTE: Cheta na a ga-eme gị ojoro.");
        igboMessage.putClientProperty(FlatClientProperties.STYLE, "" +
                "[light]foreground:lighten(@foreground, 30%);" +
                "[dark]foreground:darken(@foreground, 30%);" +
                "font: -1"
        );

        igboBackButton = new JButton("Laghachi azụ");
        igboBackButton.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold;");

        igboBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                igboBackButtonActionPerformed(event);
            }
        });


        igboPanel.add(igboGreeting);
        igboPanel.add(igboMessage);
        igboPanel.add(igboBackButton, "gapbefore push");



        JPanel yorubaPanel = new JPanel(new MigLayout("wrap, fillx, insets 30 45", "fill"));

        JLabel yorubaGreeting = new JLabel("Kaabo!");
        yorubaGreeting.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold +15"
        );

        JLabel yorubaMessage = new JLabel("NOTE: Ranti, o yoo wa ni scammed.");
        yorubaMessage.putClientProperty(FlatClientProperties.STYLE, "" +
                "[light]foreground:lighten(@foreground, 30%);" +
                "[dark]foreground:darken(@foreground, 30%);" +
                "font: -1"
        );

        yorubaBackButton = new JButton("Pada");
        yorubaBackButton.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold;");

        yorubaBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                yorubaBackButtonActionPerformed(event);
            }
        });


        yorubaPanel.add(yorubaGreeting);
        yorubaPanel.add(yorubaMessage);
        yorubaPanel.add(yorubaBackButton, "gapbefore push");



        JPanel englishPanel = new JPanel(new MigLayout("wrap, fillx, insets 30 45", "fill"));

        JLabel englishGreeting = new JLabel("Welcome!");
        englishGreeting.putClientProperty(FlatClientProperties.STYLE, "" +
            "font: bold +15"
        );

        JLabel englishMessage = new JLabel("NOTE: Remember, you will be scammed.");
        englishMessage.putClientProperty(FlatClientProperties.STYLE, "" +
                "[light]foreground:lighten(@foreground, 30%);" +
                "[dark]foreground:darken(@foreground, 30%);" +
                "font: -1"
        );

        englishBackButton = new JButton("Back");
        englishBackButton.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold;");

        englishBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                englishBackButtonActionPerformed(event);
            }
        });


        englishPanel.add(englishGreeting);
        englishPanel.add(englishMessage);
        englishPanel.add(englishBackButton, "gapbefore push");



        container.add(mainPanel, "1");
        container.add(hausaPanel, "2");
        container.add(igboPanel, "3");
        container.add(yorubaPanel, "4");
        container.add(englishPanel, "5");

        setContentPane(container);

        setVisible(true);

    }

    protected void englishBackButtonActionPerformed(ActionEvent event) {
        cardLayout.first(container);
    }

    protected void yorubaBackButtonActionPerformed(ActionEvent event) {
        cardLayout.first(container);
    }

    protected void igboBackButtonActionPerformed(ActionEvent event) {
        cardLayout.first(container);
    }

    protected void hausaBackButtonActionPerformed(ActionEvent event) {
        cardLayout.first(container);
    }

    protected void proceedButtonActionPerformed(ActionEvent event) {
        try {
            String language = (String) languageComboBox.getSelectedItem();

            switch (language.toUpperCase()) {
                case "HAUSA":
                    // langMessage.setText("You've chosen your language as Hausa!");
                    // langLanguage.setText("Barka da zuwa!");
                    cardLayout.show(container, "2");
                    break;
                case "IGBO":
                    // langMessage.setText("You've chosen your language as Igbo!");
                    // langLanguage.setText("Ndewo!");
                    cardLayout.show(container, "3");
                    break;
                case "YORUBA":
                    // langMessage.setText("You've chosen your language as Yoruba!");
                    // langLanguage.setText("Kaabo!");
                    cardLayout.show(container, "4");
                    break;
                case "ENGLISH":
                    // langMessage.setText("You've chosen your language as English!");
                    // langLanguage.setText("Welcome!");
                    cardLayout.show(container, "5");
                    break;
                default:
                    Notifications.getInstance().show(
                        Notifications.Type.ERROR,
                        Notifications.Location.BOTTOM_RIGHT,
                        "Please select a language!"
                    );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    

    public static void main(String[] args) {
        FlatRobotoMonoFont.install();

        FlatLaf.registerCustomDefaultsSource("com.cyx.themes");
        FlatMonocaiIJTheme.setup();
        UIManager.put("defaultFont", new Font(FlatRobotoMonoFont.FAMILY, Font.PLAIN, 14));

        new ScamBank();
    }
}