

import java.util.ArrayList;

public class Book {
    private int id;

    private String title;
    private String author;
    private int year;
    private Genre genre;
    private ArrayList<Note> list;
    public double rating;

    public Book( int id,Genre genre, String title, String author,  int year){
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
        this.list = new ArrayList<>();
    }

    public Book(int id, String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.list = new ArrayList<Note>();
        this.rating =rating;
    }

    public int getId() {

        return id;
    }

    public String getTitle(){

        return title;
    }

    public void setTitle(String title){

        this.title = title;
    }

    public String getAuthor(){

        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Genre getGenre(){
        return genre;
    }

    public void setGenre(Genre genre){
        this.genre = genre;
    }

    public void addNote(String note){
        Note test = new Note();
        test.setNotes(note);
        this.list.add(test);

    }

    public ArrayList<Note> getNotes(){

        return this.list;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }


}
