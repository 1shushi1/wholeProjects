package arrays;

import java.util.Arrays;
import java.util.Random;

public class Problem3 {
    public static void main(String[] args) {
        Random r = new Random();
        char[] arr = new char[5];
        for (int i = 0; i < arr.length; i++) {
            char c = (char) (r.nextInt(90 - 65) + 65);
            arr[i] = c;
        }
    }
}
