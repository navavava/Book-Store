package Products;

public abstract class Product {
    private String title;
    private Double price;
    private String id;

     public Product(String title, Double price, String id){
        this.title = title;
        this.price = price;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }

    public void setTitle(String title){
         if(!title.isEmpty())
             this.title = title;
         else
             System.out.println("Error: invalid title!");
    }

    public void setId(String id) {
        int intID = Integer.parseInt(id);
        this.id = id;
    }

    public void setPrice(Double price){
         if(!(price < 0))
             this.price = price;
         else
             System.out.println("Error: invalid price!");
    }

    @Override
    public String toString(){
         return ("ID: " + id + ", Title: " +title + ", Price: " + price);
    }

    protected abstract String generateId();
}
