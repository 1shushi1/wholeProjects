package oop.simpleObjects.warehouse;

public class Product {
    private String nameOfTheProduct;
    private double weight;
    private int amount;
    private int price;

    public Product(String nameOfTheProduct, int amount, int price){
        this.amount = amount;
        this.nameOfTheProduct = nameOfTheProduct;
        this.price = price;
    }
    public int getAmount(){
        return amount;
    }
    public int getPrice(){
        return price;
    }
    public String getNameOfTheProduct(){
        return nameOfTheProduct;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void info(){
        System.out.println(nameOfTheProduct + " costs : " + price + ". Available amount " + amount);
    }
    public void infoForRunningOutProducts(){
        System.out.println("You are running out of products " + nameOfTheProduct + ". Available amount "
                + amount);
    }
}
