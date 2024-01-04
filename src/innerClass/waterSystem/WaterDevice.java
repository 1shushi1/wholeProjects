package innerClass.waterSystem;

import java.util.Scanner;

public class WaterDevice {
    private String name;
    private WaterTank waterTank;
    private Scanner s = new Scanner(System.in);
    public WaterDevice(String name){
        this.name = name;
    }
    public void connector(WaterTank waterTank){
        this.waterTank = waterTank;
    }
    public void waterDrainer(){
        System.out.println("Enter water amount you would like to drain");
        int amount = Integer.parseInt(s.nextLine());
        System.out.println("You've drained " + amount + " liters of water");
        waterTank.waterDrain(amount);
    }
    public String getName(){
        return name;
    }
}
