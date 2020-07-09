package ru.dfr8938.flowlayout;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("New App");
        frame.setSize(350, 450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new FlowLayout());
        panel.setBackground(Color.LIGHT_GRAY);

        JTextField textField = new JTextField(15);
        JButton clear = new JButton("Clear");
        JButton enter = new JButton("Enter");

        panel.add(textField);
        panel.add(clear);
        panel.add(enter);

        frame.add(panel, BorderLayout.PAGE_END);
        frame.setVisible(true);
    }
}
