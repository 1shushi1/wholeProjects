package oop.simpleObjects.clock;

import java.util.Random;

public class Clock {
    private int hours;
    private int min;
    private int batteryPercentage;

    public Clock() {
        Random r = new Random();
        hours = r.nextInt(24);
        min = r.nextInt(60);
        batteryPercentage = r.nextInt(101);
        clockStart();
    }

    private void clockStart() {
        int counter = 0;
        while (batteryPercentage > 0) {
            min++;
            if (min == 60) {
                hours++;
                counter++;
                min = 0;
            }
            if (hours == 24) {
                hours = 0;
            }
            if (counter == 4) {
                counter = 0;
                batteryPercentage--;
            }
            if (hours < 10) {
                System.out.print("0" + hours + " : ");
            } else {
                System.out.print(hours + " : ");
            }
            if (min < 10) {
                System.out.print("0" + min);
            }
            else {
                System.out.print(min);
            }
            System.out.println();
        }
        System.out.println("Your battery died");
    }

    public void changeBattery(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
        clockStart();
    }
}
