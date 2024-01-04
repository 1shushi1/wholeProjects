package codewars;

import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        int sum[] = countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15});
        System.out.println(Arrays.toString(sum));
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        int counter = 0;
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0){
                sum += input[i];
            }
            if (input[i] > 0){
                counter++;
            }
        }
        int arr [] = new int[2];
        arr[0] = counter;
        arr[1] = sum;
        return arr;
    }
}
