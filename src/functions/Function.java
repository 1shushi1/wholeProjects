package functions;

import java.util.Arrays;

public class Function {

    public static void main(String[] args) {
        System.out.println("before function");
        print();
        System.out.println("after function");
        print();
        System.out.println("finish");
        print("vasya", 5);
        int r = sum(4, 7);
        System.out.println(r + 5);
        double res = average(new int[]{2, -3, 4, 5, -6, 7, 8, -9});
        System.out.println(res);
        int res1[] = array(new int[]{2, -3, 4, 5, -6, 7, 8, -9});
        System.out.println(Arrays.toString(res1));
        int pos = index(10, new int[]{2, -3, 4, 5, -6, 7, 8, -9});
        System.out.println(pos);
        int pos1 = index1(4, new int[]{2, -3, 4, 5, -6, 7, 8, -9, 4, 5, 6, 7, 10, 13, 15, 16, -19, -24, -13, 4, 3});
        System.out.println(pos1);
        boolean resPrime = isPrime(11);
        System.out.println(resPrime);
        multiplication(100);
        System.out.println();
        primeMultiplacation(21);
        boolean ress = revers(new int[]{1,2,3,4,3,2,1});
        System.out.println();
        System.out.println(ress);
    }

    //ф-я приймає масив та повертає тру, якщо він є дзеркальним відносно центру
    public static boolean revers(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            if (arr[i]!=arr[j]){
                return false;
            }
        }
        return true;
    }
    //ф-я приймає ціле та друкує всі його прості множники
    public static void primeMultiplacation(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0 && isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    //ф-я приймає ціле число та друкує всі його множники
    public static void multiplication(int a) {
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    //ф-я приймає число типу інт та повертає тру, якщо воно просте або фолс - якщо ні
    public static boolean isPrime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    //ф-я приймає масив та інт число - номер останньої позиції де є таке число
    public static int index1(int a, int[] arr1) {
        for (int i = arr1.length - 1; i >= 0; i--) {
            if (arr1[i] == a) {
                return i;
            }
        }
        return -1;
    }

    //приймаємо масив та інт число та повертаємо номер позиції масива, де це число є. Або -1 якщо такого нема
    public static int index(int a, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return i;
            }
        }
        return -1;
    }

    //приймааємо масив інтів, повертаємо масив інтів тільки з додатніми числами
    public static int[] array(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                counter++;
            }
        }
        int[] arrDest = new int[counter];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arrDest[j++] = arr[i];
            }
        }
        return arrDest;
    }

    //ф-я приймає масив інтів та повертає середнє його додатніх чисел
    public static double average(int[] arr) {
        int counter = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                counter++;
            }
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        double avg = 1.0 * sum / counter;
        return avg;
    }

    public static int sum(int a, int b) {
        int res = a + b;
        return 5;
    }

    //ф-я приймає лонг та визначає кількість в ньому цифр
    public static void counter(long a) {
        int counter = 1;
        while (a / 10 != 0) {
            counter++;
            a /= 10;
        }
        System.out.println(counter);
    }

    //ф-я приймає масив типу чар та замінює в нього все великі букви на малі та навпаки
    public static void replacement(char[] capLet) {
        for (int i = 0; i < capLet.length; i++) {
            if (capLet[i] >= 'A' && capLet[i] <= 'Z') {
                capLet[i] += 32;
            } else {
                capLet[i] -= 32;
            }
        }
        System.out.println(Arrays.toString(capLet));
    }

    //ф-яприймає 2 масиви та інт число - номер комірки дя вставки другого масиву в перший
    public static void addition(int[] arr1, int[] arr2, int pos) {
        int[] dest = new int[arr1.length + arr2.length];
        for (int i = 0, j = 0, k = pos; i < dest.length; i++) {
            if (i < pos) {
                dest[i] = arr1[i];
            }
            if (i >= pos && i < pos + arr2.length) {
                dest[i] = arr2[j++];
            }
            if (i >= pos + arr2.length) {
                dest[i] = arr1[k++];
            }
        }
        System.out.println(Arrays.toString(dest));
    }

    //ф-я приймає масив типу інт та знаходить різницю між максимумом та мінімумом
    public static void arrayCalc(int[] arr) {
        Arrays.sort(arr);
        System.out.println("The difference between max and min is: " + (arr[arr.length - 1] - arr[0]));
    }

    // ф-я приймає ціле число та знаходе його факторіал
    public static void factorial(int a) {
        int factorial = 1;
        for (int i = a; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    // ф-я приймає 2 інта та створює масив, в якому будуть числа від першого до другого включно
    public static void print(int a, int b) {
        int[] arr = new int[b - a + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void print() {
        for (int i = 0; i < 4; i++) {
            System.out.println("hello");
        }
    }

    public static void print(String s, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }
    }

    // є масив та інт - номер комірки для видалення
    public static void delete(int pos, int[] arr) {
        int[] arr1 = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (i < pos) {
                arr1[i] = arr[i];
            }
            if (i > pos) {
                arr1[i - 1] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr1));
    }

    public static void insert(int value, int pos, int[] arr) {
        int[] arr1 = new int[arr.length + 1];
        for (int i = 0; i < arr1.length; i++) {
            if (i < pos) {
                arr1[i] = arr[i];
            }
            if (i == pos) {
                arr1[i] = value;
            }
            if (i > pos) {
                arr1[i] = arr[i - 1];
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
