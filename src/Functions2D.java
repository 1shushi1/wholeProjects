import java.util.Arrays;
import java.util.Scanner;

public class Functions2D {
    public static void main(String[] args) {
        //змінна типу стрінг з назвою місяць, за допомогою світч кейча визначити сезон
//        Scanner s = new Scanner(System.in);
//        String month = s.nextLine();
//        switch (month){
//            case "September" :
////                System.out.println("Fall");
////                break;
//            case "October" :
////                System.out.println("Fall");
////                break;
//            case "November" :
//                    System.out.println("Fall");
//                    break;
//            case "December" :
//                System.out.println("Winter");
//                    break;
//            case "January" :
//                System.out.println("Winter");
//                break;
//            case "February" :
//                System.out.println("Winter");
//                break;
//            default :
//                System.out.println("Not a season");
//        }
//        arrMix(new int[]{-9, 5, -2, 3, 2, 8, -8, -4, 7, -6});
//        arr(new int[][]{{12, 5, 78, 3}, {1, 4, 2, 3}, {10, 6, 3, 11}, {8, 6, 7, 9}});
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Вибери функцію 1 - перетворення 2д на 1д, 2 - розставляє в шахматному порядку, 3 - пошук найбільшого числа, 4 - вихід");
            int selection = scanner.nextInt();
            switch (selection) {case 1:
                System.out.println(Arrays.toString(arr(new int[][]{{12, 5, 78, 3}, {1, 4, 2, 3}, {10, 6, 3, 11}, {8, 6, 7, 9}})));
//                    int [] arr = arr(new int[][]{{12, 5, 78, 3}, {1, 4, 2, 3}, {10, 6, 3, 11}, {8, 6, 7, 9}});
//                    System.out.println(Arrays.toString(arr));
                    break;
                    case 2: arrMix(new int[]{-9, 5, -2, 3, 2, 8, -8, -4, 7, -6});
                    break;
                case 3 : int value  = biggestSymbol(new char[]{'3','t','5','9','r'});
                    System.out.println(value);
                break;
                case 4 : System.exit(0);
                default :
                    System.exit(0);
            }
        }
    }

    //приймаємо 2д масив, повертаємо 1д через аррей копі
    public static int[] arr(int[][] arr2D) {
        int counter = 0;
        for (int i = 0; i < arr2D.length; i++) {
            counter += arr2D[i].length;
        }
        int[] arr = new int[counter];
        int addings = 0;
        for (int i = 0; i < arr2D.length; i++) {
            System.arraycopy(arr2D[i], 0, arr, addings, arr2D[i].length);
            addings += arr2D[i].length;
        }
        return arr;
    }

    //функція приймає 1д з одинаковою кількістю додатніх і відємних елементів і розставляє їх в шахматному порядку
    public static void arrMix(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0, j = arr.length - 1; i < arr.length/2; i+=2, j-=2) {
            int temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    // функція приймає масив чарів та повертає найбільшу цифру
    public static int biggestSymbol(char [] arr){
        char theBiggestValue = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9'){
                theBiggestValue = arr[i];
            }
        }
        return theBiggestValue - 48;
    }
}
