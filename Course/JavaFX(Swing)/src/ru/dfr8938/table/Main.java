package ru.dfr8938.table;

import ru.dfr8938.radiobuttonandcheckbox.ModelTable;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("New App");

        frame.setSize(300, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        ModelTable modelTable = new ModelTable(5, 5);
        JTable table = new JTable(modelTable);

        System.out.println(modelTable.getValueAt(0,0));

        frame.add(table, new GridBagConstraints(
                0, 0, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));

        frame.setResizable(false);
        frame.setVisible(true);
        frame.pack();
    }
}
