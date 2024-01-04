package innerClass.coffeshopNotReady;

import java.util.Scanner;

public class MilkTank {
    private int currentVolume;
    private int maxVolume;
    private Scanner s = new Scanner(System.in);

    public MilkTank() {
        System.out.println("Enter a maximum volume of the milk tank");
        maxVolume = s.nextInt();
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void milkRefill() {
        int freeSpace = maxVolume - currentVolume;
        System.out.println("There is " + freeSpace + "litters left. \nEnter an amount of litter you would like to fill");
        int amount = s.nextInt();
        if (amount <= freeSpace) {
            maxVolume += amount;
        }
    }
}
