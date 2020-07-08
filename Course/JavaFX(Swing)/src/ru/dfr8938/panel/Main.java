package ru.dfr8938.panel;

import javax.swing.*;
import java.awt.*;
import java.time.chrono.JapaneseChronology;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("New App");
        frame.setSize(350, 450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);

        JPanel panel2 = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);

        JButton btn = new JButton();
        btn.setText("Enter");

        JTextField textField = new JTextField(10);

        panel.add(panel2);
        panel2.add(textField);
        panel.add(btn);

        frame.add(panel);

        frame.setVisible(true);

    }
}
