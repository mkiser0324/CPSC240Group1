import java.util.HashMap;

public class BookRate {
    private HashMap<User, Double> ratings;

    public BookRate() {
        this.ratings = new HashMap<>();
    }

    public void addRating(User user, double rating) {
        ratings.put(user, rating);
    }

    public HashMap<User, Double> getRatings() {
        return ratings;
    }
}