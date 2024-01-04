package strings;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String s = "Lorem ipsum, lorem lorem.";
        char[] arrChar = s.toCharArray();
        for (int i = 0; i < arrChar.length; i++) {
            System.out.println(arrChar[i]);
        }
//        System.out.println(Arrays.toString(arrChar));
        boolean password = password("Super hard password123");
        System.out.println(password);
        int count = valuesReturn(320060510);
        System.out.println(count);
        int sum = sum(3200605);
        System.out.println(sum);
        String t = "";
        t = 12 + t + 4;
        System.out.println(t);
        int count1 = valueRt(184.0236);
        System.out.println(count1);
        String newLetter = s("1h5t!i4");
        System.out.println(newLetter);
        String pass = spaceDel("     1h5t    !i4    ");
        System.out.println(pass);
        String text = sorting ("34hjsdfjkhs53242aasivuaei213");
        System.out.println(text);
        //--------------------------------------------------------------------------------------------------------------
        String task1 = "I hate to love you here";
        String [] arr = task1.split(" ");
        System.out.println(Arrays.toString(arr));
        int mid = arr.length / 2;
        System.out.println(arr[mid-1] + arr[mid]);
        //--------------------------------------------------------------------------------------------------------------
    }

    //ф-я приймає стрінг та повертає стрінг, в якому спочатку голосні, потім цифри, потім приголосні
    public static String sorting(String text) {
        String empty = "";
        String vowels = "";
        String numbers = "";
        String consonants = "";
        char[] arr = text.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                if (arr[i] == 'a' || arr[i] == 'i' || arr[i] == 'e' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'y') {
                    vowels += arr[i];
                }else {
                    consonants +=arr[i];
                }
            }
            if (arr[i] >= '0' && arr[i] <= '9') {
                numbers += arr[i];
            }
        }
        empty += vowels + " " +  numbers + " " +  consonants;
        return empty;
    }
    // є текст, треба виписати середнє слово та наступне за ним

    //ф-я приймає стрінг та прибирає з нього всі пробіли зліва та зправа та повертає результат
    public static String spaceDel(String pass) {
        String empty = "";
        char[] arr = pass.toCharArray();
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                start = i;
                break;
            }
        }
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] != ' ') {
                end = i;
                break;
            }
        }
        for (int i = start; i <= end; i++) {
            empty += arr[i];
        }
        return empty;
    }

    //приймаємо стрінг, повертаємо стрінг без цифр
    public static String s(String letters) {
        String emty = "";
        char[] arr = letters.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] >= '0' && arr[i] <= '9')) {
                emty += arr[i];
            }
        }
        return emty;
    }

    //приймаємо дабл, повертаємо кількість цифр після точки
    public static int valueRt(double values) {
        String s = values + "";
        int counter = 0;
        char[] backwards = s.toCharArray();
        for (int i = backwards.length - 1; i > 0; i--) {
            if (backwards[i] != '.') {
                counter++;
            } else {
                break;
            }
        }
        return counter;
    }

    //ф-я приймає інт та повертає суму його цифр
    public static int sum(int values) {
        String s = values + "";
        int sum = 0;
        char[] arrSum = s.toCharArray();
        for (int i = 0; i < arrSum.length; i++) {
            sum += arrSum[i] - 48;
        }
        return sum;
    }

    //ф-я приймає лонг, та повертає кількіть в ньому цифр
    public static int valuesReturn(long values) {
//        String a = values + "";
//        char [] arrChar = a.toCharArray();
//        int counter = 0;
//        for (int i = 0; i < arrChar.length; i++) {
//            counter ++;
//        }
//        return counter;
        return (values + "").length();
    }

    //ф-я приймає пароль у вигляді стрінга та повертає тру, якщо в ньому немає цифр
    public static boolean password(String pass) {
        char[] arrPass = pass.toCharArray();
        for (int i = 0; i < arrPass.length; i++) {
            if (arrPass[i] >= '0' && arrPass[i] <= '9') {
                return false;
            }
        }
        return true;
    }
}
