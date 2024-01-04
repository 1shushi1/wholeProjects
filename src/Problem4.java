import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        int [] arr = {2,3,4,3,2,6,3,6,8,2,9 };
       label : for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i ; j++) {
                if (arr[i]==arr[j]){
                    continue label;
                }
            }
           System.out.println(arr[i]);
        }
    }
}
