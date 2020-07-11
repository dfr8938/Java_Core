package ru.dfr8938.instamavsw;

import org.brunocvcunha.instagram4j.Instagram4j;
import org.brunocvcunha.instagram4j.requests.InstagramSearchUsernameRequest;
import org.brunocvcunha.instagram4j.requests.InstagramUploadAlbumRequest;
import org.brunocvcunha.instagram4j.requests.payload.InstagramSearchUsernameResult;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SetVisible implements ActionListener {

    private String title;
    private JFrame frame;
    private JPanel panelTop;
    private JPanel panelConnect;
    private JPanel panelConnectInfoConnectLabel;
    private JPanel panelConnectButton;
    private JPanel panelCenter;
    private JPanel panelAlbum;
    private JPanel panelBottom;
    private JLabel usernameLabel;
    private JLabel loginLabel;
    private JLabel passLabel;
    private JLabel infoLabel;
    private JLabel infoConnectLabel;
    private JLabel userLabel;
    private JLabel fullnameLabel;
    private JLabel userOutputLabel;
    private JLabel fullnameOutputLabel;
    private JLabel followersLabel;
    private JLabel followingLabel;
    private JLabel countFollowersLabel;
    private JLabel countFollowingLabel;
    private JLabel descriptionLabel;
    private JLabel progressLabel;
    private JProgressBar progressBar;
    private JTextField usernameTextField;
    private JTextField loginTextField;
    private JTextField passTextField;
    private JTextArea descriptionTextField;
    private JScrollPane scrollPane;
    private final JButton buttonEnter;
    private final JButton buttonClear;
    private final JButton buttonAlbum;

    public SetVisible(String title) {
        this.title = title;
        this.frame = new JFrame(title);
        this.panelTop = new JPanel(new GridBagLayout());
        this.panelConnect = new JPanel(new GridBagLayout());
        this.panelConnectInfoConnectLabel = new JPanel(new GridBagLayout());
        this.panelConnectButton = new JPanel(new GridBagLayout());
        this.panelCenter = new JPanel(new GridBagLayout());
        this.panelAlbum = new JPanel(new GridBagLayout());
        this.panelBottom = new JPanel(new GridBagLayout());
        this.usernameLabel = new JLabel("UserName");
        this.loginLabel = new JLabel("Login:");
        this.passLabel = new JLabel("Password:");
        this.infoLabel = new JLabel("Info:");
        this.infoConnectLabel = new JLabel("Not connected", SwingConstants.CENTER);
        this.userLabel = new JLabel("User Name:");
        this.fullnameLabel = new JLabel("Full Name:");
        this.userOutputLabel = new JLabel("-");
        this.fullnameOutputLabel = new JLabel("-");
        this.followersLabel = new JLabel("Followers:");
        this.followingLabel = new JLabel("Following:");
        this.countFollowersLabel = new JLabel("0");
        this.countFollowingLabel = new JLabel("0");
        this.descriptionLabel = new JLabel("Description with album");
        this.progressLabel = new JLabel("Progress:");
        this.progressBar = new JProgressBar();
        this.usernameTextField = new JTextField(25);
        this.loginTextField = new JTextField(25);
        this.passTextField = new JTextField(25);
        this.descriptionTextField = new JTextArea(10, 2);
        this.scrollPane = new JScrollPane(descriptionTextField);
        this.buttonEnter = new JButton("Connect");
        this.buttonClear = new JButton("Clear");
        this.buttonAlbum = new JButton("Album");
    }

    public void init() {

        frame.setSize(300, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        panelTop.add(usernameLabel, new GridBagConstraints(
                0, 0, 2, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        panelTop.add(usernameTextField, new GridBagConstraints(
                0, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));

        panelTop.add(loginLabel, new GridBagConstraints(
                0, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        panelTop.add(loginTextField, new GridBagConstraints(
                0, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        panelTop.add(passLabel, new GridBagConstraints(
                0, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        panelTop.add(passTextField, new GridBagConstraints(
                0, 5, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        panelTop.setBackground(Color.LIGHT_GRAY);

        panelConnect.add(panelConnectInfoConnectLabel, new GridBagConstraints(
                0, 0, 1, 1, 1, 1,
                GridBagConstraints.LINE_START, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        panelConnect.add(panelConnectButton, new GridBagConstraints(
                1, 0, 1, 1, 1, 1,
                GridBagConstraints.LINE_END, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        panelConnect.setPreferredSize(new Dimension(300, 30));

        panelConnectInfoConnectLabel.setBackground(Color.LIGHT_GRAY);
        panelConnectInfoConnectLabel.setPreferredSize(new Dimension(150, 30));
        panelConnectInfoConnectLabel.setMaximumSize(new Dimension(150, 30));
        panelConnectInfoConnectLabel.setMinimumSize(new Dimension(150, 30));

        panelConnectButton.setBackground(Color.LIGHT_GRAY);
        panelConnectButton.setPreferredSize(new Dimension(150, 30));
        panelConnectButton.setMaximumSize(new Dimension(150, 30));
        panelConnectButton.setMinimumSize(new Dimension(150, 30));

        panelConnectInfoConnectLabel.add(infoConnectLabel, new GridBagConstraints(
                0, 0, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        panelConnectButton.add(buttonEnter, new GridBagConstraints(
                0, 0, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        buttonEnter.addActionListener(this);
        panelConnect.setBackground(Color.LIGHT_GRAY);
        infoConnectLabel.setFont(new Font("Verdana", Font.BOLD, 12));
        infoConnectLabel.setForeground(Color.RED);

        panelCenter.add(infoLabel, new GridBagConstraints(
                0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        infoLabel.setFont(new Font("Verdana", Font.ITALIC, 15));
        infoLabel.setForeground(Color.WHITE);

        panelCenter.add(userLabel, new GridBagConstraints(
                0, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        panelCenter.add(userOutputLabel, new GridBagConstraints(
                1, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        panelCenter.add(fullnameLabel, new GridBagConstraints(
                2, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        panelCenter.add(fullnameOutputLabel, new GridBagConstraints(
                3, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        panelCenter.add(followersLabel, new GridBagConstraints(
                0, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        panelCenter.add(countFollowersLabel, new GridBagConstraints(
                1, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        panelCenter.add(followingLabel, new GridBagConstraints(
                2, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        panelCenter.add(countFollowingLabel, new GridBagConstraints(
                3, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        panelCenter.setBackground(Color.LIGHT_GRAY);

        panelAlbum.add(descriptionLabel, new GridBagConstraints(
                0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        descriptionTextField.setLineWrap(true);
        descriptionTextField.setWrapStyleWord(true);
        descriptionTextField.setAutoscrolls(true);
        panelAlbum.add(scrollPane, new GridBagConstraints(
                0, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));

        JPanel panelProgress = new JPanel(new GridBagLayout());
        panelProgress.add(progressLabel, new GridBagConstraints(
                0, 0, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        panelProgress.add(progressBar, new GridBagConstraints(
                1, 0, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        progressBar.setStringPainted(true);

        panelAlbum.add(panelProgress, new GridBagConstraints(
                0, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));

        panelAlbum.add(buttonAlbum, new GridBagConstraints(
                0, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        buttonAlbum.addActionListener(this);
        panelAlbum.setBackground(Color.LIGHT_GRAY);

//        panelBottom.add(buttonEnter, new GridBagConstraints(
//                0, 0, 1, 1, 1, 1,
//                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
//                new Insets(2, 2, 2, 2), 0, 0
//        ));
//        buttonEnter.addActionListener(this);
        panelBottom.add(buttonClear, new GridBagConstraints(
                1, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        buttonClear.addActionListener(this);
        panelBottom.setBackground(Color.LIGHT_GRAY);


        frame.add(panelTop, new GridBagConstraints(
                0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        frame.add(panelConnect, new GridBagConstraints(
                0, 1, 3, 1, 3, 1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        frame.add(panelCenter, new GridBagConstraints(
                0, 2, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        frame.add(panelAlbum, new GridBagConstraints(
                0, 3, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        frame.add(panelBottom, new GridBagConstraints(
                0, 4, 1, 1, 1, 1,
                GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));

        frame.setResizable(false);
        frame.setVisible(true);
        frame.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(((JButton) e.getSource()).getText().equals("Connect")) {
            Instagram4j instagram = Instagram4j.builder().username(loginTextField.getText()).password(passTextField.getText()).build();
            instagram.setup();
            try {
                instagram.login();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            InstagramSearchUsernameResult usernameResult = null;
            try {
                usernameResult = instagram.sendRequest(new InstagramSearchUsernameRequest(usernameTextField.getText()));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            assert usernameResult != null;

            infoConnectLabel.setText("Connected");
            infoConnectLabel.setForeground(Color.GREEN);
            countFollowersLabel.setText(String.valueOf(usernameResult.getUser().getFollower_count()));
            countFollowingLabel.setText(String.valueOf(usernameResult.getUser().getFollowing_count()));
            userOutputLabel.setText(String.valueOf(usernameResult.getUser().getUsername()));
            fullnameOutputLabel.setText(String.valueOf(usernameResult.getUser().getFull_name()));


            System.out.println(usernameResult.getUser());

        } else if(((JButton) e.getSource()).getText().equals("Album")) {
            Instagram4j instagram = Instagram4j.builder().username(loginTextField.getText()).password(passTextField.getText()).build();
            instagram.setup();
            try {
                instagram.login();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            InstagramSearchUsernameResult usernameResult = null;
            try {
                assert false;
                usernameResult = instagram.sendRequest(new InstagramSearchUsernameRequest(usernameTextField.getText()));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            countFollowersLabel.setText(String.valueOf(usernameResult.getUser().getFollower_count()));
            countFollowingLabel.setText(String.valueOf(usernameResult.getUser().getFollowing_count()));

            File dir = new File("img/");

            List<File> listPhoto = new ArrayList<>();
//            for(File item : dir.listFiles()) {
//                listPhoto.add(new File(String.valueOf(item)));
//            }
            progressBar.setMinimum(0);
            progressBar.setMaximum(dir.listFiles().length - 1);
            for (int i = 0; i < dir.listFiles().length; i++) {
                progressBar.setValue(i);
                listPhoto.add(new File(String.valueOf(dir.listFiles()[i])));
            }

            System.out.println(listPhoto);

            try {
                instagram.sendRequest(new InstagramUploadAlbumRequest(listPhoto, descriptionTextField.getText()));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        } else {
            usernameTextField.setText("");
            loginTextField.setText("");
            passTextField.setText("");

            infoConnectLabel.setText("Not connected");
            infoConnectLabel.setForeground(Color.RED);

            userOutputLabel.setText("-");
            fullnameOutputLabel.setText("-");
            countFollowersLabel.setText("0");
            countFollowingLabel.setText("0");
            descriptionTextField.setText("");
            progressBar.setValue(0);
        }
    }
}
