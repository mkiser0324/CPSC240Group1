public class BookRate{
    private Book book;
    private User user;
    private int rating;
    public BookRate(Book book, User user, Rating rating){
        this.book = book;
        this.user = user;
        this.rating = rating;
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }

    public int getRating() {
        return rating;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setUser(User user) {
        this.user = user;
    }
}