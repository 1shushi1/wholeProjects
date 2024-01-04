package oop.simpleObjects.safebox;

import java.util.Arrays;

public class Safebox {
    private char [] password;
    private char [] pin = new char[]{'e', '1', 'L', '8'};
    private int attempts = 3;
    private boolean isOpened = true;
    private boolean isBlocked = false;

    public void close(char [] password){
        if (isOpened==true) {
            this.password = password;
            isOpened = false;
            System.out.println("Safebox closed. Your input password is : " + Arrays.toString(this.password));
        }
    }
    public void open(char [] password){
        if (isBlocked == true){
            if (Arrays.equals(password, pin)){
                isBlocked = false;
                isOpened = true;
                attempts = 3;
                System.out.println("Safebox opened");
            }
            return;
        }
        if (isOpened == false && (Arrays.equals(password,this.password) || Arrays.equals(password,pin))){
            isOpened = true;
            attempts = 3;
            System.out.println("Safebox opened.");
        }
        else {
            attempts--;
            System.out.println("You've entered a wrong password. You're left with " + attempts + " attempts");
            if (attempts==0){
                isBlocked = true;
                System.out.println("Your safebox is blocked. Enter your pin-number.");
                if (!Arrays.equals(pin, password)){
                    System.out.println("You've entered a wrong pin");
                }
            }
        }
    }
}
