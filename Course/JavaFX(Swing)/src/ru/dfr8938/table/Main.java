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

        ModelTable modelTable = new ModelTable(4, 4);
        JTable table = new JTable(modelTable);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(300, 250));


        for (int i = 0; i < 100; i++) {
            String[] str = new String[]{String.valueOf((i + 1)), "Title " + (i + 1), "00" + (i + 1), "descr #" + (i + 1)};
            modelTable.addListValue(str);
        }

        for(int i = 0; i < modelTable.getColumnCount(); i++) {
            for(int j = 0; j < modelTable.getRowCount(); j++) {
                System.out.println(modelTable.getColumnName(i) + " = " + modelTable.getValueAt(j, i));
            }
        }


        JButton button1 = new JButton("Add");
        JButton button2 = new JButton("Delete");
        JButton button3 = new JButton("Clean");



        frame.add(scrollPane, new GridBagConstraints(
                0, 0, 3, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        frame.add(button1, new GridBagConstraints(
                0, 1, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        frame.add(button2, new GridBagConstraints(
                1, 1, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        frame.add(button3, new GridBagConstraints(
                2, 1, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));

        frame.setResizable(false);
        frame.setVisible(true);
        frame.pack();
    }
}
