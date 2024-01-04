package arrays;

import java.util.Arrays;
import java.util.Random;

public class PPJ10 {
        public static void main(String[] args) {
            Random r = new Random();
            int [] arr = new int[10];
            int counterEven = 0;
            int counter1Odd = 0;
            for (int i = 0; i < arr.length; i++) {
                int rand = r.nextInt(25 - - 13) + - 13;
                arr[i] = rand;
                if (arr[i]==0){
                    continue;
                }
                if (arr[i]%2!=0){
                    counter1Odd++;
                }
                else {
                    counterEven++;
                }
            }
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            System.out.println(counterEven);
            System.out.println(counter1Odd);
            System.out.println();

            char [] arrChar = {'g', 'h', 'n'};
            int min = (int)arrChar[0];
            for (int i = 0; i < arrChar.length; i++) {
                if (arrChar[i]<min){
                    min = arrChar[i];
                    System.out.println((char)min + " - " + min );
                }
            }
        }
}
