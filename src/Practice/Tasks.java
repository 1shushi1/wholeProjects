package Practice;

import jdk.dynalink.NamedOperation;

public class Tasks {
    public static void main(String[] args) {
        triangle(4);
        cash(53, 238);

    }

    public static void cash(int productPrice, int money) {
        int change = money - productPrice;
        System.out.println();
        System.out.println("Your total change is : " + change);
        if (change / 100 != 0) {
            int amount = change / 100;
            change -= amount * 100;
            System.out.println();
            System.out.println("Your change is : " + amount + " " + "unit(s) of 100");
        }
        if (change / 50 != 0) {
            int amount = change / 50;
            change -= amount * 50;
            System.out.println("Your change is : " + amount + " " + "unit(s) of 50");
        }
        if (change / 20 != 0) {
            int amount = change / 20;
            change -= amount * 20;
            System.out.println("Your change is : " + amount + " " + "unit(s) of 20");
        }
        if (change / 10 != 0) {
            int amount = change / 10;
            change -= amount * 10;
            System.out.println("Your change is : " + amount + " " + "unit(s) of 10");
        }
        if (change / 5 != 0) {
            int amount = change / 5;
            change -= amount * 5;
            System.out.println("Your change is : " + amount + " " + "unit(s) of 5");
        }
        if (change > 0 ){
            System.out.println("Your change is : " + change + " " + "unit(s) of 1");
        }
    }

    public static void triangle(int value) {
        for (int i = 0; i <= value; i++) {
            System.out.println();
            for (int j = i; j >= 0; j--) {
                System.out.print(j);
            }
        }
    }
}
