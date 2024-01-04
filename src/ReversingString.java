import java.util.Arrays;

public class ReversingString {
    public static void main(String[] args) {
        reversingString("dog");
        String text = reversString("Hello");
        System.out.println(text);
    }
    public static void reversingString (String txt){
        char [] arr = txt.toCharArray();
        for (int i = 0, j = arr.length - 1; i < arr.length/2; i++, j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        String reversedText = String.valueOf(arr);
        System.out.println(reversedText);
    }
    public static String reversString (String text){
        char [] arr = new char[text.length()];
        for (int i = text.length() - 1; i > 0; i++) {
            System.out.println(text.charAt(i));
        }
        return text;
    }
}
