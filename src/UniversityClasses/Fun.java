package UniversityClasses;

import java.util.Arrays;

public class Fun {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int x = arr[arr.length - 1];
        int y = arr[arr.length - 2];
        for (int i = 0; i < 2; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
        }
        arr[1] = x;
        arr[0] = y;
        System.out.println(Arrays.toString(arr));
    }
}
