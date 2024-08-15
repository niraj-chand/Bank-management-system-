package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.Border;

public class Dashboard extends JFrame {

    private JLabel balanceLabel;
    private boolean isBalanceVisible = false;

    public Dashboard() {
        setTitle("Bank Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 400); // Set your preferred size
        setLocationRelativeTo(null); // Center the window

        // Create main panel and set layout
        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Padding around components

        // Create title label and add to top of main panel
        ImageIcon bankIcon = new ImageIcon("C:\\Users\\QCS\\Documents\\bank.png");
        JLabel titleLabel = new JLabel("Bank Management System", bankIcon, JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setVerticalTextPosition(JLabel.BOTTOM);
        titleLabel.setHorizontalTextPosition(JLabel.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.NORTH; // Align label to the top
        mainPanel.add(titleLabel, gbc);

        // Create balance label (initially hidden) and toggle button
        balanceLabel = new JLabel("Balance: $1000");
        balanceLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        balanceLabel.setVisible(false); // Initially hidden

        JButton toggleBalanceBtn = new JButton("Show Balance");
        toggleBalanceBtn.setFont(new Font("Arial", Font.BOLD, 14));
        toggleBalanceBtn.setBackground(new Color(102, 133, 255));
        toggleBalanceBtn.setForeground(Color.WHITE);
        toggleBalanceBtn.setFocusPainted(false);
        toggleBalanceBtn.setPreferredSize(new Dimension(180, 40));

        // Add action listener to toggle button
        toggleBalanceBtn.addActionListener(e -> {
            isBalanceVisible = !isBalanceVisible;
            balanceLabel.setVisible(isBalanceVisible);
            toggleBalanceBtn.setText(isBalanceVisible ? "Hide Balance" : "Show Balance");
        });

        gbc.gridy = 1;
        mainPanel.add(balanceLabel, gbc);

        gbc.gridy = 2;
        mainPanel.add(toggleBalanceBtn, gbc);

        // Create buttons with icons
        JButton transactionBtn = createIconButton("Transaction");
        JButton customerBtn = createIconButton("Customer");
        JButton loansBtn = createIconButton("Loan");
        JButton accountDetailsBtn = createIconButton("Account Details");
        JButton statementBtn = createIconButton("Statement");
        JButton logoutBtn = createButton("Logout");
        JButton backBtn = createButton("Back");

        // Add buttons with icons to main panel
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        mainPanel.add(createButtonPanel(transactionBtn, "C:\\Users\\QCS\\Documents\\customer.png"), gbc);

        gbc.gridx = 1;
        mainPanel.add(createButtonPanel(customerBtn, "C:\\Users\\QCS\\Documents\\Transaction.png"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        mainPanel.add(createButtonPanel(loansBtn, "C:\\Users\\QCS\\Documents\\loan.png"), gbc);

        gbc.gridx = 1;
        mainPanel.add(createButtonPanel(accountDetailsBtn, "C:\\Users\\QCS\\Documents\\account details.png"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        mainPanel.add(createButtonPanel(statementBtn, "C:\\Users\\QCS\\Documents\\statement.png"), gbc);

        // Create clickable label for License and Agreement
        JLabel licenseLabel = new JLabel("License and User Agreement");
        licenseLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        licenseLabel.setForeground(Color.BLUE.darker());
        licenseLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // Change cursor to hand when hovered
        licenseLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Action to perform when label is clicked
                JOptionPane.showMessageDialog(Dashboard.this,
                        "License and User Agreement functionality will be implemented here.");
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2; // Span across both columns
        gbc.anchor = GridBagConstraints.CENTER;
        mainPanel.add(licenseLabel, gbc);

        // Add back and logout buttons at the bottom
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        mainPanel.add(backBtn, gbc);

        gbc.gridx = 1;
        mainPanel.add(logoutBtn, gbc);

        // Set main panel as content pane of the frame
        setContentPane(mainPanel);

        setVisible(true); // Make the frame visible
    }

    private JPanel createButtonPanel(JButton button, String iconPath) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10)); // Adjust layout and gaps as needed

        // Create and add icon
        ImageIcon icon = new ImageIcon(iconPath);
        Image img = icon.getImage();
        Image scaledImg = img.getScaledInstance(32, 32, Image.SCALE_SMOOTH); // Scale icon to 32x32
        ImageIcon scaledIcon = new ImageIcon(scaledImg);
        JLabel iconLabel = new JLabel(scaledIcon);
        panel.add(iconLabel);

        // Add button to the panel
        panel.add(button);

        return panel;
    }

    private JButton createIconButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setForeground(Color.WHITE);
        button.setBackground(new Color(102, 133, 255)); // Set background color to match provided image
        button.setFocusPainted(false); // Remove focus border

        // Set button size and shape
        Dimension buttonSize = new Dimension(180, 40); // Set preferred size
        button.setPreferredSize(buttonSize);
        button.setMinimumSize(buttonSize);
        button.setMaximumSize(buttonSize);

        // Create a rounded rectangle border
        Border roundedBorder = BorderFactory.createEmptyBorder(5, 15, 5, 15); // Adjust padding as needed
        button.setBorder(BorderFactory.createCompoundBorder(
                roundedBorder,
                BorderFactory.createLineBorder(new Color(102, 133, 255), 2))); // Add line border for better visibility

        // Add action listener for button clicks (example: show message dialog)
        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(Dashboard.this,
                    text + " functionality will be implemented here.");
        });

        return button;
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setForeground(Color.WHITE);
        button.setBackground(new Color(102, 133, 255)); // Set background color to match provided image
        button.setFocusPainted(false); // Remove focus border

        // Set button size and shape
        Dimension buttonSize = new Dimension(180, 40); // Set preferred size
        button.setPreferredSize(buttonSize);
        button.setMinimumSize(buttonSize);
        button.setMaximumSize(buttonSize);

        // Create a rounded rectangle border
        Border roundedBorder = BorderFactory.createEmptyBorder(5, 15, 5, 15); // Adjust padding as needed
        button.setBorder(BorderFactory.createCompoundBorder(
                roundedBorder,
                BorderFactory.createLineBorder(new Color(102, 133, 255), 2))); // Add line border for better visibility

        // Add action listener for button clicks (example: show message dialog)
        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(Dashboard.this,
                    text + " functionality will be implemented here.");
        });

        return button;
    }

    public static void main(String[] args) {
        // Create the dashboard frame
        SwingUtilities.invokeLater(() -> new Dashboard());
    }
}
