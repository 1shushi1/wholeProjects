package strings;

import java.util.Arrays;

public class StringRevision {
    public static void main(String[] args) {
        int oneByOneNumCounter = oneByOneCounter("a31cd825k9");
        System.out.println(oneByOneNumCounter);
        String [] arr = stringDevisor("abc kl mv", ' ');
        System.out.println(Arrays.toString(arr));
        //Arrays.toString - дуркує весь масив без дужок
        //arr[i] - друкує кожне символ по окремості, але це тільки працює в форі
        //якщо написати назву масива, то воно роздрукує тільки ярлики
        String word = textWithOutNumbers("H3ell0o");
        System.out.println(word);
        String replacedWord = replace("приймає стрінг та ще 2 стрінга: перший - що замінюється а другий - чим замінюється", "стрінг", "String");
        System.out.println(replacedWord);
        boolean answer = numberFinder(new int[]{1,3,2,4,1,3,5,9,9,1,3,7,5}, new int[]{1,3,7});
        System.out.println(answer);
        int length = lengthCompare("повернути довжину самого довшого стрінга розділеного пробілом");
        System.out.println(length);
        int number = theMostFrequentElement(new int[]{1,3,2,4,1,3,5,9,9,1,3,7,5});
        System.out.println(number);
    }

    //приймаємо стрінг та повертаємо найбільшу кількість цифр, що йдуть попідряд
    public static int oneByOneCounter(String word) {
        int counterMax = 0;
        char[] arr = word.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int currentCounter = 0;
            if (arr[i] >= '0' && arr[i] <= '9') {
                for (int j = i; j < arr.length; j++) {
                    if (!(arr[j] >= '0' && arr[j] <= '9')) {
                        break;
                    }
                    currentCounter++;
                }
                if (counterMax < currentCounter) {
                    counterMax = currentCounter;
                }
            }
        }
        return counterMax;
    }
    //приймаємо стрінг та чар та повертаємо масив стрінгів, розбитих цим чаром
    public static String [] stringDevisor(String sentence, char symbol){
        int counter = 0;
        char [] arr = sentence.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == symbol){
                counter++;
            }
        }
        int index = 0;
        String word = "";
        String [] arrString = new String[counter+1];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != symbol){
                word += arr[i];
                if (i == arr.length - 1){
                    arrString[index++] = word;
                }
            }
            else {
                arrString[index++] = word;
                word = "";
            }
        }
        return arrString;
    }
    //приймаэмо стрінг та повертаємо стрінг без цифр
    public static String textWithOutNumbers(String word){
        String newWord = "";
        char [] arr = word.toCharArray();
        for (int i = 0; i < arr.length ; i++) {
            if (!(arr[i] >= '0' && arr[i] <= '9')){
                newWord+=arr[i];
            }
        }
        return newWord;
    }
    //ф-я приймаэ стрынг та ше 2 стрынга: перший - що замінюється а другий - чим замінюється
    //not done yet
    public static String replace(String text, String whatWeReplace, String withWhatWeReplace){
        String empty = "";
        int index = 0;
        char [] textArray = text.toCharArray();
        char [] whatWeReplaceArr = whatWeReplace.toCharArray();
        char [] withWhatWeReplaceArr = withWhatWeReplace.toCharArray();
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i] == whatWeReplaceArr[0]){
                for (int j = 0; j < whatWeReplaceArr.length; j++) {
                    if (textArray[i] == whatWeReplaceArr[j]){
                        empty += withWhatWeReplaceArr[j];
                    }
                    else {
                        empty += textArray[i];
                    }
                }
            }
        }
        return empty;
    }
    //ф-я приймає 2 масиви та повертає тру якщо другий є повністю в першому
    public static boolean numberFinder(int [] arr, int [] number){
       vasya : for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number[0]){
                for (int j = 0; j < number.length; j++, i++) {
                    if (arr[i] != number[j]){
                        continue vasya;
                    }
                }
                return true;
            }
        }
        return false;
    }
    //повернути довжину самого довшого стрінга розділеного пробілом
    public static int lengthCompare(String word){
        int max = 0;
        String [] arr = stringDevisor(word, ' ' );
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > max){
                max = arr[i].length();
            }
        }
        return max;
    }
    //приймаємо масив та повертаємо найчастіше зустрічаєме значення
    public static int theMostFrequentElement(int [] arr){
        int value = 0;
        int maxCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    counter++;
                }
            }
            if (counter > maxCounter){
                maxCounter = counter;
                value = arr[i];
            }
        }
        return value;
    }
}
