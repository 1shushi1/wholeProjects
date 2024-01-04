package functions;

import java.util.Arrays;

public class Fun2d {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        positionChange(arr, 0, 2);
        int[][] arr1 = {{4, 2, 1}, {3, 7, 9}, {6, 8, 5}};
        arrSort(arr1);
        int[][] arr2D = {{4, 2, 1}, {3, 7, 9}, {6, 8, 5}};
        arrSort2d(arr2D);
        int[] arrCounter = {1, 2, 2, 2, 6, 6, 1, 7, 8, 9, 4, 4, 9, 3, 4, 5, 6, 7};
        counter(arrCounter);
        boolean info = returnTrue(new int[]{1, 2, 2, 2, 6, 6, 1, 7, 8, 9, 4}, new int[]{1, 2, 6, 8, 10});
        System.out.println(info);
        int index = indexSum(new int[][]{{2, 3, 1, 0, 0, 0}, {5, 4}, {8, 0, 0, 5, 7, 9}});
        System.out.println(index);
        arr2dSort(new int[][]{{4, 2, 1}, {3, 7, 9}, {6, 8, 5}});
        int value = findTheBiggestVal(new int[][]{{4, 2, 1}, {3, 7, 9}, {6, 8, 5}});
        System.out.println(value);
        positionChange(new int[][]{{4, 2, 1, 3}, {3, 7, 9, 6}, {6, 8, 5, 8}});
        arraysSort(new int[][]{{4, 2, 1, 3}, {3, 7, 9, 6}, {6, 8, 5, 8}});
        int max = column(new int[][]{{4, 2, 1, 3},
                                     {3, 7, 9, 6},
                                     {6, 8, 5, 8}},1);
        System.out.println(max);
    }
    public static int column(int [][] arr2D, int column){
        int theBiggestVal = 0;
        for (int i = 0; i < arr2D.length; i++) {
            if (arr2D[i][column]>theBiggestVal){
                theBiggestVal = arr2D[i][column];
            }
        }
        return theBiggestVal;
    }
    //відсортувати 2д масивa
    public static void arraysSort(int [][] arr2D){
        int counter = 0;
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                counter++;
            }
        }
        int index = 0;
        int [] arrDest = new int[counter];
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arrDest[index++] = arr2D[i][j];
            }
        }
        Arrays.sort(arrDest);
        int index1 = 0;
        for (int i = 0; i < arr2D.length ; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arr2D[i][j] = arrDest[index1++];
            }
        }
        System.out.println(Arrays.deepToString(arr2D));
    }

    //приймаємо 2д, та розвертаємо значення в його рядках
    public static void positionChange(int[][] arr2D) {
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0, k = arr2D[j].length - 1; j < arr2D[i].length / 2; j++, k--) {
                int temp;
                temp = arr2D[i][j];
                arr2D[i][j] = arr2D[i][k];
                arr2D[i][k] = temp;
            }
        }
        System.out.println(Arrays.deepToString(arr2D));
    }

    //знайти найбільше число
    public static int findTheBiggestVal(int[][] arr2D) {
        int theBiggestValue = 0;
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (arr2D[i][j] > theBiggestValue) {
                    theBiggestValue = arr2D[i][j];
                }
            }
        }
        return theBiggestValue;
    }

    //ф-я приймаэ 2d масив і сортує в рядки
    public static void arr2dSort(int[][] arr2D) {
        for (int i = 0; i < arr2D.length; i++) {
            Arrays.sort(arr2D[i]);
        }
        System.out.println(Arrays.deepToString(arr2D));
    }

    public static int indexSum(int[][] arr2D) {
        int sum = 0;
        int highestIndex = 0;
        for (int i = 0; i < arr2D.length; i++) {
            int sumCurrent = 0;
            for (int j = 0; j < arr2D[i].length; j++) {
                sumCurrent += arr2D[i][j];
            }
            if (sum < sumCurrent) {
                highestIndex = i;
                sum = sumCurrent;
            }
        }
        return highestIndex;
    }

    // функція приймає два масива і повертає тру, якщо всі елементи другого масива є в першому
    public static boolean returnTrue(int[] arr, int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            int counter = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr1[i] == arr[j]) {
                    counter++;
                }
            }
            if (counter == 0) {
                return false;
            }
        }
        return true;
    }

    public static void counter(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    counter++;
                }
            }
            if (counter > 0) {
                continue;
            }
            counter = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    counter++;
                }
            }
            System.out.println(arr[i] + " = " + counter);
        }
    }

    public static void positionChange(int[][] arr, int row1, int row2) {
        int temp[] = arr[row1];
        arr[row1] = arr[row2];
        arr[row2] = temp;
        System.out.println(Arrays.deepToString(arr));
    }

    public static void arrSort(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
        System.out.println(Arrays.deepToString(arr));
    }

    public static void arrSort2d(int[][] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                counter++;
            }
        }
        int[] arrDest = new int[counter];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arrDest[index++] = arr[i][j];
            }
        }
        Arrays.sort(arrDest);
        index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                arr[i][j] = arrDest[index++];
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
