package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Problem3a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char [] arr = new char[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter 5 random characters: ");
            char a = s.next().charAt(0);
            arr[i] = a;
        }
    }
}
