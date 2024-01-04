package oop.simpleObjects.modifiers.pack1;
import oop.simpleObjects.modifiers.pack2.First;
public class Main {
    public static void main(String[] args) {
        oop.simpleObjects.modifiers.pack1.First first = new oop.simpleObjects.modifiers.pack1.First();
        first.first();
        Third third = new Third();
        third.someMethod();
        Fourth fourth = new Fourth();
        fourth.fourth();
        First first1 = new First();
        first1.six();
        first.first();
    }
}
