package innerClass.waterSystem;

import java.util.Scanner;

public class WaterTank {
    private int maxVolume;
    private int currentVolume;
    private Controller controller = new Controller();
    public WaterTank(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a volume for a water tank");
        maxVolume = s.nextInt();
    }
    public int getCurrentVolume(){
        return currentVolume;
    }
    public int getMaxVolume(){
        return maxVolume;
    }
    public void waterCather(int liters){
        currentVolume += liters;
    }
    public void waterDrain(int liters){
        currentVolume -= liters;
        controller.callForThePump();
    }
    public void connectPump(Pump pump){
        controller.pump = pump;
        pump.connectWaterTank(this);
        controller.callForThePump();
    }
    public class Controller{
        private Pump pump;
        public void callForThePump(){
            if (currentVolume < 20){
                pump.pumpTheWater();
            }
        }
    }
}
