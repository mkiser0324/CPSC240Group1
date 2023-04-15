public class Note {

    private Book book;
    private String notes;
    public Note(Book book, String notes){
        this.book = book;
        this.notes = notes;
    }

    public Book getBook(){
        return book;
    }

    public void setBook(Book book){
        this.book = book;
    }

    public String getNotes(){

        return notes;
    }

    public void setNotes(String notes){
        this.notes = notes;
    }

}
