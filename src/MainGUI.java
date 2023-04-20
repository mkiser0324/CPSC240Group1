import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class MainGUI extends JFrame {

    private CardLayout cardLayout;
    private JPanel cardPanel,bookListPanel,bookInfoPanel;
    private UserDatabase userDatabase;
    private BookList bookList;
    private RatingDatabase ratingDatabase;
    private User currentUser;

    public MainGUI() {
        super("Book Rating Application");

        // initialize user database
        userDatabase = new UserDatabase();
        String newuser;
        userDatabase.addUser("johndoe","password", "John", "Doe");

        // initialize book list
        bookList = BookList.getInstance();

        // initialize rating database
        ratingDatabase = new RatingDatabase();

        // initialize GUI components
        JPanel loginPanel = new LoginPanel();
        JPanel registrationPanel = new RegistrationPanel();
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // add panels to card layout
        cardPanel.add(loginPanel, "login");
        cardPanel.add(registrationPanel, "registration");
        cardPanel.add(bookListPanel, "booklist");
        cardPanel.add(bookInfoPanel, "bookinfo");

        // add card panel to frame
        add(cardPanel);

        // set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}