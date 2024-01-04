package oop.simpleObjects.despencer;

public class Product {
    private String nameOfTheProduct;
    private int price;
    private int amount;
    private int dispenserSpace;

    public Product(String nameOfTheProduct, int price, int amount, int dispenserSpace){
        this.nameOfTheProduct = nameOfTheProduct;
        this.price = price;
        this.amount = amount;
        this.dispenserSpace = dispenserSpace;
    }
    public void setDispenserSpace(int dispenserSpace){
        this.dispenserSpace = dispenserSpace;
    }
    public int getDispenserSpace(){
        return dispenserSpace;
    }
    public int getAmount(){
        return amount;
    }
    public int getPrice(){
        return price;
    }
    public String getNameOfTheProduct(){
        return getNameOfTheProduct();
    }
    public void setAmount(int amountDecrease){
        this.amount = 8;
    }
    public void info(){
        System.out.println(nameOfTheProduct + " it's price is : " + price + ". Amount left : " + amount);
    }
}
