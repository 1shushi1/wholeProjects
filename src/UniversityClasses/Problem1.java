package UniversityClasses;

public class Problem1 {
    public static void main(String[] args) {
        int [] arr = {4, 6, 2, -5, -8, 9, 23, 6, 6, -5, -8, 19};
        int mn = arr[0];
        int mx = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>mx){
                mx = arr[i];
            }
            else if (arr[i]<mn){
                mn = arr[i];
            }
        }
        System.out.println(mx - mn);
    }
}
