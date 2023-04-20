

import java.util.ArrayList;

public class Book {
    private int id;
    private String title;
    private String author;
    private int year;
    private ArrayList<Note> notes;
    private double rating;
    private Genre genre;

    public Book(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.rating = Math.random() * 5;
        this.notes = new ArrayList<>();
        this.genre = genre;
    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
public Genre getGenre(){
        return genre;
}

public void setGenre(Genre genre) {
        this.genre = genre;
}
    public ArrayList<Note> getNotes() {
        return notes;
    }

    public void addNote(Note note) {
        notes.add(note);
    }

    @Override
    public String toString() {
        return id + ". " + title + " by " + author + " (" + year + ")";
    }
}
