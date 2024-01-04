package innerClass.waterSystem;

import innerClass.waterSystem.WaterTank.Controller;

import java.util.ArrayList;
import java.util.Scanner;

public class WaterSystem {
    private Scanner s = new Scanner(System.in);
    private WaterTank waterTank = new WaterTank();
    private Pump pump = new Pump();
    private ArrayList<WaterDevice> waterDevices = new ArrayList<>();

    public WaterSystem() {
        waterTank.connectPump(pump);
        pump.connectWaterTank(waterTank);
        menu();
    }

    private void addDevice() {
        System.out.println("Enter name for a new device");
        String name = s.nextLine();
        WaterDevice device = new WaterDevice(name);
        waterDevices.add(device);
        device.connector(waterTank);
    }

    private void deleteDevice() {
        System.out.println("List of devices : ");
        for (int i = 0; i < waterDevices.size(); i++) {
            System.out.println(waterDevices.get(i).getName());
        }
        System.out.println("Enter a device you would like to delete");
        String name = s.nextLine();
        for (int i = 0; i < waterDevices.size(); i++) {
            if (name.equals(waterDevices.get(i).getName())){
                waterDevices.remove(waterDevices.get(i));
            }
        }
    }

    private void selectDeviceToDrainWater() {
        System.out.println("Enter a device name you would like to use");
        System.out.println("List of devices : ");
        for (int i = 0; i < waterDevices.size(); i++) {
            System.out.println(waterDevices.get(i).getName());
        }
        System.out.println("Enter a device name you would like to use");
        String name = s.nextLine();
        for (int i = 0; i < waterDevices.size(); i++) {
            if (name.equals(waterDevices.get(i).getName())) {
                waterDevices.get(i).waterDrainer();
                return;
            }
        }
    }

    private void menu() {
        while (true) {
            System.out.println("Enter a number : 1 - add device, 2 - delete device, 3 - drain water, 4 - exit");
            int selection = Integer.parseInt(s.nextLine());
            switch (selection) {
                case 1 -> addDevice();
                case 2 -> deleteDevice();
                case 3 -> selectDeviceToDrainWater();
                case 4 -> System.exit(0);
            }
        }
    }
}
