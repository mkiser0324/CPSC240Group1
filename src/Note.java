//Represents a note for a book
public class Note {

    private Book book;
    private String notes;
    //Creates a note that is added to a book
    public Note(){
        this.book = book;
        this.notes = notes;
    }
    //returns the book which the note is on
    public Book getBook(){
        return book;
    }

    //returns the notes on the book
    public String getNotes(){

        return notes;
    }
    //sets notes on a specific book
    public void setNotes(String notes){

        this.notes = notes;
    }

}
