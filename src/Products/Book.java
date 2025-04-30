package Products;

public class Book extends Product {

    private String author;
    private String publication;
    private String genre;
    public static int BOOK_ID = 1;

    public Book(String title, Double price, String author, String publication, String genre) {
        super(title, price);
        setAuthor(author);
        setPublication(publication);
        setGenre(genre);

    }

    public String getAuthor() {
        return author;
    }

    public String getPublication() {
        return publication;
    }

    public String getGenre() {
        return genre;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    protected String generateId() {
        if (BOOK_ID > 999)
            throw new IndexOutOfBoundsException();
        int intid = 1000 + BOOK_ID;
        BOOK_ID++;
        return String.valueOf(intid);
    }

    @Override
    public String toString() {
        return (super.toString() + ", Author: " + author + ", Genre: " + genre + ", Publication: " + publication);
    }
}
