package collections.arraylist.parking;

import java.util.ArrayList;
import java.util.Scanner;

public class Parking {
    Scanner s = new Scanner(System.in);
    private ArrayList<ArrayList<Car>> arr2DParking = new ArrayList<>();

    public Parking() {
        System.out.println("Enter an amount of floors");
        int parkingFloors = s.nextInt();
        for (int i = 0; i < parkingFloors; i++) {
//            Car[] flor = new Car[parkingLots];
//            arr2DParking[i] = flor;
            ArrayList<Car> flor = new ArrayList<>();
            System.out.println("");
            System.out.println("Amount of parking lots on floor " + i);
            int parkingLots = s.nextInt();
            for (int j = 0; j < parkingLots; j++) {
                flor.add(null);
            }
            arr2DParking.add(flor);
        }
        for (int i = 0; i < arr2DParking.size(); i++) {
            System.out.println(arr2DParking.get(i));
        }
        menu();
    }

    private void park() {
        for (int i = 0; i < arr2DParking.size(); i++) {
            ArrayList<Car> flor = arr2DParking.get(i);
            for (int j = 0; j < flor.size(); j++) {
                if (flor.get(j) == null) {
                     flor.set(j, new Car());
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
        ArrayList<Car> flor = arr2DParking.get(florNumber);
        if (florNumber < 0 || florNumber > arr2DParking.size() - 1 || parkingNumber < 0 || parkingNumber > flor.size()) {
            System.out.println("You've enter a incorrect data. Try again");
            return;
        }
        if (flor.get(parkingNumber) == null) {
            System.out.println("Empty space");
            return;
        }
        System.out.println("Enter car plates number");
        String carPlatesChecker = s.next();
        if (carPlatesChecker.equals(flor.get(parkingNumber).getCarPlate())) {
            flor.get(parkingNumber).info();
            flor.set(parkingNumber, null);
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
        for (int i = 0; i < arr2DParking.size(); i++) {
            ArrayList<Car> flor = arr2DParking.get(i);
            for (int j = 0; j < flor.size(); j++) {
                if (flor.get(j) != null && carBrand.equals(flor.get(j).getBrand()) && model.equals(flor.get(j).getModel()) && colour.equals(flor.get(j).getColour())) {
                    counter++;
                    flor.get(j).info();
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
        for (int i = 0; i < arr2DParking.size(); i++) {
            ArrayList<Car> flor = arr2DParking.get(i);
            for (int j = 0; j < flor.size(); j++) {
                if (flor.get(j)!= null && carPlates.equals(flor.get(j).getCarPlate())){
                    counter++;
                    flor.get(j).info();
                    System.out.println("Your parking place is : " + i + j);
                }
            }
        }
        if (counter == 0){
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
