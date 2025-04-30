package Products;

import Inventory.Inventory;

public class Accessory extends Product {

    private String color;
    public static int ACC_ID = 1;

    public Accessory(String title, Double price, String color) {
        super(title, price);
        setColor(color);
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
        if (ACC_ID > 999)
            throw new IndexOutOfBoundsException();
        int intid = 3000 + ACC_ID;
        ACC_ID++;
        return String.valueOf(intid);
    }
}
