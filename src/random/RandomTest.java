package random;

import javax.swing.plaf.IconUIResource;
import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        boolean bool = r.nextBoolean();
        System.out.println(bool);
        int num = r.nextInt(56); //0    56
        System.out.println(num);
        // (max - min) + min
        //   -13   19
        num = r.nextInt(19 - -13)+ -13;
        System.out.println(num);
//20 випадкових від 3 до 17
        for (int i = 0; i < 20; i++) {
            int num1 = r.nextInt(17-3)+3;
            System.out.print(num1);
        }
        System.out.println();
//        System.out.println(num1);
        //генерувати випадкові числа від -34 до 43 поки не випаде 0
        for (; ; ) {
            int num1 = r.nextInt(43 -  - 34) + -34;
            System.out.print(num1 + " ");
            if (num1 == 0){
                break;
            }
        }
        // згенерувати 160 випадкових чисел від 0 до 170. Якщо число кратне 3, то виписати його та що воно кратне 3.
        // Тпе ссаме для 5 та 15, АлЕ якщо число кратне 15, то випписувати його кратність 3 та 5 не треба, бо це і так очевидно
        for (int i = 0; i<=160; i++) {
            int value = r.nextInt(170);
            if (value == 0){
                continue;
            }
            if (value%15==0){
                System.out.println("Value multiple 15: " + value);
                continue;
            }if(value%5==0){
                System.out.println("Value multiple 5: " + value);
            }if(value%3==0){
                System.out.println("Value multiple 3: " + value);
            }
        }
        // згенерувати 20 випадкових віж -14 до 21. Знайти максимум та мінімум
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 20 ; i++) {
            int rand = r.nextInt(21 - - 14) + -14;
            System.out.print(rand + " ");
            if (rand>max){
                max = rand;
            }if (rand<min){
                min = rand;
            }
        }
        System.out.println("Min num is: " + min);
        System.out.println("Max num is: " + max);
        //25 випадкових від -13 до 29. Кількість непарних?
        int counter = 0;
        for (int i = 0; i < 25; i++) {
            int rand1 = r.nextInt(29 - - 13) + -13;
            System.out.print(rand1 + " ");
            if (rand1%2!=0){
                counter++;
            }
        }
        System.out.println("\nA number of odd values: " + counter);
        //16 випадкових буленів. Кого більше?
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < 16 ; i++) {
            boolean rand2 = r.nextBoolean();
            System.out.print(rand2 + " ");
            if (rand2==true) {
                counter1++;
            }
            else {
                counter2++;
            }
        }
        System.out.println();
        if (counter1>counter2){
            System.out.println("True " + counter1);
        }else if (counter2>counter1){
            System.out.println("False " + counter2);
        }else {
            System.out.println("Equal to each other");
        }
        //20 випадкових від -10 до 10. Середнє додантіх
        int counter3 = 0;
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            int num1 = r.nextInt(10 - - 10)+ - 10;
            System.out.println(num1 + " ");
            if (num1>0){
                counter3++;
                sum = sum + num1;
            }
        }
        System.out.println("The number of positive values: " + counter3);
        System.out.println("The sum of values: " + sum);
        System.out.println("Average of values is: " + (double)sum/counter3);
    }
}
