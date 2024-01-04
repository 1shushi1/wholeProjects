package arrays;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        int [] arr = {4, 7, -3, 9, 8, -2, -6, 5, 12, 83};
        int [] arr1 = new int[4];
        System.arraycopy(arr,4, arr1, 0, 4);
        // 1 - name of the source we output data;0
        // 2 - start position source array
        // 3 - destination array
        // 4 - start position destination array
        // 5 - amount of elements from source array
        System.out.println(Arrays.toString(arr1));
        //видалити першу комірку масива
        int [] arrTest = {4, 7, -3, 9, 8, -2, -6, 5, 12, 83};
        int [] arrNew = new int[arrTest.length-1];
        System.arraycopy(arrTest, 1, arrNew, 0, arrTest.length-1 );
        System.out.println(Arrays.toString(arrNew));
        //зклеїти 2 масиви
        int [] arrOne = {4, 7, -3, 9, 8, -2, -6, 5, 12, 83};
        int [] arrTwo = {71, -13, 30, 8, 5, 9, 7};
        int [] arrReciever = new int [arrOne.length + arrTwo.length];
        System.arraycopy(arrOne, 0, arrReciever, 0, arrOne.length);
        System.arraycopy(arrTwo, 0, arrReciever, arrOne.length, arrTwo.length );
        System.out.println(Arrays.toString(arrReciever));
        //є масив та інт число - номер комірки для видалення
        int [] arr2 = {71, -13, 30, 8, 5, 9, 7};
        int a = 5;
        int [] numOne = new int [arr2.length - 1];
        System.arraycopy(arr2,0, numOne,0, a);
        System.arraycopy(arr2, a+1, numOne, a, arr2.length-a-1);
        System.out.println(Arrays.toString(numOne));
        //є 2 масиви та інт число - куди другий вставляється в перший

    }
}
