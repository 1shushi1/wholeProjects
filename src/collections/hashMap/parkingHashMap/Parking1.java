package collections.hashMap.parkingHashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Parking1 {
    private Scanner s = new Scanner(System.in);
    private HashMap<Integer, Car1[]> arrParking = new HashMap<>();

    public Parking1() {
        System.out.println("Enter an amount of flors");
        int flors = Integer.parseInt(s.nextLine());
        for (int i = 1; i <= flors; i++) {
            System.out.println("How many parking lots will be on a " + i + " flor?");
            int parkingLots = Integer.parseInt(s.nextLine());
            Car1[] arrCar = new Car1[parkingLots];
            arrParking.put(i, arrCar);
        }
        for (int i = 1; i <= flors; i++) {
            System.out.println(Arrays.toString(arrParking.get(i)));
        }
        menu();
    }

    private void park() {
        for (Integer florNumber : arrParking.keySet()) {
            Car1[] flor = arrParking.get(florNumber);
            for (int i = 0; i < flor.length; i++) {
                if (flor[i] == null) {
                    flor[i] = new Car1();
                    System.out.println("You've parked a car on a flor " + florNumber + ". Place number : " + i);
                    return;
                }
            }
        }
        System.out.println("No available space");
    }

    private void take() {
        System.out.println("If you would like to take a car enter : ");
        System.out.println("Enter a flor number");
        int florNumber = Integer.parseInt(s.nextLine());
        System.out.println("Enter a parking number");
        int parkingNumber = Integer.parseInt(s.nextLine());
        Car1[] carArr = arrParking.get(florNumber);
        if (carArr[parkingNumber] == null) {
            System.out.println("Emtpy space");
            return;
        }
        System.out.println("Enter a car plates");
        String carPlates = s.nextLine();
        if (carPlates.equals(carArr[parkingNumber].getCarPlate())) {
            carArr[parkingNumber].info();
            carArr[parkingNumber] = null;
        }
    }


    private void find() {
        System.out.println("Select a criteria in which you want to find your car");
        System.out.println("1 - by brand, model and colour, 2 - car plate, 3 - exit");
        int finder = Integer.parseInt(s.nextLine());
        switch (finder) {
            case 1 -> byBrandModelAndColour();
            case 2 -> byCarPlate();
            case 3 -> System.exit(0);
        }
    }

    private void byBrandModelAndColour() {
        System.out.println("Enter your car brand");
        String carBrand = s.nextLine();
        System.out.println("Enter your car model");
        String model = s.nextLine();
        System.out.println("Enter your car colour");
        String colour = s.nextLine();
        int counter = 0;
        for (int i = 1; i <= arrParking.size(); i++) {
            Car1[] arrCar = arrParking.get(i);
            for (int j = 0; j < arrCar.length; j++) {
                if (arrCar[j] != null && carBrand.equals(arrCar[j].getBrand()) && model.equals(arrCar[j].getModel())
                        && colour.equals(arrCar[j].getColour())) {
                    counter++;
                    arrCar[j].info();
                    System.out.println("Your parking place is : " + i + " " + j);
                }
            }
        }
        if (counter == 0) {
            System.out.println("Your car is not found");
        }
    }

    private void byCarPlate() {
        System.out.println("Enter your car plates");
        String carPlates = s.nextLine();
        int counter = 0;
        for (int i = 1; i < arrParking.size(); i++) {
            Car1[] arrCar = arrParking.get(i);
            for (int j = 0; j < arrCar.length; j++) {
                if (arrCar[j] != null && carPlates.equals(arrCar[j].getCarPlate())) {
                    counter++;
                    arrCar[j].info();
                    System.out.println("Your parking place is : " + i + "_" + j);
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
            switch (Integer.parseInt(s.nextLine())) {
                case 1 -> park();
                case 2 -> take();
                case 3 -> find();
                case 4 -> System.exit(0);
            }
        }
    }
}
