package FunctionsJava;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.println("Input the first number : ");
//        int a = s.nextInt();
//        System.out.println("Input the second number : ");
//        int b = s.nextInt();
//        System.out.println("Input the third number : ");
//        int c = s.nextInt();
//        System.out.println("The smallest value is : " + smallest(a, b, c));
        System.out.println("Input the first number : ");
        int a = s.nextInt();
        System.out.println("Input the second number : ");
        int b = s.nextInt();
        System.out.println("Input the third number : ");
        int c = s.nextInt();
        System.out.println("The average number is : " +average(a, b, c) );
    }
    static double smallest(int a, int b, int c) {
        int smallest;
        smallest = Math.min(Math.min(a, b), c);
        return smallest;
    }
    static int average (int a, int b, int c){
        int average;
        average = (a + b + c)/3;
        return average;
    }
}
