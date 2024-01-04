package arrays;

import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        //є 2 масиви та інт число - куди другий вставляється в перший
        int [] arr1 = {2, 1, 4, 3, 6};
        int [] arr2 = {5, 8, 9};
        int index = 2;
        int [] destination = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, destination, 0, index);
        System.arraycopy(arr2, 0, destination,index, arr2.length);
        System.arraycopy(arr1, index, destination, index+arr2.length,arr1.length-index);
        System.out.println(Arrays.toString(destination));

    }
}
