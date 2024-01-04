package innerClass.waterSystem;
import innerClass.waterSystem.WaterTank.Controller;

public class Pump {
    private WaterTank waterTank;
    public void connectWaterTank(WaterTank waterTank){
        this.waterTank = waterTank;
    }
    public void pumpTheWater(){
        int maxFill = waterTank.getMaxVolume() - waterTank.getCurrentVolume();
        waterTank.waterCather(maxFill);
        System.out.println("You've filled a tank with " + maxFill + " litters of water");
    }
}
