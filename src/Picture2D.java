import java.util.Arrays;
import java.util.Scanner;

public class Picture2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a symbol to draw a picture : ");
        String symbol1 = scanner.next();
//        picture(new int [5][5], symbol1);
//        picture2(new int[6][6], symbol1);
        outsidePrint(new int[5][4], symbol1);
        lettersChanger(new char[]{'f', 'A', 't', '$', 'R', 'i', '4'});
        stringCorrection("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.", 8);
        int n = productOfNumber(new int[]{4, 7, -3, 9, 8, -2, -6, 5, 12, 3});
        System.out.println();
        System.out.println(n);
        int ne = productOfNum(new int[]{4, 7, -3, 9, 8, -2, -6, 5, 12, 3});
        System.out.println(n);
        clockTime(9, 10, 40);

    }
    // функція приймає години, хвилини та заряд батереї, та друкує години-хвилини в форматі часу.
    // 1% втрачається за 5 годин часу
    public static void clockTime(int hours, int minutes, int batteryPercentage){
        int counter = 0;
        while (batteryPercentage > 0){
            minutes++;
            if (minutes == 60){
                counter++;
                hours++;
                minutes = 0;
            }
            if (hours == 24){
                hours = 0;
            }
            if (counter == 5){
                batteryPercentage--;
                counter = 0;
            }
            if (hours < 10){
                System.out.print("0" + hours);
            }
            else {
                System.out.print(hours);
            }
            if (minutes < 10){
                System.out.println(" : 0" + minutes);
            }
            else{
                System.out.println(" : " + minutes);
            }
            }
    }
    //приймаємо масив інтів та повертаємо найбільший добуток двох чисел з нього
    public static int productOfNum(int[] arr) {
        Arrays.sort(arr);
        if (arr[0] * arr[1] > arr.length - 1 * arr.length - 2) {
            return arr[0] * arr[1];
        } else {
            return arr[arr.length - 1] * arr[arr.length - 2];
        }
    }

    public static int productOfNumber(int[] arr) {
        int theBiggestProductNumberPositive = 0;
        int theBiggestProductNumberNegative = 0;
        int theBiggestNum = arr[0], secondBiggestNum = arr[0];
        int theSmallestNum = arr[0], secondSmallestNum = arr[0];
        Arrays.sort(arr);
        theSmallestNum = arr[0];
        secondSmallestNum = arr[1];
        theBiggestNum = arr[arr.length - 1];
        secondBiggestNum = arr[arr.length - 2];
        theBiggestProductNumberNegative = theSmallestNum * secondSmallestNum;
        theBiggestProductNumberPositive = theBiggestNum * secondBiggestNum;
        if (theBiggestProductNumberNegative > theBiggestProductNumberPositive) {
            return theBiggestProductNumberNegative;
        } else {
            return theBiggestProductNumberPositive;
        }
    }

    public static void stringCorrection(String text, int numberLimit) {
        char[] arr = text.toCharArray();
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            counter++;
            if (counter == numberLimit) {
                counter = 0;
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i]);
            }
        }
    }

    public static void outsidePrint(int[][] arr, String symbol) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= arr[i].length; j++) {
                if (i == 0 || i == arr.length - 1 || j == 0 || j == arr[i].length - 1) {
                    System.out.print(symbol + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    //ф-я приймає масив типу чар та в буквах змінює регістр на протилежний
    public static void lettersChanger(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] -= 32;
            } else if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] += 32;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
//    public static void picture2 (int [][] arr, String symbol){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (i != 0 && j != 0 && i != arr.length - 1 && j != arr[i].length - 1){
//                    System.out.print(symbol + "  ");
//                }
//            }
//            System.out.println();
//        }
//    }
//    public static void picture (int [][] arr, String symbol){
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(symbol);
//            for (int j = 0; j < arr[i].length; j++) {
//                if (i == arr[i].length - 1){
//                    System.out.print(symbol + "  ");
//                }
//            }
//        }
//        System.out.println();
}
