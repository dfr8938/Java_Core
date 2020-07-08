package ru.dfr8938.borderlayout;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        JButton btn = new JButton();
        btn.setText("add");

        frame.setTitle("New App");
        frame.setSize(350, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setLayout(new BorderLayout());

        JPanel panelTop = new JPanel();
        panelTop.setBackground(Color.LIGHT_GRAY);

        JPanel panelBottom = new JPanel();
        panelBottom.setBackground(Color.GRAY);

        JPanel panelLeft = new JPanel();
        panelLeft.setBackground(Color.CYAN);
        panelLeft.setLayout(new BorderLayout());
        panelLeft.add(btn, BorderLayout.PAGE_START);

        JPanel panelRight = new JPanel();
        panelRight.setBackground(Color.YELLOW);

        JPanel panelCenter = new JPanel();
        panelCenter.setBackground(Color.BLUE);

        frame.add(panelTop, BorderLayout.PAGE_START);
        frame.add(panelBottom, BorderLayout.PAGE_END);
        frame.add(panelLeft, BorderLayout.LINE_START);
        frame.add(panelRight, BorderLayout.LINE_END);
        frame.add(panelCenter, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
