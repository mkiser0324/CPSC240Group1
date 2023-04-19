import javax.swing.*;

public class Registration {
    public static void main(String[] args) {
        UserDatabase userDatabase = new UserDatabase();
        RegistrationPanel registrationPanel = new RegistrationPanel(userDatabase);

        JFrame frame = new JFrame("Registration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.getContentPane().add(registrationPanel);
        frame.setVisible(true);
    }
}
