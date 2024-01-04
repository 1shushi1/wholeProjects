package collections.hashMap.wareHouseHashMap;

public class Product {
    private String title;
    private int amount;
    private double price;

    public Product(String title, int amount, double price) {
        this.title = title;
        this.amount = amount;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void info(){
        System.out.println("Product you are selected with the name : " + title + ". Price : " + price + ". Amount : " + amount + ".");
    }
}
