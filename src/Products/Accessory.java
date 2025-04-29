package Products;

public class Accessory extends Product {

    private String color;

    public Accessory(String title, Double price, String id) {
        super(title, price, id);
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        if (!color.isEmpty())
            this.color = color;
        else
            System.out.println("Error: invalid color!");
    }

    @Override
    public String toString() {
        return (super.toString() + ", Color: " + color);
    }

    @Override
    protected String generateId() {
        return "3";
    }
}
