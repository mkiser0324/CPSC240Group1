
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
public class BookList{
    private static BookList instance;
    private ArrayList<Book> books;
    private HashMap<Book, BookRate> ratings;

    public BookList() {
        books = new ArrayList<>();
        ratings = new HashMap<>();
        readBooksFromFile();
    }

    public static BookList getInstance() {
        if (instance == null) {
            instance = new BookList();
        }
        return instance;
    }


    public ArrayList<Book> getBookList() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }


    private void readBooksFromFile() {
        try {
            File file = new File("books.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String title = parts[1];
                String author = parts[2];
                int year = Integer.parseInt(parts[3]);


                Book book = new Book(id,title,author,year);
                addBook(book);


            }

            scanner.close();
            System.out.println("Books read from file successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (Exception e) {
            System.out.println("Error reading from file!");
            e.printStackTrace();
        }
    }
    public HashMap<Book, BookRate> getRatings() {
        return ratings;
    }

    public void rateBook(Book book, User user, double rating) {
        if (ratings.containsKey(book)) {
            ratings.get(book).addRating(user, rating);
        }
    }



}