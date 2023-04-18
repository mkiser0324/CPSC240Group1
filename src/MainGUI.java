

import javax.swing.*;

public class MainGUI {

    //title
    private Jframe frame = new Jframe ("Book Tracker");
    private BookList bookList;
    private UserDatabase userDB;
    JButton newBookButton
    JButton bookButton;
    private JTextField searchText;
    private CardLayout layout;
    private Jtable table;
    public MainGUI(){}

    //button to add new book
    public void newBook(){
        newBookButton = new JButton("Add a new book");
        frame.getContentPane().add(newBookButton);
        if (newBookButton.clicked()) {
            //have user input this info:
            //title
            JTextField titleInput = new JTextField("");
            //author
            JTextField authorInput = new JTextField("");
            //description
            JTextField descriptionInput = new JTextField("");
            //genre
            JTextField genreInput = new JTextField("");
            //notes
            JTextField notesInput = new JTextField("");
            //id number
            JTextField idNumInput = new JTextField("");
        }
    }

    //button to access existing books
    public void oldBook(){
        oldBookButton = new JButton("Look at existing books");
        frame.getContentPane().add(bookButton);
        if (oldBookButton.clicked()){
            //print list of existing books
        }
    }
    //frame and window close
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //display
    frame.pack();
    frame.setVisible(true);


}