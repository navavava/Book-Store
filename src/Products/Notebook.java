package Products;

public class Notebook extends Product {
    public Notebook(String title, Double price, String id) {
        super(title, price, id);
    }

    @Override
    protected String generateId() {
        return "";
    }
}
