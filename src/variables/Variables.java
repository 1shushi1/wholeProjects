package variables;

public class Variables {
    public static void main(String[] args) {
        int y;
        int x = 10;
        int a = 5;
        y = (2*x+3)/(3*a) - (2*x)/(1+a);
        System.out.println(y);
        long cardNumber = 1234123412341234L;
        System.out.println(45); // int
        System.out.println("sum = " + 12 + 8); // int
        a = 12;
        int b = 8;
        System.out.println("sum = " + (a+b));
        System.out.println(23 + 5 + " = sum");
        System.out.println(5.0 / 2.0);
        a = 5;
        b = 2;
        System.out.println((double)a/b);
        float num = 5.6f; // double 8 byte     float 4 byte
        double h = (2.0*x+3)/(3*a) - (2.0*x)/(1+a);
        System.out.println(h);
        a = a + 3;
        a = 10;
//        a++;
//        System.out.println("a = "+ a);
        System.out.println("a = " + a++); //increment postfix
        System.out.println("a = "+a);
        a = 5;
        int k = 4 + a++;
        System.out.println("k = "+k);
        System.out.println("a = "+a);
        k = 4 - a++; // prefix
        System.out.println("k = "+k);
        System.out.println(k);
        a/=6; // a = a/6;
        // є 2 змінні. Обміняти в них значення місцями
        a = 3;
        b = -6;
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a "+a);
        System.out.println("b "+b);
        char m = '$';
        int value = m;
        System.out.println(value);
        boolean result = a>10;
        System.out.println(result);
        //є взуття з розміром. Є наш розмір. Зберігти результат порівння   чи нам підходить
        double size = 43.5;
        double mySize = 41.0;
        boolean shoes = size == mySize;
        System.out.println(shoes);
    }
}
