package functions;

import java.lang.reflect.Array;

public class FunctionTest {
    public static void main(String[] args) {
        Function.print();
        int d = 7 + 1 - 4;
        Function.print("Vasya", d);
        Function.print(-10, 20);
        Function.factorial(10);
//        int[] arr = {5, 10, -19, 2, 8, 12, 11, -23};
        Function.arrayCalc(new int []{5, 10, -19, 2, 8, 12, 11, -23});
        Function.addition(new int []{5, 10, -19, 2,}, new int []{8, 12, 11, -23}, 2);
        Function.delete(2, new int[]{1,2,3,4,5});
        Function.insert(7, 2, new int[]{1,2,3,4,5,6});
        Function.replacement(new char[]{'A', 'b', 'Y', 'C', 'w','h'});
        Function.counter(1000000);
    }
}
