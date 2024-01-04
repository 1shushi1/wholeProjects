package loops;

import java.util.Random;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while(i < 5){
            System.out.println("hello");
            i++;
        }
        // 20 випадкових чисел від -10 до 10
        Random r = new Random();
        int j = 0;
        while (j < 20){
            int rand = r.nextInt(10 - - 10) + - 10;
            System.out.print(rand + " ");
            j++;
        }
        System.out.println();
        //числа від -3 до -26 друкануть
        int a = -3;
        while (a >= -26){
            System.out.println(a);
            a--;
        }
        for (int k = 0; k > 10 ; k++) {

        }
    }
}
