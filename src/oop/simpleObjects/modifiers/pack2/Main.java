package oop.simpleObjects.modifiers.pack2;
import oop.simpleObjects.modifiers.pack1.First;
import oop.simpleObjects.modifiers.pack1.Fourth;

import java.util.Random;
//import oop.simpleObjects.modifiers.pack1.

public class Main {
    public static void main(String[] args) {
        Second second = new Second();
        second.second();
        First first = new First();
        Random r = new Random();
        Fourth fourth = new Fourth();
        fourth.fourthOne();
    }
}
