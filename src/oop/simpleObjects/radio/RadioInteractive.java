package oop.simpleObjects.radio;

import java.util.Scanner;

public class RadioInteractive {
    private double[] waves = {99.1, 101.3, 102.5, 105.7, 107.1};
    private String[] wavesName = {"LuxFM", "Roks", "KissFM", "Jazz", "Shanson"};
    private int index = 0;
    private boolean switchCheck;
    private int volume = 0;

    public RadioInteractive(){
        menu();
    }

    private void radioOn() {
        switchCheck = true;
        System.out.println(waves[index] + " ----- " + wavesName[index] + " ----- " + "Your volume is : " + volume);
    }

    private void radioOff() {
        switchCheck = false;
    }

    private void next() {
        if (switchCheck == true) {
            index++;
            if (index == waves.length) {
                index = 0;
            }
            System.out.println(waves[index] + " ----- " + wavesName[index] + " ----- " + "Your volume is : " + volume);
        }
    }

    private void prev() {
        if (switchCheck == true) {
            index--;
            if (index < 0) {
                index = waves.length - 1;
            }
            System.out.println(waves[index] + " ----- " + wavesName[index] + " ----- " + "Your volume is : " + volume);
        }
    }

    private void volumeUp() {
        if (switchCheck == true) {
            volume++;
            if (volume > 100) {
                volume = 100;
            }
            System.out.println(waves[index] + " ----- " + wavesName[index] + " ----- " + "Your volume is : " + volume);
        }
    }

    private void volumeDown() {
        if (switchCheck == true) {
            volume--;
            if (volume < 0) {
                volume = 0;
            }
            System.out.println(waves[index] + " ----- " + wavesName[index] + " ----- " + "Your volume is : " + volume);
        }
    }

    private void menu() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Next station 2 - Previous station, 3 - Volume up 4 - Volume down 5 - Turn on 6 - Turn off 7 - Exit");
            switch (scan.nextInt()) {
                case 1 -> next();
                case 2 -> prev();
                case 3 -> volumeUp();
                case 4 -> volumeDown();
                case 5 -> radioOn();
                case 6 -> radioOff();
                case 7 -> System.exit(0);
            }
        }
    }
}
