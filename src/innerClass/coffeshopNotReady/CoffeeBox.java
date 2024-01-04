package innerClass.coffeshopNotReady;

public class CoffeeBox {
    private double maxVolume;
    private double currentVolume;
    public double getCurrentVolume(){
        return currentVolume;
    }
    public void volumeChecker(int amount){
        if (currentVolume == amount){
            currentVolume-=amount;
        }
    }
    public void coffeeFiller(){

    }
}
