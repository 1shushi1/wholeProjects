package array2d;

import java.util.Arrays;
import java.util.Random;

public class Task2_2D {
    public static void main(String[] args) {
        String[] competitors = {"Vasya", "Ivan", "Sasha", "Dmytro", "Danylo"};
        int[][] points = {{0, 120, 10, 20, 110},
                {40, 120, 19, 90, 130},
                {23, 73, 34, 20, 12},
                {25, 29, 60, 130, 140,},
                {10, 14, 120, 150, 30}};
        int winnerNumber = 0;
        int sumWinner = points[0][0];
        int maxNum = points[0][0];
        for (int i = 0; i < points.length; i++) {
            int sum = points[0][0];
            int max = points[0][0];
            for (int j = 0; j < points.length; j++) {
                sum += points[i][j];
                if (max < points[i][j]) {
                    max = points[i][j];
                }
            }
            if (max > maxNum) {
                maxNum = max;
                winnerNumber = i;
            } else if (max == maxNum && sum > sumWinner) {
                sumWinner = sum;
                winnerNumber = i;
            }
        }
        System.out.println("The winner is : " + competitors[winnerNumber]);
        int[][] inserting = new int[3][];
        int[] oneDArray = {3, 5, 2};
        inserting[0] = oneDArray;
        inserting[1] = new int[]{4, 6};
        inserting[2] = new int[50];
        System.out.println(Arrays.deepToString(inserting));
        //є масив 2д. відсортувати його рядки

        int[][] arr = {{4, -3, 2},
                {0, 4, 6, 5},
                {3, 1},
                {2, 5, 6, 7, 9}};
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
        System.out.println(Arrays.deepToString(arr));
        //є 1д масив. Побудувати по ньому 2д масив
        int[] arr1 = {4, 2, 1, 5};
        int[][] arrSkeleton = new int[arr1.length][];
        Random r = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arrSkeleton[i] = new int[arr1[i]];
            for (int j = 0; j < arrSkeleton[i].length; j++) {
                int randNum = r.nextInt(20 - -10) + -10;
                arrSkeleton[i][j] = randNum;
            }
        }
        System.out.println(Arrays.deepToString(arrSkeleton));
        //є масив 2д та 2 інта - номери рядків для обміну
        int[][] exchange = {{12, 5, 78, 3}, {1, 4, 2, 3}, {10, 6, 3, 11}, {8, 6, 7, 9}};
        int a = 3;
        int b = 1;
        int [] temp;
        temp = exchange[a];
        exchange[a] = exchange[b];
        exchange[b] = temp;
//        for (int i = 0; i < exchange.length; i++) {
//            for (int j = 0; j < exchange.length; j++) {
//                if (i == a){
//                    int temp;
//                    temp = exchange[i][j];
//                   exchange[i][j] = exchange[b][j];
//                    exchange[b][j] = temp;
//                }
//            }
//        }
        System.out.println(Arrays.deepToString(exchange));

    }
}
