package array2d;

import java.util.Arrays;
import java.util.Random;

public class Arrays2D {
    public static void main(String[] args) {
        int[][] arr = {{4, -3, 2},
                        {0, 4, 6, 5},
                        {3, 1},
                         {2, 5, 6, 7, 9}};
        System.out.println(arr[1][2]);
        arr[3][2] = 15;
        System.out.println(arr[3][2]);
        System.out.println(Arrays.deepToString(arr));
        System.out.println(arr[1].length);
        System.out.println(Arrays.toString(arr[1])); // певний массив
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        //знайтти макс тта мін в 2д-масиві
        System.out.println();
                int mn = arr[0][0];
                int mx = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < mn) {
                    mn = arr[i][j];
                }
                if (arr[i][j] > mx) {
                    mx = arr[i][j];
                }
            }
        }
        System.out.println(mn);
        System.out.println(mx);
        //є 2д, перетворити на 1д
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            counter += arr[i].length;
//            for (int j = 0; j < arr[i].length; j++) {
//                counter++;
//            }
        }
        int [] arrCopy = new int[counter];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arrCopy[index++] = arr[i][j];
            }
        }
        System.out.println(Arrays.toString(arrCopy));
        Random r = new Random();
        int [][] matrix  = new int[4][5];
        System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int rand = r.nextInt(20 - - 10) + - 10;
                matrix[i][j] = rand;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (j == 0 || i == matrix.length-1){
//                    System.out.print(matrix[i][j] + " ");
//                }
//                if (matrix[i][j]==matrix[0][0]){
//                    System.out.println(matrix[0][0]);
//                }
//                if (matrix[i][j]==matrix[1][0]){
//                    System.out.println(matrix[1][0]);
//                }
//                if (matrix[i][j]==matrix[2][0]){
//                    System.out.println(matrix[2][0]);
//                }
//                if (matrix[i][j]==matrix[3][j]){
//                    System.out.println(matrix[3][j].length);
//                }
//            }
//            System.out.println();
//        }
        //є матриця. друкануть сердцевину

//        for (int i = 0; i < matrix.length; i++) {
//            System.out.println(Arrays.toString(matrix[i]));
//        }
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (i != 0 && j !=0 && i!= matrix.length-1 && j != matrix[i].length - 1){
//                    System.out.print(matrix[i][j] + " ");
//                }
//            }
//            System.out.println();
//        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == 0 || j == matrix[i].length - 1 || i == 0 || i == matrix.length - 1){
                    System.out.print(matrix[i][j] + " ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        //є 2д матриця. Відсортувати її
        int counter2 = 0;
        int index2 = 0;
        for (int i = 0; i < arr.length; i++) {
            counter2 += arr[i].length;
        }
        int [] arrCopy2 = new int [counter2];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                arrCopy2[index2++] = arr[i][j];
            }
        }
        Arrays.sort(arrCopy2);
        index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = arrCopy2[index++];
            }
        }
        System.out.println(Arrays.deepToString(arr));
        //змішати 2д масив як карти
        System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int randRow = r.nextInt(arr.length);
                int randCol = r.nextInt(arr[randRow].length);
                int temp;
                temp = arr[randRow][randCol];
                arr[randRow][randCol] = arr[i][j];
                arr[i][j] = temp;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        //обчислити суму елементів по контуру прямокутного масиву
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0 || j == matrix[i].length - 1 || i == 0 || i == matrix.length - 1){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i>=j){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
