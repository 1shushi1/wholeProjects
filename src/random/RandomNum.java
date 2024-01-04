package random;

import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(34 - -13) + -13; // in order to put a border from-to we use
        // (max - min) + min;
        System.out.println(a);
        System.out.println();
        // to output a random value from - 13 to 34;
//        int b = r.nextInt(20 - -13) + -13; // output a 20 random nubmers from -13 to 20;
        for (int i = 0; i <= 20; i++) {
            int b = r.nextInt(20 - -13) + -13;
            System.out.print(b + " ");
        }
        //генерувати випадкові числа від -34 до 43 поки не випаде 0
        for ( ; ; ) {
            int c = r.nextInt(43 - - 34)+ - 34;
            System.out.print(c + " ");
            if (c == 0) {
                break;
            }
        }
        for (int i = -13; i <=23; i+=3) {
            System.out.print(i + " ");
        }
    }
}
