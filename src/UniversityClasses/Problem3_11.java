package UniversityClasses;

public class Problem3_11 {
    public static void main(String[] args) {
        int [] arr1 = {1, 5, 8, 2, 6};
        pv(arr1);
    }
    public static void pv(int arr[]){
        int max = arr[0];
        for (int i = 0; i <arr.length; i++) {
            if (max<arr[i]){
                max = arr[i];
            }
        }
        for (int a = max; a > 0 ; a--) { //floor amount
            for (int b = 0; b < arr.length; b++) { //length of an array
                if (arr[b]>=a){
                    System.out.print(" *");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
