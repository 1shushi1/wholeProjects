package UniversityClasses;

import java.util.Arrays;
import java.util.Random;

public class Problem4_11 {
    public static void main(String[] args) {
        Random r = new Random();
        char[] s = new char[10];
        for (int i = 0; i < s.length; i++) {
            int rand = r.nextInt(90 - 65) + 65;
            s[i] = (char) rand;
            System.out.print(s[i] + " ");
        }
        System.out.println();
        int[] myNum = {1, 2, 8, 9};
        for (int i = myNum.length - 1; i >= 0; --i) {
            System.out.print(myNum[i] + " ");
        }
        System.out.println();
        // initialize and add those two arrays
        int[] a0 = new int[]{1, 2, 3};
        int[] a1 = {4, 5, 6};
        int[] arrsum = new int[a0.length];
        for (int i = 0; i < arrsum.length; i++) {
            arrsum[i] = a0[i] + a1[i];
            System.out.print(arrsum[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arrsum));
        int[] revers = {1, 2, 8, 9, 12};
        for (int i = 0, j = revers.length - 1; i < j; i++, j--) {
            int temp;
            temp = revers[i];
            revers[i] = revers[j];
            revers[j] = temp;
        }
        System.out.println(Arrays.toString(revers));
        int[] numbers = new int[5];
        String[] strings = new String[3];
        strings[0] = "Hello";
        strings[1] = "Bye";
        strings[2] = "Java";
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println();
        for (String string : strings) {
            System.out.println(string);
        }
        int[] arr1 = {1, 2, 3, 4, 5};
        for (int i = 0, j ; i < arr1.length; i++) {
            int temp;
            temp = arr1[i];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
