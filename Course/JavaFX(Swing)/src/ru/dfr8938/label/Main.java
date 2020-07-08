package ru.dfr8938.label;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("New App");
        frame.setSize(350, 450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        JLabel label = new JLabel();
        label.setText("this is text in label...");

        Font font = new Font("Verdana", Font.ITALIC, 25);
        label.setForeground(Color.CYAN);

        label.setFont(font);
        frame.add(label);
        frame.setVisible(true);
    }
}
