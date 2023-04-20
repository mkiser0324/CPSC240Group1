import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainGUI extends JFrame {

    private CardLayout cardLayout;
    private JPanel cardPanel;

    private RegistrationPanel registrationPanel;
    private LoginPanel loginPanel;
    private BookList bookList;
    private RatingDatabase ratingDatabase;
    private UserDatabase userDatabase;

    public MainGUI() {
        // Set up JFrame
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                JOptionPane.showMessageDialog(null, "Thank you for using us");
                dispose();
            }
        });
        setSize(600, 400);
        setLayout(new BorderLayout());
        // Set up card layout and panels
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        add(cardPanel, BorderLayout.CENTER);

        // Set up user database
        userDatabase = new UserDatabase();

        // Set up registration panel
        registrationPanel = new RegistrationPanel();
        registrationPanel.setRegistrationButtonListener(new RegistrationButtonListener());
        cardPanel.add(registrationPanel, "registrationPanel");

        // Set up login panel
        loginPanel = new LoginPanel();
        loginPanel.setLoginButtonListener(new LoginButtonListener());
        cardPanel.add(loginPanel, "loginPanel");

        // Set up book list
        BookList bookList2 = new BookList();
        //bookList.setRatingButtonListener(new RatingButtonListener());
       // cardPanel.add(bookList2,"Booklisrt");

        // Set up rating database
        ratingDatabase = new RatingDatabase();

        // Show login panel
        cardLayout.show(cardPanel, "loginPanel");
    }

    class RegistrationButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            new RegistrationPanel();
            cardLayout.show(cardPanel, "loginPanel");
        }

    }

    class LoginButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            new LoginPanel();
            cardLayout.show(cardPanel, "bookList");
        }
    }
}
