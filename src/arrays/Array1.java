package arrays;

import java.util.Arrays;
import java.util.Random;

public class Array1 {
    public static void main(String[] args) {
        int [] arr = {4, -2, 5, 7, 9, 8};
        int [] arr1 = new int[6];
        double [] arr2 = new double[]{4, -2, 5, 7, 9, 8};
        System.out.println(arr[3]);
        arr[3] = 23;
        System.out.println(arr[3]);
        int value = arr.length;
        System.out.println(value);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int j = arr.length - 1; j >= 0; j--){
            System.out.print(arr[j] + " ");
        }

        System.out.println();
        //створити масив типу інт на 30 комірок та забити його випадковими числами від -12 до 14
        int [] arrRand = new int[30];
        Random r = new Random();
        for (int i = 0; i <arrRand.length ; i++) {
            int randNum = r.nextInt(14 - - 12) + - 12;
            arrRand[i] = randNum;
        }
        System.out.println(Arrays.toString(arrRand));
        boolean [] booleans1 = new boolean[20];
        System.out.println(Arrays.toString(booleans1));
        int [] value1 = new int[20];
        System.out.println(Arrays.toString(value1));
        //є масив типу інт вже із значеннями. Знайти макс  та мін
        int [] arrValues = {4, -2, 5, 7, 9, 8};
        int min = arrValues[0];
        int max = arrValues[0];
        for (int i = 0; i < arrValues.length; i++) {
            if (arrValues[i]<min){
                min = arrValues[i];
            }
            if (arrValues[i]>max){
                max = arrValues[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
        int [] arrSort = {10, -4, 9, 3, -7, 2, 5, -6};
        Arrays.sort(arrSort);
        System.out.println(Arrays.toString(arrSort));
        //є масив даблів. Знайти макс та мін одним ражком
        double [] arrDouble = {10, -4, 9, 3, -7, 2, 5, -6};
        Arrays.sort(arrDouble);
        System.out.println("Min = " + arrDouble[0] + " " + "Max = " + arrDouble[arrDouble.length - 1]);
        //є масив інтів. Знайти другий максимум
        int [] arrMaxVal = {10, -4, 9, 10, 10, 3, -7, 2, 5, -6};
        Arrays.sort(arrMaxVal);
        System.out.println("Max = " + arrMaxVal[arrMaxVal.length-1] + " " + "Second max value = " + arrMaxVal[arrMaxVal.length-2]);
        System.out.println(Arrays.toString(arrMaxVal));
        for (int i = arrMaxVal.length - 1; i >= 0; i--){
            if (arrMaxVal[i] != arrMaxVal[arrMaxVal.length-1]){
                System.out.println("Max = " + arrMaxVal[arrMaxVal.length-1] + " " + "Second max value = " + arrMaxVal[i]);
                break;
            }
        }
          int [] arrMin = {10, -4, 9, 10, 10, 3,-7, -7, 2, 5, -6};
        Arrays.sort(arrMin);
        for (int i = 0; i <arrMin.length ; i++) {
            if (arrMin[i]!=arrMin[0] ){
                System.out.println("Min = " + arrMin[0] + " " + "Second min = " + arrMin[i]);
                break;
            }
        }
     }
}
