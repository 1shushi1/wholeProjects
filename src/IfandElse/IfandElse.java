package IfandElse;

public class IfandElse {
    public static void main(String[] args) {
//        // є температура. Є змінна  сигнал, що  залежить від темп.   Якщо температупа нижче 20, то сигнал стає -50, інакше сигнал 45
//        int signal;
//        int tem = 10;
//        signal = tem < 20 ? -50 : 45;
        // є  2 змінні. Є третя   мах. записати в неї макс значення з них
        int a = 10;
        int b = 11;
        int max = 0;
//        if (a>b){
//            max = a;
//        }else{
//            max = b;
//        }
//        System.out.println(max);
        max = a > b ? a : b;
        System.out.println(max);
        // є  температкра. В змінну типу стрінг погода записати  слово хороша, якщо  температура не нижче 25 град, та погана, інакше
        int tempe = 12;
        String weather;
//        if (tempe>=25){
//            weather = "Good";
//        }else {
//            weather = "Bad";
//        }
//        System.out.println(weather);
        weather = tempe <= 25 ? "bad" : "good";
        System.out.println(weather);

        String month = "september";
        switch (month) {
            case "september":
            case "october":
            case "november":
                System.out.println("fall");
                break;
            case "december":
                System.out.println("winter");
                break;
            default:
                System.out.println("not a season");
        }
        // є 3 людини з віком. Всі повнолітні?
        int age1 = 21;
        int age2 = 19;
        int age3 = 23;
//        if (age1==18 && age2==18 && age3==18){
//            System.out.println("Everyone is adult");
//        }else{
//            System.out.println("Not everyone is adult");
//        }
        System.out.println((age1 >= 18 && age2 >= 18 && age3 >= 18) ? "Everyone is adult" : "Not everyone is adult");
        //є макс глибина в дайвингу 40м. Занурювались 3 разина різні глибини. Хоч раз перевищили граничне?
        int first = 12;
        int second = 5;
        int third = 41;
        int maxDeep = 40;
        if (first <= maxDeep && second <= maxDeep && third <= maxDeep) {
            System.out.println("The maximum deepness wasn't exceeded");
        } else {
            System.out.println("The maximum deepness was exceeded");
        }
        //є 3 змінні та макс. Записати в макс максимальне з трьох
        int num = 10;
        int num1 = 13;
        int num2 = 17;
        int maximumNum = 0;
        if (num > num1 && num > num2) {
            maximumNum = num;
        } else if (num1 > num && num1 > num2) {
            maximumNum = num1;
        } else {
            maximumNum = num2;
        }
        System.out.println(maximumNum);
        //        if (a1>b1 && a1>c1){
//            max1 = a1;
//        }if (b1>a1 && b1>c1){
//            max1 = b1;
//        }if (c1>a1 && c1>b1){
//            max1 = c1;
//        }
//        if (a1<b1 && a1<c1){
//            min = a1;
//        }if (b1<a1 && b1<c1){
//            min = b1;
//        }if (c1<a1 && c1<b1){
//            min = c1;
//        }
//        if (a1>b1 && b1>c1){
//            mid = b1;
//        }if (b1>c1 && c1>a1){
//            mid = c1;
//        }if (c1>a1 && a1>b1){
//            mid = a1;
//        }
//        System.out.println(min);
//        System.out.println(mid);
//        System.out.println(max1);
        int a1 = 100;
        int b1 = 1;
        int c1 = -200;
        if (b1<a1 && b1<c1){
            int temp;
            temp = b1;
            b1 = a1;
            a1 = temp;
        }
        if (c1<a1 && c1<b1){
            int temp = c1;
            c1 = a1;
            a1 = temp;
        }
        if (b1>c1){
            int temp = b1;
            c1 = b1;
            b1 = temp;
        }

        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
    }
}
