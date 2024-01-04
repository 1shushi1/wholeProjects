package innerClass.coffeshopNotReady;

public class WaterTank {
    private int currentVolume;
    private int maxVolume;
    public WaterTank(int volume){
        maxVolume = volume;
    }
    public int getCurrentVolume(){
        return currentVolume;
    }
    public int getMaxVolume(){
        return maxVolume;
    }
    public void waterRefill(int amountToFill) {

    }
}
