package loops;

public class ForLoop {
    public static void main(String[] args) {
        //друкануть числа выд -13 до 23 з кроком 3
        int n = 23;
        for (int i = -13; i <= n; i += 3) {
            System.out.print(" " + i);
        }
        System.out.println();
        System.out.println("*********************");
        //-4 до -31 крок 3
        for (int j = -4; j >= -31; j -= 3) {
            System.out.print(" " + j);
        }
        System.out.println();
        System.out.println("**********************");
        //від 32.5   до 2.46  крок 3.32
        double n1 = 2.46;
        for (double i = 32.5; i >= n1; i = Math.round((i-=3.32)*1000)/1000.0){
//            i = Math.round(i*1000)/1000.0;
            System.out.print(i + " ");
        }
        double value1 = 14.897345; // 14.897
        System.out.println("\n" + Math.round(value1 * 1000)/1000.0);
        value1 = Math.round(value1 * 1000)/1000.0;
        //числа від -17 до 32 крок 1, друканути тільки числа -7    0 та  18

        for (int i = -17; i <=32; i++) {
            if (i!=-7 && i!=0 && i!=18){
                System.out.println(i);
            }
        }

    }
}
