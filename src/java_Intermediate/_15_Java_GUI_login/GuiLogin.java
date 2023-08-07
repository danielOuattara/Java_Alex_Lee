package java_Intermediate._15_Java_GUI_login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class GuiLogin implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JTextField userText;
    private JPasswordField passwordText;
    JButton button;

    JLabel loginSuccess;
    JLabel loginFailure;

    public GuiLogin() {
        // in the constructor method

        userLabel = new JLabel("Username : ");
        userLabel.setBounds(10, 20, 100, 25);
        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);

        passwordLabel = new JLabel("Password : ");
        passwordLabel.setBounds(10, 70, 90, 25);
        passwordText = new JPasswordField();
        passwordText.setBounds(100, 70, 165, 25);

        button = new JButton("Login");
        // button.addActionListener(this);
        button.setBounds(270, 140, 100, 25);
        button.addActionListener(this);

        loginSuccess = new JLabel("");
        loginFailure = new JLabel("");


        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(null);
        panel.add(userLabel);
        panel.add(userText);
        panel.add(passwordLabel);
        panel.add(passwordText);
        panel.add(button);
        panel.add(loginSuccess);
        panel.add(loginFailure);

        frame = new JFrame();
        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Login User");
    }

    public static void main(String[] args) {
        new GuiLogin();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        // validation
        if (password.equals("qwerty") && user.equals("daniel")) {

            loginSuccess.setBounds(10, 110, 300, 25);
            loginSuccess.setText("Login successful !");
        } else {
            loginFailure.setBounds(10, 110, 300, 25);
            loginFailure.setText("Login Failed !");
        }
    }
}
