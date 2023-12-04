
package cyx.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCards extends JFrame {

    public SimpleCards() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new JPanel();
        firstPanel = new JPanel();
        jLabel1 = new JLabel();
        nextButton = new JButton();
        nameField = new JTextField();
        secondPanel = new JPanel();
        jLabel2 = new JLabel();
        nextButton1 = new JButton();
        backButton = new JButton();
        thirdPanel = new JPanel();
        jLabel3 = new JLabel();
        backButton1 = new JButton();
        saveCheckBox = new JCheckBox();

        container = getContentPane();
        cardLayout = new CardLayout();
        container.setLayout(cardLayout);


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new CardLayout());

        jLabel1.setText("This is the first panel!");

        nextButton.setText("Next");
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        nameField.setToolTipText("Enter your name here");

        GroupLayout firstPanelLayout = new GroupLayout(firstPanel);
        firstPanel.setLayout(firstPanelLayout);
        firstPanelLayout.setHorizontalGroup(
            firstPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, firstPanelLayout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addComponent(nameField, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(nextButton)
                .addGap(166, 166, 166))
            .addGroup(firstPanelLayout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jLabel1)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        firstPanelLayout.setVerticalGroup(
            firstPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(firstPanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(firstPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(210, Short.MAX_VALUE))
        );

        jPanel1.add(firstPanel, "card2");

        jLabel2.setText("This is the second panel!");

        nextButton1.setText("Next");
        nextButton1.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.setActionCommand("Back");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                backButtonActionPerformed(event);
            }
        });

        GroupLayout secondPanelLayout = new GroupLayout(secondPanel);
        secondPanel.setLayout(secondPanelLayout);
        secondPanelLayout.setHorizontalGroup(
            secondPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(secondPanelLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jLabel2)
                .addContainerGap(199, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, secondPanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextButton1)
                .addGap(161, 161, 161))
        );
        secondPanelLayout.setVerticalGroup(
            secondPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(secondPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addGap(74, 74, 74)
                .addGroup(secondPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton1)
                    .addComponent(backButton))
                .addContainerGap(198, Short.MAX_VALUE))
        );

        jPanel1.add(secondPanel, "card3");

        jLabel3.setText("This is the third panel!");

        backButton1.setText("Back");
        backButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        saveCheckBox.setText("Save to File");
        saveCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                saveCheckBoxActionPerformed(evt);
            }
        });

        GroupLayout thirdPanelLayout = new GroupLayout(thirdPanel);
        thirdPanel.setLayout(thirdPanelLayout);
        thirdPanelLayout.setHorizontalGroup(
            thirdPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(thirdPanelLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jLabel3)
                .addContainerGap(213, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, thirdPanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveCheckBox, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(backButton1)
                .addGap(183, 183, 183))
        );
        thirdPanelLayout.setVerticalGroup(
            thirdPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(thirdPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addGap(75, 75, 75)
                .addGroup(thirdPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton1)
                    .addComponent(saveCheckBox))
                .addContainerGap(197, Short.MAX_VALUE))
        );

        jPanel1.add(thirdPanel, "card3");

        // GroupLayout layout = new GroupLayout(getContentPane());
        // getContentPane().setLayout(layout);
        // layout.setHorizontalGroup(
        //     layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        //     .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        // );
        // layout.setVerticalGroup(
        //     layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        //     .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        // );

        // container.add("1", firstPanelLayout);
        // container.add("2", secondPanelLayout);
        // container.add("3", thirdPanelLayout);

        container.add(firstPanel, "1");
        container.add(secondPanel, "2");
        container.add(thirdPanel, "3");

        pack();
    }

    private void backButtonActionPerformed(ActionEvent evt) {
        cardLayout.previous(container);
    }

    private void saveCheckBoxActionPerformed(ActionEvent evt) {// GEN-FIRST:event_saveCheckBoxActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_saveCheckBoxActionPerformed

    private void nextButtonActionPerformed(ActionEvent evt) {
        cardLayout.next(container);
    }

    public static void main(String args[]) {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SimpleCards.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimpleCards.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimpleCards.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimpleCards.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimpleCards().setVisible(true);
            }
        });
    }

    private JButton backButton;
    private JButton backButton1;
    private JPanel firstPanel;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JTextField nameField;
    private JButton nextButton;
    private JButton nextButton1;
    private JCheckBox saveCheckBox;
    private JPanel secondPanel;
    private JPanel thirdPanel;

    private CardLayout cardLayout;
    private Container container;
}
