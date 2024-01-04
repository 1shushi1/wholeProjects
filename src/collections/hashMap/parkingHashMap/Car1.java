package collections.hashMap.parkingHashMap;

import java.util.Scanner;

public class Car1 {
    public boolean price;
    private String brand;
    private String model;
    private String carPlate;
    private String colour;
    private long time;

    public Car1(String brand, String model, String carPlate, String colour) {
        this.brand = brand;
        this.model = model;
        this.carPlate = carPlate;
        this.colour = colour;
        time = System.currentTimeMillis();
    }

    public Car1() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a brand name");
        brand = s.nextLine();
        System.out.println("Enter a model name");
        model = s.nextLine();
        System.out.println("Enter a carPlate number");
        carPlate = s.nextLine();
        System.out.println("Enter a colour of the car");
        colour = s.nextLine();
        time = System.currentTimeMillis();
    }

    public String getBrand() {

        return brand;
    }

    public String getModel() {

        return model;
    }

    public String getCarPlate() {

        return carPlate;
    }

    public long getTime() {

        return time;
    }

    public String getColour() {

        return colour;
    }

    public void info() {
        System.out.println("Your car is " + brand + ". Your car model is " + model + ". Your car plate number is " + carPlate);
    }
}
