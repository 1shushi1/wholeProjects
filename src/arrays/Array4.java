package arrays;

import java.util.Arrays;
import java.util.Random;

public class Array4 {
    public static void main(String[] args) {
        //є  масив. створити копію  фором
        int [] arr = {2, 1, 4, 3, 6};
        int [] arrcopy = new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrcopy[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrcopy));
        //видалити останню   комірку.  фором
        int [] arr1 = {2, 1, 4, 3, 6};
        int [] arr2 = new int[arr1.length];
        for (int i = 0; i < arr.length-1; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println();
        for (int i = 1; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println();
        //зміксувати елементи масиву як колоду карт
        Random r = new Random();
        int [] arrMix = {2, 1, 3, 5, 6};
        for (int i = 0; i < arrMix.length; i++) {
            int randI = r.nextInt(arrMix.length);
            int temp;
            temp = arrMix[i];
            arrMix[i] = arrMix[randI];
            arrMix[randI] = temp;
        }
        System.out.println(Arrays.toString(arrMix));
        //є масив чарів. Підрахувати суму цир в ньому
        char [] arrChar = {'!', 'a', '5', 'c', '8', 'd', '4'};
        int sum = 0;
        for (int i = 0; i < arrChar.length; i++) {
            if (arrChar[i]>='0' && arrChar[i]<='9'){
                sum = sum + arrChar[i] - 48;
            }
        }
        System.out.println(sum);
        //в маасиві ипу інт збільшити в 2 рази знаачення парних елементів
        // на непарних позиціях
        int [] myNum = {4, 7, -3, 9, 8, -2, -6, 5, 12, 83};
        for (int i = 0; i < myNum.length; i++) {
            if (myNum[i]%2==0 && i%2!=0){
                myNum[i]*=2;
            }
        }
        System.out.println(Arrays.toString(myNum));

    }
}
