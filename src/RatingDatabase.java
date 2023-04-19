import java.util.HashMap;

public class RatingDatabase {
    private HashMap<User, HashMap<Book, Double>> ratings;

    public RatingDatabase() {
        this.ratings = new HashMap<>();
    }

    public void addRating(User user, Book book, double rating) {
        if (!ratings.containsKey(user)) {
            ratings.put(user, new HashMap<>());
        }
        ratings.get(user).put(book, rating);
    }

    public double getRating(User user, Book book) {
        if (ratings.containsKey(user)) {
            HashMap<Book, Double> userRatings = ratings.get(user);
            if (userRatings.containsKey(book)) {
                return userRatings.get(book);
            }
        }
        return -1.0;
    }
}
