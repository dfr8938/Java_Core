package ru.dfr8938.gridlayout;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("New App");
        frame.setSize(250, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setLayout(new BorderLayout());

        JPanel panelCenter = new JPanel(new GridLayout(3,3));
        JPanel panelTop = new JPanel(new BorderLayout());
        JPanel panelBottom = new JPanel();
        JPanel panelLeft = new JPanel();
        JPanel panelRight = new JPanel();
        JButton[] btn = new JButton[10];

        for(int i = 0; i < btn.length; i++) {
            btn[i] = new JButton(String.valueOf(i));
            panelCenter.add(btn[i]);
        }

        JTextField textField = new JTextField();
        panelTop.add(textField, BorderLayout.CENTER);

        frame.add(panelCenter, BorderLayout.CENTER);
        frame.add(panelTop, BorderLayout.PAGE_START);
//        frame.add(panelBottom, BorderLayout.PAGE_END);
//        frame.add(panelLeft, BorderLayout.LINE_START);
//        frame.add(panelRight, BorderLayout.LINE_END);

        frame.setVisible(true);
    }
}
