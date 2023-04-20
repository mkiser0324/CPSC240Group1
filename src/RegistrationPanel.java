import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationPanel extends JPanel {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JButton registerButton;
    private JLabel errorMessageLabel;

    private UserDatabase userDatabase;

    public RegistrationPanel() {
        this.userDatabase = userDatabase;

        // Initialize components
        JLabel titleLabel = new JLabel("Registration");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        firstNameField = new JTextField(20);
        lastNameField = new JTextField(20);
        registerButton = new JButton("Register");
        errorMessageLabel = new JLabel("");
        errorMessageLabel.setForeground(Color.RED);

        // Add components to panel
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.insets = new Insets(0, 0, 20, 0);
        add(titleLabel, c);
        c.gridy++;
        c.gridwidth = 1;
        add(new JLabel("Username:"), c);
        c.gridx++;
        add(usernameField, c);
        c.gridx = 0;
        c.gridy++;
        add(new JLabel("Password:"), c);
        c.gridx++;
        add(passwordField, c);
        c.gridx = 0;
        c.gridy++;
        add(new JLabel("First name:"), c);
        c.gridx++;
        add(firstNameField, c);
        c.gridx = 0;
        c.gridy++;
        add(new JLabel("Last name:"), c);
        c.gridx++;
        add(lastNameField, c);
        c.gridx = 0;
        c.gridy++;
        c.gridwidth = 2;
        c.insets = new Insets(0, 0, 0, 0);
        add(registerButton, c);
        c.gridy++;
        add(errorMessageLabel, c);

        // Register button listener
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get user input
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();

                // Validate user input
                if (username.isEmpty() || password.isEmpty() || firstName.isEmpty() || lastName.isEmpty()) {
                    errorMessageLabel.setText("Please fill in all fields.");
                } else if (userDatabase.containsUser(username)) {
                    errorMessageLabel.setText("Username already taken.");
                } else {
                    // Create new user and add to database
                    User newUser = new User(username, password, firstName, lastName);
                    userDatabase.addUser(newUser);
                    // Clear input fields and error message
                    usernameField.setText("");
                    passwordField.setText("");
                    firstNameField.setText("");
                    lastNameField.setText("");
                    errorMessageLabel.setText("");
                    // Display success message
                    JOptionPane.showMessageDialog(null, "Registration successful.");
                }
            }
        });
    }


}

