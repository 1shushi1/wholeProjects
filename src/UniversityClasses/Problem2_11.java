package UniversityClasses;

import java.util.Arrays;

public class Problem2_11 {
    public static void main(String[] args) {
        int [] arr1 = {4, 6, 2, -5, -8, 9};
        int [] arr2 = {23, 6, 6, -5, -8, 19};
        int [] destination = new int[arr1.length + arr2.length];
        int [] destination2;
        int mn = destination[0];
        int mx = destination[0];
        System.arraycopy(arr1, 0, destination,0, arr1.length);
        System.arraycopy(arr2, 0, destination, arr1.length, arr2.length);
        System.out.println(Arrays.toString(destination));
        for (int i = 0; i < destination.length ; i++) {
            if (destination[i]>mx){
                mx = destination[i];
            }
            else if (destination[i]<mn){
                mn = destination[i];
            }
        }
        System.out.println(mn);
        System.out.println(mx);
        int temp;
        temp = mx;
        mx = mn;
        mn = temp;
        System.out.println(mn);
        System.out.println(mx);
    }
}
