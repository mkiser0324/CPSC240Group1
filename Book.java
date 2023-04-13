import java.util.ArrayList;

public class Book {

    private String title;
    private String author;
    private String description;
    private Genre genre;
    private ArrayList<Note> list;
    private int id;
    public double rating;

    public Book(int id, String author, String description, Genre genre){}

    public String getTitle(){
        return "";
    }

    public void setTitle(String title){}

    public String getAuthor(){
        return "";
    }

    public void setAuthor(String author){}

    public String getDescription(){
        return "";
    }

    public void setDescription(String description){}

    public Genre getGenre(){
        return Genre.fiction;
    }

    public void setGenre(Genre genre){}

    public void addNote(Note note){}

    public ArrayList<Note> getNotes(){
        return new ArrayList<>();
    }

    public String getId(){
        return "";
    }

    public double getRating(){
        return 0;
    }

    public void setRating(double rating){}
}
