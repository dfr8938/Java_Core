package ru.dfr8938.progressbar;

import javax.swing.*;
import java.awt.*;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        JFrame frame = new JFrame();
        frame.setTitle("New App");
        frame.setSize(350, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        JProgressBar progressBar = new JProgressBar();

        progressBar.setMinimum(0);
        progressBar.setMaximum(100);

        progressBar.setStringPainted(true);

        frame.add(progressBar);

        frame.setVisible(true);

        for (int i = progressBar.getMinimum(); i <= progressBar.getMaximum(); i++) {
            sleep(300);
            progressBar.setValue(i);
        }

    }
}
