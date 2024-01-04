package codewars;

import java.util.Random;

public class GrassHopper {
    public static void main(String[] args) {
        Random r = new Random();
        int s1 = r.nextInt(100);
        int s2 = r.nextInt(100);
        int s3 = r.nextInt(100);

        char grade = getGrade(s1,s2,s3);
        System.out.println(grade);
    }

    public static char getGrade(int s1, int s2, int s3) {
        int avg = (s1+s2+s3)/3;
        if (avg >= 90 && avg <= 100){
            return 'A';
        }
        if (avg >= 80 && avg <= 90){
            return 'B';
        }
        if (avg >= 70 && avg <= 80){
            return 'C';
        }
        if (avg >= 60 && avg <= 70){
            return 'D';
        }
        if (avg >= 0 && avg <= 60){
            return 'F';
        }
        return 'l';
    }
}
