package Products;

public class Accessory extends Product{
    public Accessory(String title, Double price, String id) {
        super(title, price, id);
    }

    @Override
    protected String generateId() {
        return "";
    }
}
