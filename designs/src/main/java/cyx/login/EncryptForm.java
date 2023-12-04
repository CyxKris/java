package cyx.login;

import javax.swing.*;

import com.formdev.flatlaf.FlatClientProperties;

import net.miginfocom.swing.MigLayout;

public class EncryptForm extends JPanel {
    public EncryptForm() {
        init();
    }

    public void init() {
        setLayout(new MigLayout("fill, insets 20", "[center]", "[center]"));

        dataToEncrypt = new JTextArea();
        dataToEncrypt.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT,
                "Enter your data to encrypt");

        encryptionKey = new JTextField();
        encryptionKey.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT,
                "Enter your encryption key");

        encryptButton = new JButton("Encrypt");
        encryptButton.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold;" 
        );

        JPanel panel = new JPanel(new MigLayout("wrap, fillx, insets 35 45 30 45", "fill, 250:280"));
        panel.putClientProperty(FlatClientProperties.STYLE,
                "" +
                "arc: 20;" +
                "background:lighten(#2C2C3B, 3%);"
        );

        JLabel lbTitle = new JLabel("Hello, there!");
        lbTitle.putClientProperty(FlatClientProperties.STYLE, "" +
                "font: bold +10"
        );

        JLabel description = new JLabel("Fill out the form to encrypt your data.");
        description.putClientProperty(FlatClientProperties.STYLE, "" +
                "[light]foreground:lighten(@foreground, 30%);" +
                "[dark]foreground:darken(@foreground, 30%);"
        );

        panel.add(lbTitle);
        panel.add(description);
        panel.add(new JLabel("Data to encrypt"), "gapy 8");
        panel.add(dataToEncrypt);
        panel.add(new JLabel("Encryption Key"), "gapy 8");
        panel.add(encryptionKey);
        panel.add(encryptButton, "gapy 10");

        add(panel);

    }

    private JTextArea dataToEncrypt;
    private JTextField encryptionKey;
    private JButton encryptButton;
}
