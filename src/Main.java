import Inventory.Inventory;
import Products.Accessory;
import Products.Book;
import Products.Notebook;
import Products.Product;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("MAN", 205d, "Yaraki", "Yarak", "Sci-fi");
        Book book2 = new Book("Pride and prejudice", 150d, "Kiana", "Pahlavan", "Romance");
        Notebook note1 = new Notebook("note 1", 100d, 50, true);
        Notebook note2 = new Notebook("note 2", 130d, 70, false);
        Accessory keyChain = new Accessory("key chain", 35d, "red");
        Accessory ring = new Accessory("ring", 25d, "black");
        Inventory<Book> books = new Inventory<Book>();
        books.addItem(book1);
        books.addItem(book2);
        Inventory<Notebook> notebooks = new Inventory<Notebook>();
        notebooks.addItem(note1);
        notebooks.addItem(note2);
        Inventory<Accessory> accessories = new Inventory<Accessory>();
        accessories.addItem(keyChain);
        accessories.addItem(ring);
        System.out.println("BOOKS:");
        books.displayAll();
        System.out.println();
        System.out.println("NOTEBOOKS:");
        notebooks.displayAll();
        System.out.println();
        System.out.println("ACCESSORIES:");
        accessories.displayAll();
        System.out.println();
        notebooks.removeItemById(2001);
        accessories.removeItemById(3001);
        System.out.println("Total price of books: " + calculateTotalPrice(books));
        System.out.println("Total price of notebooks: " + calculateTotalPrice(notebooks));
        System.out.println("Total price of accessories:" + calculateTotalPrice(accessories));
        System.out.println(books.findItemsById(1001).toString());
        System.out.println(accessories.findItemsById(3001).toString());
        books.applyDiscount("MAN", 30);
        books.applyDiscount("Pride and prejudice", 20);
        System.out.println("BOOKS:");
        books.displayAll();
        System.out.println();
        System.out.println("NOTEBOOKS:");
        notebooks.displayAll();
        System.out.println();
        System.out.println("ACCESSORIES:");
        accessories.displayAll();
        System.out.println();

    }

    public static double calculateTotalPrice(Inventory<? extends Product> inventory) {
        double total = 0;
        for (Product p : inventory.getItems()) {
            total += p.getPrice();
        }

        return total;
    }
}