import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.HashMap;


// this class contains the method called when the exit choice is picked
class ExitListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
public class MainGUI extends JFrame {


    public static void main(String[] args) {
         CardLayout cardLayout;
         JPanel cardPanel;
         JPanel bookListPanel = new JPanel();
         JPanel bookInfoPanel = new JPanel();
         UserDatabase userDatabase;
         RatingDatabase ratingDatabase;
         User currentUser;
        JFrame frame = new JFrame("Book Rating Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create the menu bar
        JMenuBar menubar = new JMenuBar();

        // add a menu item
        JMenuItem exit = new JMenuItem("Exit", null);
        exit.setMnemonic(KeyEvent.VK_E);
        exit.setToolTipText("Exit the program");

        // add the file menu
        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);

        // add the action as a new anonymous object
        exit.addActionListener(new ExitListener());
        file.add(exit);

        // initialize user database
        userDatabase = new UserDatabase();
        User newuser = new User("johndoe", "skyrocket", "John", "Doe");
        userDatabase.addUser(newuser);

        // initialize book list
        BookList bookList = BookList.getInstance();

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
        frame.getContentPane().add(cardPanel);

        // set frame properties
       // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
