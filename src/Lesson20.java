import java.util.Scanner;

public class Lesson20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Hi, if you are interested in calculating you daily/weekly/monthly/yearly income, then type type " + "'" +
                "Yes" + "'" + "not interested type " + "'" + "No" + "'" );
        String answer = s.next();


    }
}
class Income{
    int salaryPerHour;
    int workingDays;
    int workingHoursPerDay;
    public static void incomeCalculation(int salaryPerHour, int workingDays, int workingHoursPerDay){
        int dailyIncome = salaryPerHour * workingHoursPerDay;
    }
}
