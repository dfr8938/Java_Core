package ru.dfr8938.actionlistener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionBtnMain implements ActionListener {

    private String title;

    private JFrame frame;
    private JTextField textField;
    private JButton buttonEnter;
    private JButton buttonClose;

    public ActionBtnMain(String title) {
        this.title = title;
        this.frame = new JFrame();
        this.textField = new JTextField(15);
        this.buttonEnter = new JButton("Enter");
        this.buttonClose = new JButton("Close");
    }

    public void init() {
        frame.setTitle(this.title);
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        JPanel panelTop =  new JPanel();
        panelTop.setBackground(Color.LIGHT_GRAY);
        panelTop.setLayout(new FlowLayout());
        panelTop.add(textField);

        JPanel panelBottom = new JPanel();
        panelBottom.setBackground(Color.LIGHT_GRAY);
        panelBottom.setLayout(new GridBagLayout());
        buttonEnter.addActionListener(this::actionPerformed);
        panelBottom.add(buttonEnter, new GridBagConstraints(
                0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        buttonClose.addActionListener(this::actionPerformed);
        panelBottom.add(buttonClose, new GridBagConstraints(
                1, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));

        frame.add(panelTop,  new GridBagConstraints(
                0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));

        frame.add(panelBottom, new GridBagConstraints(
                0, 1, 1, 1, 1, 1,
                GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));

        frame.setVisible(true);
        frame.pack();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() instanceof JButton) {
            if(((JButton) event.getSource()).getText().equals("Enter")) {
                System.out.println(textField.getText());
            } else {
                textField.setText("");
            }
        }
    }
}
