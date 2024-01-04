package arrays;

import java.util.Arrays;
import java.util.Random;

public class Problem1 {
    public static void main(String[] args) {
        Random r = new Random();
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) { // from 20 to -20
            double randNum = r.nextDouble(20 - -20) + -20;
            arr[i] = randNum;
            if (i % 2 == 0) {
                System.out.println("Even index " + arr[i]);
            }
            if (((int) arr[i]) % 2 != 0) {
                System.out.println("Odd " + arr[i]);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
