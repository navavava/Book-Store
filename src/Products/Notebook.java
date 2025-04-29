package Products;

public class Notebook extends Product {

    private int pageCount;
    private boolean isHardCover;

    public Notebook(String title, Double price, String id) {
        super(title, price, id);
    }

    public int getPageCount() {
        return pageCount;
    }

    public boolean isHardCover() {
        return isHardCover;
    }

    public void setPageCount(int pageCount) {
        if (pageCount > 0)
            this.pageCount = pageCount;
        else
            System.out.println("Error: invalid page count!");
    }

    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }

    @Override
    public String toString() {
        return (super.toString() + ", Page count: " + pageCount + ", Is hard cover: " + isHardCover);
    }

    @Override
    protected String generateId() {
        return "2";
    }
}
