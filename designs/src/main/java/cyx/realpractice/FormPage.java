package cyx.realpractice;

import javax.swing.JPanel;

// import com.formdev.flatlaf.FlatClientProperties;

import net.miginfocom.swing.MigLayout;

public class FormPage extends JPanel {
    public FormPage() {
        init();
    }

    public void init() {

        setLayout(new MigLayout("fill, insets 20", "[center]", "[center]"));

        add(new NewEncryptForm());
    }
}
