package Products;

public class Book extends Product {

    private String author;
    private String publication;
    private String genre;

    public Book(String title, Double price, String id, String author, String publication, String genre) {
        super(title, price, id);

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
        return "1";
    }

    @Override
    public String toString() {
        return (super.toString() + ", Author: " + author + ", Genre: " + genre + ", Publication: " + publication);    }
}
