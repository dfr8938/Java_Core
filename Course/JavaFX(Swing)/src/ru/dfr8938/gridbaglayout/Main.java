package ru.dfr8938.gridbaglayout;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Authorization");
        frame.setSize(350, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        JLabel loginLabel = new JLabel("Login:");
        JTextField loginField = new JTextField(15);
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField(15);
        JButton signInBtn = new JButton("Sign in");
        JButton signUpBtn = new JButton("Sign up");

        frame.add(loginLabel,
                new GridBagConstraints(
                0, 0, 1, 1, 1, 1,
                GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));

        frame.add(loginField,
                new GridBagConstraints(
                        1, 0, 1, 1, 1, 1,
                        GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL,
                        new Insets(2, 2, 2, 2), 0, 0
                ));

        frame.add(passLabel,
                new GridBagConstraints(
                        0, 1, 1, 1, 1, 1,
                        GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL,
                        new Insets(2, 2, 2, 2), 0, 0
                ));

        frame.add(passField,
                new GridBagConstraints(
                        1, 1, 1, 1, 1, 1,
                        GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL,
                        new Insets(2, 2, 2, 2), 0, 0
                ));
        frame.add(signUpBtn,
                new GridBagConstraints(
                        0, 2, 1, 1, 1, 1,
                        GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL,
                        new Insets(2, 2, 2, 2), 0, 0
                ));

        frame.add(signInBtn,
                new GridBagConstraints(
                        1, 2, 1, 1, 1, 1,
                        GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL,
                        new Insets(2, 2, 2, 2), 0, 0
                ));


        frame.setVisible(true);
        frame.pack();

    }
}
