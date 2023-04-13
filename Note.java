public class Note {

    private Book book;
    private String notes;
    public Note(Book book, String notes){}

    public Book getBook(){
        //put basic parameters in to avoid the error message
        //fix later
        return book = new Book(0, "author", "good book",Genre.fiction);
    }

    public void setBook(Book book){}

    public String getNotes(){
        return "";
    }

    public void setNotes(String notes){}

}
