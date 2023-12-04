package cyx.main;

import javax.swing.*;

import com.formdev.flatlaf.*;
// import com.formdev.flatlaf.FlatIntelliJLaf;
// import com.formdev.flatlaf.FlatLaf;
// import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.fonts.inter.FlatInterFont;
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;

import cyx.login.EncryptForm;

import java.awt.*;

public class App extends JFrame {
    public App() {
        init();
    }
    
    public void init() {
        setTitle("Flatlaf Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(1200, 700));
        setLocationRelativeTo(null);
        setContentPane(new EncryptForm());
        setVisible(true);
    }

    public static void main(String[] args) {
        FlatInterFont.install();

        FlatLaf.registerCustomDefaultsSource("cyx.themes");
        FlatDarkPurpleIJTheme.setup();
        UIManager.put("defaultFont", new Font(FlatInterFont.FAMILY, Font.PLAIN, 13));

        new App();

        // EventQueue.invokeLater(() -> new App().setVisible(true));
    }
}
