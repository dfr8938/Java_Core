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
    private JPanel panelCenter;
    private JPanel panelAlbum;
    private JPanel panelBottom;
    private JLabel usernameLabel;
    private JLabel loginLabel;
    private JLabel passLabel;
    private JLabel followersLabel;
    private JLabel followingLabel;
    private JLabel countFollowersLabel;
    private JLabel countFollowingLabel;
    private JLabel descriptionLabel;
    private JTextField usernameTextField;
    private JTextField loginTextField;
    private JTextField passTextField;
    private JTextField descriptionTextField;
    private final JButton buttonEnter;
    private final JButton buttonClear;
    private final JButton buttomAlbum;

    public SetVisible(String title) {
        this.title = title;
        this.frame = new JFrame(title);
        this.panelTop = new JPanel(new GridBagLayout());
        this.panelCenter = new JPanel(new GridBagLayout());
        this.panelAlbum = new JPanel(new GridBagLayout());
        this.panelBottom = new JPanel(new GridBagLayout());
        this.usernameLabel = new JLabel("UserName");
        this.loginLabel = new JLabel("Login:");
        this.passLabel = new JLabel("Password:");
        this.followersLabel = new JLabel("Followers:");
        this.followingLabel = new JLabel("Following:");
        this.countFollowersLabel = new JLabel("0");
        this.countFollowingLabel = new JLabel("0");
        this.descriptionLabel = new JLabel("Description with album");
        this.usernameTextField = new JTextField(10);
        this.loginTextField = new JTextField(15);
        this.passTextField = new JTextField(15);
        this.descriptionTextField = new JTextField(15);
        this.buttonEnter = new JButton("Enter");
        this.buttonClear = new JButton("Clear");
        this.buttomAlbum = new JButton("Album");
    }

    public void init() {

        frame.setSize(300, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        panelTop.add(usernameLabel, new GridBagConstraints(
                0, 0, 1, 1, 1, 1,
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

        panelCenter.add(followersLabel, new GridBagConstraints(
                0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        panelCenter.add(countFollowersLabel, new GridBagConstraints(
                1, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        panelCenter.add(followingLabel, new GridBagConstraints(
                0, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        panelCenter.add(countFollowingLabel, new GridBagConstraints(
                1, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));

        panelAlbum.add(descriptionLabel, new GridBagConstraints(
                0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        panelAlbum.add(descriptionTextField, new GridBagConstraints(
                0, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        panelAlbum.add(buttomAlbum, new GridBagConstraints(
                0, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        buttomAlbum.addActionListener(this);
        panelAlbum.setBackground(Color.LIGHT_GRAY);

        panelBottom.add(buttonEnter, new GridBagConstraints(
                0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        buttonEnter.addActionListener(this);
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
        frame.add(panelCenter, new GridBagConstraints(
                0, 1, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        frame.add(panelAlbum, new GridBagConstraints(
                0, 2, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));
        frame.add(panelBottom, new GridBagConstraints(
                0, 3, 1, 1, 1, 1,
                GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2), 0, 0
        ));

        frame.setVisible(true);
        frame.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(((JButton) e.getSource()).getText().equals("Enter")) {
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

            countFollowersLabel.setText(String.valueOf(usernameResult.getUser().getFollower_count()));
            countFollowingLabel.setText(String.valueOf(usernameResult.getUser().getFollowing_count()));

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
            for(File item : dir.listFiles()) {
                listPhoto.add(new File(String.valueOf(item)));
            }

            System.out.println(listPhoto);

            try {
                instagram.sendRequest(new InstagramUploadAlbumRequest(listPhoto, descriptionTextField.getText()));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        } else {
            loginTextField.setText("");
            passTextField.setText("");
        }
    }
}
