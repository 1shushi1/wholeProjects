package functions;

import java.util.Arrays;

public class FunctionsCont {
    public static void main(String[] args) {
        int res = refund(new char[]{'!', '2', 'a', 'b', '3', '8', 'c', '1'});
        System.out.println(res);
        boolean[] trF = falseRef(new boolean[]{true, false, false, true, true});
        System.out.println(Arrays.toString(trF));
        boolean tru = truR(new char[]{'!', 'b', 'a', '$', '-', 'k', 'f'});
        System.out.println(tru);
        boolean rtn = returns(new char[]{'A', '6', 'Y', 'C', '1', 'h'});
        System.out.println(rtn);
        int[] return1 = return1(new int[]{4, 7, -3, 9, 8, -2, -6, 5, 12, 83});
        System.out.println(Arrays.toString(return1));
        boolean tr = return2(new int[]{2, 1, 4, 4, 1, 2});
        System.out.println(tr);
        int mxValue = retrn(new int[]{4, 7, -3, 9, 8, -2, -6, 5, 12, 83});
        System.out.println(mxValue);
        int value = return12(new int[]{2, 1, 2, 4, 1, 2}, 2);
        System.out.println(value);
        int[] arr = returnArr(new int[]{-4, 7, -3, 9, 8, -2, -6, 5, 12, -10});
        System.out.println(Arrays.toString(arr));
        int [] arr1 = arrRt(new int[]{1,2,3,4,5}, 1);
        System.out.println(Arrays.toString(arr1));
    }

    // прокрутити масив в право
    public static int [] arrRt (int [] arr, int n){
        for (int j = 0; j < n; j++) {
            int temp = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
        }
        return arr;
    }

    // функція приймає масив з однаковою кількістю від'ємних та додатніх елементів,
    // і повертає масив в якому всі елементи в шахматному порядку
    public static int[] returnArr(int[] arr) {
        Arrays.sort(arr);
        int temp;
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            temp = arr[i];
            arr[i++] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    // функція приймає масив типу інт та ще один інт та повертає кількість раз, як цей інт там зустрічався в масиві

    public static int return12(int[] arr, int n) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                counter++;
            }
        }
        return counter;
    }

    //функція приймає масив та повертає другий по велечині максимум
    public static int retrn(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr[arr.length - 2];
    }

    // функція приймає масив та повертає тру, якщо він семетричний відносно центру
    public static boolean return2(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }


    //приймаємо масив чарів та повертаємо тру, якщо в ньому нема цифр
    public static boolean truR(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                return false;
            }
        }
        return true;
    }

    //ф-я приймає масив ттипу булень, та повертає масив де тільки фолси з вхідного
    public static boolean[] falseRef(boolean[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != true) {
                counter++;
            }
        }
        return new boolean[counter];
    }

    //ф-я приймає масив типу чар та повертає найбільшу цифру з нього
    public static int refund(char[] arr) {
        char mx = '0';
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx && arr[i] <= '9') {
                mx = arr[i];
            }
        }
        return mx - 48;
    }

    // функція приймає масив типу чар та повертає тру, якщо там немає цифр
    public static boolean returns(char[] arrChar) {
        for (int i = 0; i < arrChar.length; i++) {
            if (arrChar[i] >= '0' && arrChar[i] <= '9') {
                return false;
            }
        }
        return true;
    }

    // функція приймає масив типу інт та повертає масив без від'ємних значень
    public static int[] return1(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                counter++;
            }
        }
        int[] arrD = new int[counter];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arrD[j++] = arr[i];
            }
        }
        return arrD;
    }
}
