import java.util.HashMap;

public class RatingDatabase{

    private HashMap<int, Bookrating> bookRating = new HashMap<int, Bookrating>();

    public RatingDatabase(){};

    public RatingDatabase getInstance(){}

    public void addBookRating(int bookId, int rating){}

    public int getBookRating(int bookId){}

}