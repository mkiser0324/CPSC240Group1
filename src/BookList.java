
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class BookList{
    private static BookList instance;
    private ArrayList<Book> bookList;

    private BookList() {
        bookList = new ArrayList<Book>();
        readBooksFromFile();
    }

    public static BookList getInstance() {
        if (instance == null) {
            instance = new BookList();
        }
        return instance;
    }


    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void removeBook(Book book) {
        bookList.remove(book);
    }

    public Book getBookById(int id) {
        for (Book book : bookList) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
    private void readBooksFromFile() {
        try {
            File file = new File("books.txt");
            Scanner scanner = new Scanner(file);

            int id = 1;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String title = parts[0];
                String author = parts[1];
                int year = Integer.parseInt(parts[2]);

                Book book = new Book(id,title,author,year);
                addBook(book);
                id++;
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: books.txt not found.");
        }
    }
}