package ru.dfr8938.button;


import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setTitle("New App");
        frame.setSize(350, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setLayout(new GridBagLayout());

        JButton btn = new JButton();

        btn.setText("Enter");

        // add elements
        frame.add(btn);
        // run
        frame.setVisible(true);
    }
}
