package oop.simpleObjects.warehouse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Storage {
    Scanner s = new Scanner(System.in);
    private Product[][] products;

    //масив в якому лежить конфігурація нашого масива
    public Storage(int[] config) {
        products = new Product[config.length][];
        for (int i = 0; i < config.length; i++) {
            products = new Product[config.length][config[i]];
//            System.out.println(Arrays.toString(products[i]));
        }
        Product product = new Product("banana", 100, 50);
        Product product1 = new Product("apple", 250, 45);
        Product product2 = new Product("watermelon", 50, 90);
        Product product3 = new Product("orange", 130, 32);
        products[0][2] = product;
        products[1][3] = product1;
        products[0][0] = product2;
        products[2][4] = product3;
        menu();
    }

    public void find() {
        System.out.println("Select a criteria in which you want to find a product");
        System.out.println("Select one of three numbers 'find product by': 1 - name and price, 2 - by name, 3 - check a running out products");
        int sel = s.nextInt();
        switch (sel) {
            case 1 -> byNameAndPrice();
            case 2 -> byName();
            case 3 -> listOfProduct();
        }
    }

    public void byNameAndPrice() {
        System.out.println("Enter a name for the product");
        String nameFounder = s.next();
        System.out.println("Enter a price you want to find");
        int priceFounder = s.nextInt();
        int counter = 0;
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products[i].length; j++) {
                if (products[i][j] != null && (nameFounder.equals(products[i][j].getNameOfTheProduct()))
                        && priceFounder == products[i][j].getPrice()) {
                    products[i][j].info();
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("Sorry, requested product not found");
        }
    }

    public void byName() {
        System.out.println("Enter a name for the product");
        String nameFounder = s.next();
        int counter = 0;
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products[i].length; j++) {
                if (products[i][j] != null && (nameFounder.equals(products[i][j].getNameOfTheProduct()))) {
                    products[i][j].info();
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("Sorry, requested product not found");
        }
    }
    //Print a list of goods that are running out of stock or have expired
    //Пропускає if statements
//    public void listOfProducts() {
//        for (int i = 0; i < products.length; i++) {
//            for (int j = 0; j < products[i].length; j++) {
//                if (products[i][j] != null) {
//                    if (products[i][j].getAmount() == 0) {
//                        products[i][j].infoForRunningOutProducts();
//                    }
//                }
//                 else if (products[i][j] != null && products[i][j].getAmount() <= 15) {
//                    System.out.println("Small amount of products left " + products[i][j].getAmount());
//                }
//            }
//        }
//    }
    public void listOfProduct() {
            for (int i = 0; i < products.length; i++) {
                for (int j = 0; j < products[i].length; j++) {
                    Product currentProduct = products[i][j];
                    if (currentProduct != null) {
                        if (currentProduct.getAmount() < 15) {
                            currentProduct.infoForRunningOutProducts();
                        }
                        if (currentProduct.getAmount() == 0){
                            System.out.println("This product is not available right now");
                        }
                    }
                }
            }
        }

    public void add() {
        System.out.println("Enter the name of the product you want to store");
        String name = s.next();
        System.out.println("Enter an amount of the products you want to store");
        int amount = s.nextInt();
        System.out.println("Select price for your product");
        int price = s.nextInt();
        int freeShelf = -1;
        int freeCell = -1;
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products[i].length; j++) {
                if (products[i][j] != null && (name.equals(products[i][j].getNameOfTheProduct()) && price == products[i][j].getPrice())) {
                    products[i][j].setAmount(products[i][j].getAmount() + amount);
                    products[i][j].info();
                    return;
                }
                if (products[i][j] == null && freeShelf == -1) {
                    freeShelf = i;
                    freeCell = j;
                }
            }
        }
        if (freeShelf != -1) {
            products[freeShelf][freeCell] = new Product(name, amount, price);
            System.out.println("You've put a product on a shelf level " + freeShelf + " and cell position " + freeCell);
        } else {
            System.out.println("No free space left");
        }
    }

    public void take() {
        System.out.println("Enter a product name which you want to take");
        String productForTake = s.next();
        System.out.println("Enter a product price");
        int productPrice = s.nextInt();
        System.out.println("Enter an amount you would like to take");
        int amountToTake = s.nextInt();
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products[i].length; j++) {
                if (products[i][j] != null && (productForTake.equals(products[i][j].getNameOfTheProduct()))
                        && productPrice == products[i][j].getPrice()) {
                    if (products[i][j] != null && (amountToTake <= products[i][j].getAmount())) {
                        products[i][j].setAmount(products[i][j].getAmount() - amountToTake);
                        System.out.println("You are left with " + products[i][j].getAmount());
                    } else {
                        System.out.println("You took " + products[i][j].getAmount() + " amount with product price " + products[i][j].getPrice());
                        products[i][j].setAmount(0);
                        System.out.println("You are left with " + products[i][j].getAmount());
                    }
                    return;
                }
            }
        }
        System.out.println("No products with such price or name found");
    }

    public void menu() {
        while (true) {
            System.out.println("Enter a number : 1 - to find products, 2 - to add products, 3 - to take products away, 4 - to exit a program");
            int selection = s.nextInt();
            switch (selection) {
                case 1 -> find();
                case 2 -> add();
                case 3 -> take();
                case 4 -> System.exit(0);
            }
        }
    }
}
