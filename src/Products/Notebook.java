package Products;

public class Notebook extends Product {

    private int pageCount;
    private boolean isHardCover;
    public int NOTE_ID = 1;

    public Notebook(String title, Double price, int pageCount, boolean isHardCover) {
        super(title, price);
        setHardCover(isHardCover);
        setPageCount(pageCount);
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
        int intid = 2000 + NOTE_ID;
        NOTE_ID++;
        return String.valueOf(intid);
    }
}
