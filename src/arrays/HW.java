package arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class HW {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 3, 6};
        int[] arr1 = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            arr1[i] = arr[i];
        }
        System.out.println(" " + Arrays.toString(arr1));
        // є масив та інт - звідки видалити
        int[] arrOne = {2, 1, 4, 3, 6};
        int[] arrDest = new int[arrOne.length - 1];
        int index = 2;
        for (int i = 0; i < arrOne.length; i++) {
            if (i < index) {
                arrDest[i] = arrOne[i];
            }
            if (i > index) {
                arrDest[i - 1] = arrOne[i];
            }
        }
        System.out.println(Arrays.toString(arrDest));
        //є масив та 2 інта. Перший - що вставляємо, другий - куди
        int[] arrTwo = {2, 3, 1, 6, 5, 8};
        int[] arrDest1 = new int[arrTwo.length + 1];
        int index1 = 2;
        int value = 37;
        for (int i = 0; i < arrDest1.length; i++) {
            if (i < index1) {
                arrDest1[i] = arrTwo[i];
            }
            if (i == index1) {
                arrDest1[i] = value;
            }
            if (i > index1) {
                arrDest1[i] = arrTwo[i - 1];
            }
        }
        System.out.println(Arrays.toString(arrDest1));
        // зклеїти 2 масиви
        int[] a = {1, 2, 3, 4};
        int[] b = {8, 7, 5};
        int[] cDest = new int[a.length + b.length];

        for (int i = 0, j = 0; i < cDest.length; i++) {
            if (i < a.length) {
                cDest[i] = a[i];
            } else {
                cDest[i] = b[j++];
            }
        }
        System.out.println(Arrays.toString(cDest));
        // створити масив-перевертень
        arr = new int[]{1, 2, 3, 5};
        int[] drakula = new int[arr.length];
        for (int i = drakula.length - 1, j = 0; i >= 0; i--, j++) {
            drakula[j] = arr[i];
        }
        System.out.println(Arrays.toString(drakula));
        //є масив буленів. Замінити в ньому всі тру на фолс та навпаки
        boolean[] tru1 = {true, false, true, false, false, true};
        for (int i = 0; i < tru1.length; tru1[i] = !tru1[i], i++) ;
//            if (tru1[i] == false){
//                tru1[i] = true;
//            }
//            else {
//                tru1[i] = false;
//
        System.out.println(Arrays.toString(tru1));
        //є масив інтів. Замінити відємні на додатні та навпаки
        int[] values = {-4, 16, 20, -10, -7, 3, 7, 19};
        for (int i = 0; i < values.length; i++) {
            values[i] = -values[i];
        }
        System.out.println(Arrays.toString(values));
        //є масив інтів. Порахувати кількість кратних 3 чисел
        int[] arrKrat = {10, 0, 4, 6, 9, 0, -3, -7, 21, -27, 33};
        int counter = 0;
        for (int i = 0; i < arrKrat.length; i++) {
            if (arrKrat[i] != 0 && arrKrat[i] % 3 == 0) {
                counter++;
            }
        }
        System.out.println(counter);
        //є масив чарів. Замінити всі маденьки букви на великі, та навпаки
        char[] symbols = {'a', 'Y', '3', '!', 'B', 'i'};
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] >= 'a' && symbols[i] <= 'z') {
                symbols[i] -= 32;
            } else if (symbols[i] >= 'A' && symbols[i] <= 'Z') {
                symbols[i] += 32;
            }
        }
        System.out.println(Arrays.toString(symbols));
        //є масив даблів. Всі додатні зменшити на 30 %   а відємні збільшити в 1.5 рази
        double[] arrDouble = {23, -12, 34, 6, -9, 12, 18, -32, -43};
        for (int i = 0; i < arrDouble.length; i++) {
            if (arrDouble[i] > 0) {
                arrDouble[i] *= 0.7;
            } else if (arrDouble[i] < 0) {
                arrDouble[i] *= 1.5;
            }
        }
        System.out.println(Arrays.toString(arrDouble));
        //є масив інтів. Створити новий маасив, в якому будуть тільки додатні елементи з вхідного масиву
        int counter1 = 0;
        int[] arrAdd = {2, -4, 5, -3, 8, 0, 1};
        for (int i = 0; i < arrAdd.length; i++) {
            if (arrAdd[i] > 0) {
                counter1++;
            }
        }
        int[] dest = new int[counter1];
        int j = 0;
        for (int i = 0; i < arrAdd.length; i++) {
            if (arrAdd[i] > 0) {
                dest[j++] = arrAdd[i];
            }
        }
        System.out.println(Arrays.toString(dest));
        //є масив інтів. Друкануть парні числа що є на непарних позиціях
        int[] arrM = {3, 6, 7, 13, -18, -4, 9, -10, 23, -5, -12};
        for (int i = 0; i < arrM.length; i++) {
            if (i%2!=0 && arrM[i]%2==0){
                System.out.println(arrM[i]);
            }
        }
        //створити масив на 30 комірок та заповнити випадковими числами від -7 до 9
        int [] arrR = new int[30];
        Random r = new Random();
        for (int i = 0; i < arrR.length; i++) {
            int ran = r.nextInt(9 - - 7) + - 7;
            arrR[i] = ran;
        }
        System.out.println(Arrays.toString(arrR));
        // створити самоперевертня
        int [] arrV = {3, 2, 1, 4, 6, 8, 9};
        for (int i = 0, t = arrV.length - 1; i < arrV.length/2; i++, t--) {
            int temp;
            temp = arrV[i];
            arrV[i] = arrV[t];
            arrV[t] = temp;
        }
        System.out.println(Arrays.toString(arrV));
    }
}

