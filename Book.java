import java.util.ArrayList;

public class Book {

    private String title;
    private String author;
    private String description;
    private Genre genre;
    private ArrayList<Note> list;
    private int id;
    public double rating;

    public Book(String title, int id, String author, String description, Genre genre){
        this.title = title;
        this.id = id;
        this.author = author;
        this.description = description;
        this.genre = genre;
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

    public void setAuthor(String author){this.author = author;}

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){this.description = description;}

    public Genre getGenre(){
        return genre;
    }

    public void setGenre(Genre genre){this.genre = genre;}

    public void addNote(Note note){

    }

    public ArrayList<Note> getNotes(){
        return new ArrayList<>();
    }

    public String getId(){
        return id;
    }

    public double getRating(){
        return rating;
    }

    public void setRating(double rating){this.rating = rating;}
}
