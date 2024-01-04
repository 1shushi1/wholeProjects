package oop.simpleObjects.radio;

public class Radio {
    private double[] waves = {99.1, 101.3, 102.5, 105.7, 107.1};
    private String[] wavesName = {"LuxFM", "Roks", "KissFM", "Jazz", "Shanson"};
    private int index = 0;
    private boolean switchCheck;
    private int volume = 0;

    public void radioOn() {
        switchCheck = true;
        System.out.println(waves[index] + " ----- " + wavesName[index] + " ----- " + "Your volume is : "  + volume);
    }

    public void radioOff() {
        switchCheck = false;
    }
    public void next(){
        if (switchCheck == true){
            index++;
            if (index == waves.length){
                index = 0;
            }
            System.out.println(waves[index] + " ----- " + wavesName[index] + " ----- " + "Your volume is : " + volume);
        }
    }
    public void prev(){
        if (switchCheck == true){
            index--;
            if (index < 0){
                index = waves.length - 1;
            }
            System.out.println(waves[index] + " ----- " + wavesName[index] + " ----- " + "Your volume is : " + volume);
        }
    }
    public void volumeUp(){
        if (switchCheck == true) {
            volume++;
            if (volume > 100){
                volume = 100;
            }
                System.out.println(waves[index] + " ----- " + wavesName[index] + " ----- " + "Your volume is : " + volume);
        }
    }
    public void volumeDown(){
        if (switchCheck == true){
            volume--;
            if (volume < 0){
                volume = 0;
            }
            System.out.println(waves[index] + " ----- " + wavesName[index] + " ----- " + "Your volume is : " + volume);
        }
    }
}
