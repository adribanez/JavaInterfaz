package SwingTax;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainForm {
    private JTextField pricePane;
    private JTextField taxPane;
    private JTextField totalPane;
    private JButton buttonCalculate;
    private JPanel taxPanel;


    public MainForm() {
        buttonCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double p = Double.parseDouble(pricePane.getText());
                double t = Double.parseDouble(taxPane.getText());

                double result = p + (p / 100 * t);
                totalPane.setText(Double.toString(result));

            }
        });
        pricePane.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
            }
        });
        taxPane.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
            }
        });
        totalPane.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("SwingTax");
        frame.setContentPane(new MainForm().taxPanel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
