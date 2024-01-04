package strings;

import java.util.Arrays;

public class StringSec {
    public static void main(String[] args) {
        String sorting = alphabetSort("2a3!kb3y8ihdr9:");
        System.out.println(sorting);
        System.out.println();
        stringPrints(new String[]{"trea34sure19", "pirat", "turkey00", "jungle", "monkey", "dolphin18"});
        int correctNum = lastInt("a23b867poasdf");
        System.out.println(correctNum);
    }
    //ф-я приймає стрінг та повертає саме останнє число в ньому
    public static int lastInt(String text){
        String empty = "";
        char [] arrChar = text.toCharArray();
        boolean found = false;
        for (int i = arrChar.length - 1; i >= 0; i--) {
            if (arrChar[i] >= '0' && arrChar[i] <= '9'){
                empty = arrChar[i] + empty;
                found = true;
            }else if (found == true){
                return Integer.parseInt(empty);
            }
        }
        return -2;
    }

    //ф-я приймає масив стрингів та друкує ті стрінги, в яких є цифри
    public static void stringPrints(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            String current = arr[i];
            char[] arrChar = current.toCharArray();
            int counter = 0;
            for (int j = 0; j < arrChar.length; j++) {
                if (arrChar[j] >= '0' && arrChar[j] <= '9') {
                    counter++;
                    break;
                }
            }
            if (counter == 0){
                System.out.println(current);
            }
        }
    }

    //ф-я приймає стрінг та повертає стрінг в якому букви та вони по абетці з кінця
    public static String alphabetSort(String text) {
        String empty = "";
        char[] arr = text.toCharArray();
        Arrays.sort(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                empty += arr[i];
            }
        }
        return empty;
    }
}
