package ru.dfr8938.textfield;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("New App");
        frame.setSize(350, 450);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btnEnter = new JButton();
        btnEnter.setText("Enter");
        JButton btnClear = new JButton();
        btnClear.setText("Clear");

        JTextField textField = new JTextField(10);

        frame.add(textField);
        frame.add(btnClear);
        frame.add(btnEnter);
        frame.setVisible(true);
    }
}
