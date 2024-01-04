package GameTicToe;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game1 {
    public static void main(String[] args) {
        game();
    }

    private static void game() {
        char[][] arrChar = {{'*', '*', '*'}, {'*', '*', '*'}, {'*', '*', '*'}};
        print(arrChar);
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        char player = r.nextBoolean() ? 'X' : '0';
        for (int i = 0; i < 9; i++) {
            System.out.println("It's '" + player +  "' turn");
            System.out.println("Select your x-cord : ");
            int x = s.nextInt();
            System.out.println("Select your y-cord : ");
            int y = s.nextInt();
            if (arrChar[x][y] != '*' ){
                System.out.println("Select other position");
                i--;
                continue;
            }
            arrChar [x][y] = player;
            if (arrChar [x][0] == player && arrChar [x][1] == player && arrChar[x][2] == player ||
                arrChar [0][y] == player && arrChar [1][y] == player && arrChar [2][y] == player ||
                arrChar [0][0] == player && arrChar [1][1] == player && arrChar [2][2] == player || arrChar [0][2] == player && arrChar [1][1] == player &&  arrChar [2][0] == player) {
                System.out.println("Player " + player + " win the game");
                return;
            }
            print(arrChar);
            player = player == 'X'?'0':'X';
        }
        System.out.println("Draw");
    }

    private static void print(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " " + Arrays.toString(arr[i]));
        }
        System.out.println("   0  1  2");
    }
}
