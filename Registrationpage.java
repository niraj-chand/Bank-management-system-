package bankmanagementsystem01;
import javax.swing.*;
import java.awt.*;

public class RegistrationForm {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Register");
        frame.setSize(20000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        // Create a panel for the image
        JPanel imagePanel = new JPanel();
        imagePanel.setLayout(new BorderLayout());
        JLabel imageLabel = new JLabel();
        ImageIcon icon = new ImageIcon("C:\\Softwarica\\Sem 2\\led2\\signuplogo.png");
        imageLabel.setIcon(icon);
        imagePanel.add(imageLabel, BorderLayout.CENTER);
        
        // Position the image panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.insets = new Insets(10, 10, 10, 10); // Add some padding
        gbc.anchor = GridBagConstraints.WEST;
        frame.add(imagePanel, gbc);
        
        // Create a panel for the form
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridBagLayout());
        formPanel.setBackground(new Color(138, 43, 226)); // Set background color for the panel
        GridBagConstraints formGbc = new GridBagConstraints();
        formGbc.insets = new Insets(10, 10, 10, 10);
        formGbc.fill = GridBagConstraints.HORIZONTAL;
        
        // Add a title label for the form
        formGbc.gridx = 0;
        formGbc.gridy = 0;
        formGbc.gridwidth = 2;
        formGbc.anchor = GridBagConstraints.CENTER;
        JLabel titleLabel = new JLabel("Register");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setForeground(Color.WHITE); // Set text color to white
        formPanel.add(titleLabel, formGbc);
        
        // Reset gridwidth for form fields
        formGbc.gridwidth = 1;
        
        // Add labels and text fields for the form
        formGbc.gridx = 0;
        formGbc.gridy = 1;
        formGbc.anchor = GridBagConstraints.EAST;
        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setForeground(Color.WHITE); // Set text color to white
        formPanel.add(firstNameLabel, formGbc);

        formGbc.gridx = 1;
        formGbc.anchor = GridBagConstraints.WEST;
        JTextField firstNameText = new JTextField(20);
        formPanel.add(firstNameText, formGbc);
        
        formGbc.gridx = 0;
        formGbc.gridy = 2;
        formGbc.anchor = GridBagConstraints.EAST;
        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setForeground(Color.WHITE); // Set text color to white
        formPanel.add(lastNameLabel, formGbc);

        formGbc.gridx = 1;
        formGbc.anchor = GridBagConstraints.WEST;
        JTextField lastNameText = new JTextField(20);
        formPanel.add(lastNameText, formGbc);
        
        formGbc.gridx = 0;
        formGbc.gridy = 3;
        formGbc.anchor = GridBagConstraints.EAST;
        JLabel phoneLabel = new JLabel("Phone No:");
        phoneLabel.setForeground(Color.WHITE); // Set text color to white
        formPanel.add(phoneLabel, formGbc);

        formGbc.gridx = 1;
        formGbc.anchor = GridBagConstraints.WEST;
        JTextField phoneText = new JTextField(20);
        formPanel.add(phoneText, formGbc);
        
        formGbc.gridx = 0;
        formGbc.gridy = 4;
        formGbc.anchor = GridBagConstraints.EAST;
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setForeground(Color.WHITE); // Set text color to white
        formPanel.add(addressLabel, formGbc);

        formGbc.gridx = 1;
        formGbc.anchor = GridBagConstraints.WEST;
        JTextField addressText = new JTextField(20);
        formPanel.add(addressText, formGbc);
        
        formGbc.gridx = 0;
        formGbc.gridy = 5;
        formGbc.anchor = GridBagConstraints.EAST;
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setForeground(Color.WHITE); // Set text color to white
        formPanel.add(passwordLabel, formGbc);

        formGbc.gridx = 1;
        formGbc.anchor = GridBagConstraints.WEST;
        JPasswordField passwordText = new JPasswordField(20);
        formPanel.add(passwordText, formGbc);
        
        // Add a register button
        formGbc.gridx = 1;
        formGbc.gridy = 6;
        formGbc.anchor = GridBagConstraints.CENTER;
        JButton registerButton = new JButton("Register");
        formPanel.add(registerButton, formGbc);
        
        // Position the form panel
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        frame.add(formPanel, gbc);
        
        // Set the frame visibility
        frame.setVisible(true);
    }
}
