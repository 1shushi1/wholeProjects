package functions;

import java.util.Arrays;
import java.util.Random;

public class Functions {
    public static void main(String[] args) {
        int[] dest = converter(new int[][]{{3, 4, 1, 5}, {0, 4, 6, 5}, {3, 1}, {2, 5, 6, 7, 9}});
        System.out.println(Arrays.toString(dest));
    int [][] values = from1Dto2D(new int[]{4,3,5});
        System.out.println(Arrays.deepToString(values));
        int [][] sorting = sorting(new int[][]{{3, 4, 1, 5}, {0, 4, 6, 5}, {3, 1}, {2, 5, 6, 7, 9}});
        System.out.println(Arrays.deepToString(sorting));
        int [][] rotating = rotate(new int [][]{{3, 4, 1, 5}, {0, 4, 6, 5}});
        System.out.println(Arrays.deepToString(rotating));
    }
    //приймаємо 2д та розвертаємо дзеркально значення в рядках
    public static int [][] rotate(int [][] arrRotate){
        for (int i = 0, j = arrRotate.length - 1; i < arrRotate.length; i++, j--) {
            arrRotate[i] = arrRotate[j];
        }
        return arrRotate;
    }
    //ф-я приймає 2д масив типу інт та сортує його рядки
    public static int [][] sorting(int [][] arr2D){
        for (int i = 0; i < arr2D.length; i++) {
                Arrays.sort(arr2D[i]);
        }
        return arr2D;
    }

    //ф-я приймає 2д масив та повертає 1д з елементів цього 2д
    public static int[] converter(int[][] arr2D) {
        int counter = 0;
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                counter++;
            }
        }
        int[] arrDest = new int[counter];
        int index = 0;
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arrDest[index++] = arr2D[i][j];
            }
        }
        return arrDest;
    }
    public static int[][] from1Dto2D (int [] arrRand){
        Random rand = new Random();
        int [][] arr2D = new int[arrRand.length][];
        for (int i = 0; i < arr2D.length; i++) {
            int [] arr = new int[arrRand[i]];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = rand.nextInt(10 - - 7)+ - 7;
            }
            arr2D[i] = arr;
        }
        return arr2D;
    }
}
