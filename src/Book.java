import java.util.ArrayList;
//represents a book
public class Book {
    private int id;
    private String title;
    private String author;
    private int year;
    private ArrayList<Note> notes;
    private double rating;
    private Genre genre;
    //creates a new book with an id, title, author, and year
    public Book(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.rating = Math.random() * 5;
        this.notes = new ArrayList<>();
        this.genre = genre;
    }

    //returns book's id
    public int getId() {
        return id;
    }
    //retruns book's title
    public String getTitle() {
        return title;
    }
    //returns book's author
    public String getAuthor() {
        return author;
    }
    //returns book's year
    public int getYear() {
        return year;
    }
    //returns book's rating
    public double getRating() {
        return rating;
    }
    //returns book's genre
    public Genre getGenre(){
        return genre;
    }
    //returns notes for book
    public ArrayList<Note> getNotes() {
        return notes;
    }
    //set new rating for book
    public void setRating(double rating) {
        this.rating = rating;
    }
    //set new genre for book
    public void setGenre(Genre genre) {
        this.genre = genre;
}
    //adds a new note to a book
    public void addNote(Note note) {
        notes.add(note);
    }
    //prints books parameters
    @Override
    public String toString() {
        return id + ". " + title + " by " + author + " (" + year + ")";
    }
}
