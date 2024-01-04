package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        char [] arr = {'k', 'h', 'f'};
        int mn = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<arr[mn]){
                mn = i;
            }
            System.out.println((int)arr[i] + " - " +  arr[i]);
        }
        System.out.println("The smallest symbol is: " + mn);
    }
}
