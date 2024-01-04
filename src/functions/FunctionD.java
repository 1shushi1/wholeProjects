package functions;

import java.util.Arrays;

public class FunctionD {
    public static void main(String[] args) {
        int num = numReturn("asdf22345klajfs!3241223509897");
        System.out.println(num);
        int[] arr = evenNum(new int[]{1, 5, 6, 8, 9, 3, -2, 0, 3, -9, -5, 4, 6, 8, 2, -2});
        System.out.println(Arrays.toString(arr));
        int[] arrCopy = arrCopy(new int[]{1, 5, 6, 8, 9, 3, -2, 0, 3}, new int[]{3, -9, -5, 4, 6, 8, 2, -2});
        System.out.println(Arrays.toString(arrCopy));
        double avg = avg(new int[][]{{1, 5, 6, 8, 9, 3}, {9, 3, -2, 0, 3}, {5, 4, 6, 8, 2, -2}});
        System.out.println(avg);
        int sum = sum(143567);
        System.out.println(sum);
        String text = stringRotation("notna");
        System.out.println(text);
        int counter = counter(1234859);
        System.out.println(counter);
    }
    //приймаємо лонг та повертаємо кількість в ньому цифр
    public static int counter (long a){
        return (a + "").length();
//        String empty = "";
//        empty += a;
//        int counter = 0;
//        char [] arr = empty.toCharArray();
//        for (int i = 0; i < arr.length; i++) {
//            counter++;
//        }
//        return counter;
    }
    //приймаємо стрінг та повертаємо стрінг навпаки
    public static String stringRotation (String s){
        String emtpy = "";
        char [] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            emtpy = arr[i] + emtpy;
        }
        return emtpy;
    }
    //

    //приймаємо інт та повертаємо суму його цифр
    public static int sum(int a) {
        String empty = "";
        empty += a;
        int sum = 0;
        char [] arr = empty.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] - 48;
        }
        return sum;
    }

    //ф-я приймає масив2д типу інт та повертає середнє його елементів
    public static double avg(int[][] arr2D) {
        int counter = 0;
        int sum = 0;
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                counter++;
                sum += arr2D[i][j];
            }
        }
        return 1.0 * sum / counter;
    }

    //ф-я приймає 2 масива та повертає один, складений з елементів  переданих
    public static int[] arrCopy(int[] a, int[] b) {
        int[] arrDest = new int[a.length + b.length];
        System.arraycopy(a, 0, arrDest, 0, a.length);
        System.arraycopy(b, 0, arrDest, a.length, b.length);
        return arrDest;
    }

    //ф-я приймаэ стрінг та повертає найбільшу цифру з нього
    public static int numReturn(String s) {
        int theBiggestNum = 0;
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                theBiggestNum = arr[i];
                return arr[i] - 48;
            }
        }
        return -2;
    }

    //приймаємо масив інтів та повертаємо масив з тільки парними числами
    public static int[] evenNum(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                counter++;
            }
        }
        int[] arrDest = new int[counter];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                arrDest[j++] = arr[i];
            }
        }
        return arrDest;
    }
}
