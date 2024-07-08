package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class LoginPage extends JFrame {

    public LoginPage() {
        setTitle("Login Form");
        setSize(800, 600); // Set frame size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit on close

        // Create JPanel for the frame with GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Add some padding between components

        // Load and display the image
        ImageIcon imageIcon = new ImageIcon("D:/loginimages.png");
        Image image = imageIcon.getImage().getScaledInstance(300, 400, Image.SCALE_SMOOTH); // Adjust size here
        ImageIcon scaledIcon = new ImageIcon(image);

        JLabel imageLabel = new JLabel(scaledIcon);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 6;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(imageLabel, gbc);

        // Create form panel with the extracted color background
        JPanel formPanel = new JPanel(new GridBagLayout());
        Color customColor = new Color(131, 136, 238); // Extracted color
        formPanel.setBackground(customColor);
        formPanel.setPreferredSize(new Dimension(300, 400)); // Set size to match the image
        GridBagConstraints formGbc = new GridBagConstraints();
        formGbc.insets = new Insets(5, 5, 5, 5);
        formGbc.anchor = GridBagConstraints.WEST;//

        Font labelFont = new Font("Arial", Font.BOLD, 14); // Matching font for labels

        // Username label and text field
        JLabel userLabel = new JLabel("Username:");
        userLabel.setForeground(Color.WHITE); // Set text color to white
        userLabel.setFont(labelFont); // Set label font
        formGbc.gridx = 0;
        formGbc.gridy = 0;
        formPanel.add(userLabel, formGbc);

        JTextField userText = new JTextField(20);
        formGbc.gridx = 1;
        formGbc.gridy = 0;
        formPanel.add(userText, formGbc);

        // Password label and password field
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setForeground(Color.WHITE); // Set text color to white
        passwordLabel.setFont(labelFont); // Set label font
        formGbc.gridx = 0;
        formGbc.gridy = 1;
        formPanel.add(passwordLabel, formGbc);

        JPasswordField passwordText = new JPasswordField(20);
        formGbc.gridx = 1;
        formGbc.gridy = 1;
        formPanel.add(passwordText, formGbc);

        // Login button
        JButton loginButton = new JButton("Login");
        formGbc.gridx = 1;
        formGbc.gridy = 2;
        formPanel.add(loginButton, formGbc);

        // "Don't have an account?" label
        JLabel registerLabel = new JLabel("Don't have an account?");
        registerLabel.setForeground(Color.WHITE); // Set text color to white
        registerLabel.setFont(labelFont); // Set label font
        formGbc.gridx = 1;
        formGbc.gridy = 3;
        formPanel.add(registerLabel, formGbc);

        // Register button
        JButton registerButton = new JButton("Register");
        formGbc.gridx = 1;
        formGbc.gridy = 4;
        formPanel.add(registerButton, formGbc);

        // Add formPanel to main panel
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.NORTH;
        panel.add(formPanel, gbc);

        // Add panel to the frame
        add(panel);

        // Set frame visibility
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
