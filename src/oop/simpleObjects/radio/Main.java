package oop.simpleObjects.radio;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.radioOn();
        radio.next();
        for (int i = 0; i < 33; i++) {
            radio.volumeUp();
        }
        radio.volumeDown();
        radio.prev();
        radio.radioOff();
    }
}
