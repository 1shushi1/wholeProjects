package oop.simpleObjects.microwave;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Microwave {
    private int time; //hold seconds
    private boolean switcher; //checks whether it is on
    private boolean openCheker; //checks whether the door is opened
    private int maxPower, minPower, currentPower;
    private boolean socket;
    private String mode = "manual";
    private Scanner s = new Scanner(System.in);

    public Microwave(int maxPower, int minPower) {
        this.maxPower = maxPower;
        this.minPower = minPower;
        currentPower = minPower;
        menu();
    }

    private void socketOnOff() {
//        if (socket == true){
//            socket = false;
//        }
//        else {
//            socket = true;
//        }
//        socket = !socket;
//        if (socket == true){
//            System.out.println("Socket on");
//        }
//        else {
//            System.out.println("Socket off");
//        }
        System.out.println((socket = !socket) ? "Socket on" : "Socket off");
    }

    private void openCloseDoor() {
//        openCheker = openCheker == true ? false : true;

//        openCheker = !openCheker; // змінює тру на фолс, якщо там тру і навпаки

//        if (openCheker == true){
//            System.out.println("The door is opened");
//        }
//        else {
//            System.out.println("The door is closed");
//        }
        System.out.println((openCheker = !openCheker) ? "The door is opened" : "The door is closed"); // ternary operator
    }

    private void powerOffOn() {
//        switcher = !switcher;
//        if (switcher == true) {
//
//            System.out.println("You've turn on a microwave");
//        }
//        else {
//            System.out.println("Your microwave off");
//        }
        System.out.println((switcher = !switcher) ? "You've turn on a microwave" : "Your microwave off");
    }

    private void setCurrentPower() {
        if (switcher == true && socket == true && mode.equalsIgnoreCase("Manual")) {
            System.out.println("Enter a microwave power (from 0 - 100 :  ");
            int valueCheker = s.nextInt();
            if (valueCheker >= minPower && valueCheker <= maxPower) {
                currentPower = valueCheker;
            }
            System.out.println("You've set a power : " + currentPower);
        }
    }

    private void setTime() {
        if (switcher && socket && mode.equalsIgnoreCase("Manual")) {
            System.out.println("Set a minutes");
            int mins = s.nextInt();
            System.out.println("Set a seconds");
            int sec = s.nextInt();
            time = mins * 60 + sec;
            System.out.println("You've set a time to " + mins + " : " + sec);
        }
    }

    private void changeMode() {
        if (switcher && socket) {
            System.out.println("Select a mode");
            System.out.println("Choose one of the accessible mode 1 - Cup, 2 - Plate, 3 - Manual");
            String reg1 = s.next();
            if (reg1.equals("Cup")) {
                time = 70;
                currentPower = (int) (maxPower * 0.75);
                System.out.println("You've set a CupMode");
                this.mode = "Cup";
            }
            if (reg1.equals("Plate")) {
                time = 205;
                currentPower = maxPower;
                System.out.println("You've set a PlateMode");
                this.mode = "Plate";
            }
            if (reg1.equals("Manual")) {
                this.mode = "Manual";
                System.out.println("You've set a ManualMode");
            }
        }
        else {
            System.out.println("In order to select a mode you have to turn on a microwave");
        }
    }

    private void startCountingDown() {
        if (openCheker == false && switcher == true && socket == true) {
            for (int i = time; i > 0; i--) {
                time--;
                int min = time / 60;
                int sec = time % 60;
                if (min < 10) {
                    System.out.print("0" + min + " : ");
                } else {
                    System.out.print(min);
                }
                if (sec < 10) {
                    System.out.print("0" + sec);
                } else {
                    System.out.print(sec);
                }
                System.out.println();
            }
            System.out.println("Ready!!!");
        }
        else {
            System.out.println("In order to start a heating you have to close the door");
        }
    }

    private void menu() {
        while (true) {
            System.out.println("Select a command : 1 - SocketOn/Off, 2 - Open/Close Door, 3 - PowerOn/Off, 4 - Set Power, 5 - Set Time, 6 - Mode Changer, 7 - Start Button, 8 - Exit");
            switch (s.nextInt()) {
                case 1 -> socketOnOff();
                case 2 -> openCloseDoor();
                case 3 -> powerOffOn();
                case 4 -> setCurrentPower();
                case 5 -> setTime();
                case 6 -> changeMode();
                case 7 -> startCountingDown();
                case 8 -> System.exit(0);
            }
        }
    }
}
