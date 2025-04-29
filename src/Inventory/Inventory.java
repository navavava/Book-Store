package Inventory;

import Products.Product;

import java.util.ArrayList;

public class Inventory<T extends Product> {
    private ArrayList<T> items;

    public ArrayList<T> getItems() {
        return items;
    }

    public void applyDiscount(String productName, int discount) {
        for (T t : items) {
            if (t.getTitle().equals(productName))
                t.setPrice((t.getPrice() * ((100 - discount) / 100)));
        }
    }


    public void addItem(T t) {
        items.add(t);
    }

    public void removeItemById(int id) {
        items.removeIf(t -> t.getId().equals(String.valueOf(id)));
    }

    public T findItemsById(int id) {
        for (T t : items) {
            if (t.getId().equals(String.valueOf(id)))
                return t;
        }
        System.out.println("Error: item with this id not found!");
        return null;
    }

    public void displayAll() {
        for (T t : items) {
            System.out.println(t.toString() + "\n");
        }
    }
}
