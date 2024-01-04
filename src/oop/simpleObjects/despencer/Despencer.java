package oop.simpleObjects.despencer;

import java.util.Arrays;
import java.util.Scanner;

public class Despencer {
    Scanner s = new Scanner(System.in);
    private Product[] products;

    public Despencer() {
        products = new Product[5];
        Product water = new Product("Water", 7, 10, 10);
        Product twix = new Product("Twix", 9, 10, 40);
        Product gum = new Product("HubbaBubba", 3, 10, 50);
        Product cookies = new Product("Ahoy, Chips", 12, 10, 15);
        Product crisps = new Product("Water", 9, 10, 15);
        products[0] = water;
        products[1] = twix;
        products[2] = gum;
        products[3] = cookies;
        products[4] = crisps;
        menu();
    }

    private void menu() {
        while (true) {
            System.out.println("Select : 1 - buy, 2 - fill up storage with products, 3 - exit");
            int sel = s.nextInt();
            switch (sel) {
                case 1 -> buy();
                case 2 -> fillUpTheStorage();
                case 3 -> System.exit(0);
            }
        }
    }
    private void buy() {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getAmount() > 0) {
                System.out.print(i + " ");
                products[i].info();
            }
        }
        System.out.println("Select a product");
        int selection = s.nextInt();
        Product productSelection = products[selection];
        System.out.println("Products left " + productSelection.getAmount());
        System.out.println("You have to pay " + productSelection.getPrice());

        int moneyInput = 0;
        do {
            System.out.println("Please put the banknote inside");
            moneyInput += s.nextInt();
        }
        while (moneyInput < productSelection.getPrice());
        int change = moneyInput - productSelection.getPrice();
        int counter = 0;
        int finalChange = 0;
        if (change / 100 != 0) {
            counter = change / 100;
            System.out.println("You've got " + counter + " - 100");
            change -= counter * 100;
            finalChange += counter * 100;
            counter = 0;

        }
        if (change / 50 != 0) {
            counter = change / 50;
            System.out.println("You got " + counter + " - 50");
            change -= counter * 50;
            finalChange += counter * 50;
            counter = 0;

        }
        if (change / 20 != 0) {
            counter = change / 20;
            System.out.println("You got " + counter + " - 20");
            change -= counter * 20;
            finalChange += counter * 20;
            counter = 0;
        }
        if (change / 10 != 0) {
            counter = change / 10;
            System.out.println("You got " + counter + " - 10");
            change -= counter * 10;
            finalChange += counter * 10;
            counter = 0;
        }
        if (change / 5 != 0) {
            counter = change / 5;
            System.out.println("You got " + counter + " - 5");
            change -= counter * 5;
            finalChange += counter * 5;
            counter = 0;

        }
        if (change / 2 != 0) {
            counter = change / 2;
            System.out.println("You got " + counter + " - 2");
            change -= counter * 2;
            finalChange += counter * 2;
            counter = 0;

        }
        if (change / 1 != 0) {
            counter = change / 1;
            System.out.println("You got " + counter + " - 1");
            change -= counter * 1;
            finalChange += counter * 1;
            counter = 0;

        }
        System.out.println("Your change is " + finalChange);
    }

    public void fillUpTheStorage() {
        for (int i = 0; i < products.length; i++) {
            products[i].setAmount(products[i].getDispenserSpace());
            products[i].info();
        }
    }
}
