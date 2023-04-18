

import java.util.HashMap;

public class RatingDatabase{
    private static RatingDatabase instance;
    private HashMap<Integer, BookRate> bookRatings;
    public static RatingDatabase getInstance() {
        if (instance == null) {
            instance = new RatingDatabase();
        }
        return instance;
    }

    public RatingDatabase(){};



    public void addBookRating(BookRate bookRating) {
        bookRatings.put(bookRating.getBook(), bookRating);
    }

    public int getBookRating(int bookId){}

}