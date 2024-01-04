package scanner;

import java.util.Random;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Insert a value :");
//        int scan = Integer.parseInt(s.nextLine());
//        System.out.println(scan);
//        System.out.println("Insert a text :");
//        String s1 = s.nextLine();
//        System.out.println(s1);
        guess();
    }
    //ф-я загадує число, в діапазоні та пропонує вгадати. якщо введено більше число, тоф-я каже що загадане менше та навпаки.
    // Після 3-х невірних спроб ідуть китайські попередження (1, 2 , 3 ..)
    public static void guess(){
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Wanna play some game?");
        String te = s.nextLine();
        if (te.equals("No")) return;
        System.out.println("The idea of the game is to guess riddled number");
        int num = r.nextInt(25 - 5) + 5;
        System.out.println("Select a random number between 5 to 25");
        int counter = 0;
        int counter1 = 0;
        for (;;){
            int rand = Integer.parseInt(s.nextLine());
            counter++;
            if (rand==num){
                System.out.println("Selected number was right"); return;
            }else {
                System.out.println("Try again");
            }
            if (rand > num){
                System.out.println("Random number is smaller than the inserted one");
            }else {
                System.out.println("Random number is bigger than the inserted one");
            }
            if (counter >= 3){
                counter1++;
                System.out.println(counter1 + " Chinese Warning!!!");
            }
        }
    }
}
