package ru.dfr8938.table;

import ru.dfr8938.radiobuttonandcheckbox.ModelTable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame1 = new JFrame("Add");

                frame1.setSize(300, 250);
                frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame1.setLocationRelativeTo(null);
                frame1.setLayout(new GridBagLayout());

                JPanel panel =  new JPanel(new GridBagLayout());

                JLabel idLabel = new JLabel("id");
                JLabel titleLabel = new JLabel("title");
                JLabel isbnLabel = new JLabel("isbn");
                JLabel descriptionLabel = new JLabel("description");

                JTextField idTextField = new JTextField(10);
                JTextField titleTextField = new JTextField(10);
                JTextField isbnTextField = new JTextField(10);
                JTextArea descriptionTextArea = new JTextArea(10, 2);
                descriptionTextArea.setLineWrap(true);
                descriptionTextArea.setWrapStyleWord(true);

                JScrollPane scrollPane1 = new JScrollPane(descriptionTextArea);

                JButton addButton = new JButton("Add");
                addButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        if(
                                idTextField.getText().equals("") &&
                                titleTextField.getText().equals("") &&
                                isbnTextField.getText().equals("") &&
                                descriptionTextArea.getText().equals("")
                        ) {

                            JFrame frameErr = new JFrame("Error!!!");
                            frameErr.setSize(300, 150);
                            frameErr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            frameErr.setLocationRelativeTo(null);
                            frameErr.setLayout(new GridBagLayout());

                            JPanel errPanel = new JPanel(new GridBagLayout());
                            errPanel.setPreferredSize(new Dimension(200, 50));

                            JPanel errDownPanel = new JPanel(new FlowLayout());

                            JLabel okLabel = new JLabel("Fill in all the fields!", SwingConstants.CENTER);
                            JButton okButton = new JButton("Ok");

                            okButton.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    frameErr.setVisible(false);
                                }
                            });

                            errDownPanel.add(okButton);
                            errPanel.add(okLabel, new GridBagConstraints(
                                    0, 0, 1, 1, 1, 1,
                                    GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                                    new Insets(2, 2, 2, 2), 0, 0
                            ));
                            errPanel.add(errDownPanel, new GridBagConstraints(
                                    0, 1, 1, 1, 1, 1,
                                    GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                                    new Insets(2, 2, 2, 2), 0, 0
                            ));

                            frameErr.add(errPanel, new GridBagConstraints(
                                    0, 0, 1, 1, 1, 1,
                                    GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                                    new Insets(2, 2, 2, 2), 0, 0
                            ));

                            frameErr.setResizable(false);
                            frameErr.setVisible(true);
                            frameErr.pack();

                        } else {
                            modelTable.addListValue(new String[]{idTextField.getText(), titleTextField.getText(), isbnTextField.getText(), descriptionTextArea.getText()});
                        }

                    }
                });

                JButton cleanButton = new JButton("Clean");
                cleanButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        idTextField.setText("");
                        titleTextField.setText("");
                        isbnTextField.setText("");
                        descriptionTextArea.setText("");
                    }
                });

                panel.add(idLabel, new GridBagConstraints(
                        0, 0, 1, 1, 1, 1,
                        GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                        new Insets(2, 2, 2, 2), 0, 0
                ));
                panel.add(idTextField, new GridBagConstraints(
                        1, 0, 1, 1, 1, 1,
                        GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                        new Insets(2, 2, 2, 2), 0, 0
                ));

                panel.add(titleLabel, new GridBagConstraints(
                        0, 1, 1, 1, 1, 1,
                        GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                        new Insets(2, 2, 2, 2), 0, 0
                ));
                panel.add(titleTextField, new GridBagConstraints(
                        1, 1, 1, 1, 1, 1,
                        GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                        new Insets(2, 2, 2, 2), 0, 0
                ));

                panel.add(isbnLabel, new GridBagConstraints(
                        0, 2, 1, 1, 1, 1,
                        GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                        new Insets(2, 2, 2, 2), 0, 0
                ));
                panel.add(isbnTextField, new GridBagConstraints(
                        1, 2, 1, 1, 1, 1,
                        GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                        new Insets(2, 2, 2, 2), 0, 0
                ));

                panel.add(descriptionLabel, new GridBagConstraints(
                        0, 3, 1, 1, 1, 1,
                        GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                        new Insets(2, 2, 2, 2), 0, 0
                ));
                panel.add(scrollPane1, new GridBagConstraints(
                        0, 4, 2, 1, 1, 1,
                        GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                        new Insets(2, 2, 2, 2), 0, 0
                ));

                panel.add(addButton, new GridBagConstraints(
                        0, 5, 1, 1, 1, 1,
                        GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                        new Insets(2, 2, 2, 2), 0, 0
                ));
                panel.add(cleanButton, new GridBagConstraints(
                        1, 5, 1, 1, 1, 1,
                        GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                        new Insets(2, 2, 2, 2), 0, 0
                ));

                frame1.add(panel, new GridBagConstraints(
                        0, 0, 2, 1, 1, 1,
                        GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                        new Insets(2, 2, 2, 2), 0, 0
                ));

                frame1.setResizable(false);
                frame1.setVisible(true);
                frame1.pack();
            }
        });

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
