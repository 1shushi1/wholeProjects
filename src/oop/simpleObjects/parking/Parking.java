package oop.simpleObjects.parking;

import java.util.Arrays;
import java.util.Scanner;

public class Parking {
    Scanner s = new Scanner(System.in);
    private Car[][] arr2DParking;

    public Parking() {
        System.out.println("Enter an amount of floors");
        int parkingFloors = s.nextInt();
        arr2DParking = new Car[parkingFloors][];
        for (int i = 0; i < parkingFloors; i++) {
            System.out.println("Amount of parking lots on floor " + i);
            int parkingLots = s.nextInt();
            Car[] flor = new Car[parkingLots];
            arr2DParking[i] = flor;
        }
        for (int i = 0; i < arr2DParking.length; i++) {
            System.out.println(Arrays.toString(arr2DParking[i]));
        }
        menu();
    }

    private void park() {
        for (int i = 0; i < arr2DParking.length; i++) {
            for (int j = 0; j < arr2DParking[i].length; j++) {
                if (arr2DParking[i][j] == null) {
                    arr2DParking[i][j] = new Car();
                    System.out.println("You've parked a car" + i + "flor" + j + "parking lot");
                    return;
                }
            }
        }
        System.out.println("No parking space");
    }

    private void take() {
        System.out.println("Enter a flor number");
        int florNumber = s.nextInt();
        System.out.println("Enter a parking number");
        int parkingNumber = s.nextInt();
        if (florNumber < 0 || florNumber > arr2DParking.length - 1 || parkingNumber < 0 || parkingNumber > arr2DParking[florNumber].length) {
            System.out.println("You've enter a incorrect data. Try again");
            return;
        }
        if (arr2DParking[florNumber][parkingNumber] == null) {
            System.out.println("Empty space");
            return;
        }
        System.out.println("Enter car plates number");
        String carPlatesChecker = s.next();
        if (carPlatesChecker.equals(arr2DParking[florNumber][parkingNumber].getCarPlate())) {
            arr2DParking[florNumber][parkingNumber].info();
            arr2DParking[florNumber][parkingNumber] = null;
        }
    }


    private void find() {
        System.out.println("Select a criteria in which you want to find your car");
        System.out.println("1 - by brand, model and colour, 2 - car plate, 3 - exit");
        int finder = s.nextInt();
        switch (finder) {
            case 1 -> byBrandModelAndColour();
            case 2 -> byCarPlate();
            case 3 -> System.exit(0);
        }
    }

    private void byBrandModelAndColour() {
        System.out.println("Enter your car brand");
        String carBrand = s.next();
        System.out.println("Enter your car model");
        String model = s.next();
        System.out.println("Enter your car colour");
        String colour = s.next();
        int counter = 0;
        for (int i = 0; i < arr2DParking.length; i++) {
            for (int j = 0; j < arr2DParking[i].length; j++) {
                if (arr2DParking[i][j] != null && carBrand.equals(arr2DParking[i][j].getBrand()) && model.equals(arr2DParking[i][j].getModel()) && colour.equals(arr2DParking[i][j].getColour())) {
                    counter++;
                    arr2DParking[i][j].info();
                    System.out.println("Your parking place is : " + i + j);
                }
            }
        }
        if (counter == 0){
            System.out.println("Your car is not found");
        }
    }

    private void byCarPlate() {
        System.out.println("Enter your car plates");
        String carPlates = s.next();
        int counter = 0;
        for (int i = 0; i < arr2DParking.length; i++) {
            for (int j = 0; j < arr2DParking[i].length; j++) {
                if (arr2DParking[i][j] != null && carPlates.equals(arr2DParking[i][j].getCarPlate())) {
                    counter++;
                    arr2DParking[i][j].info();
                    System.out.println("Your parking place is : " + i + j);
                }
            }
        }
        if (counter == 0) {
            System.out.println("Your car is not found");
        }
    }
    private void menu() {
        for (; ; ) {
            System.out.println("Select a variant : 1 - parking, 2 - take a car, 3 - find your car, 4 - exit a program");
            switch (s.nextInt()) {
                case 1 -> park();
                case 2 -> take();
                case 3 -> find();
                case 4 -> System.exit(0);
            }
        }
    }
}
