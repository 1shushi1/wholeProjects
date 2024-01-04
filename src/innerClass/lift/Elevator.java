package innerClass.lift;

import java.util.Random;
import java.util.Scanner;

public class Elevator {
    private Cabine cabine;
    private Controller controller = new Controller();
    private Motor motor = new Motor();
    private Scanner s = new Scanner(System.in);
    private int floors;
    public Elevator(){
        Random r = new Random();
        System.out.println("Enter an amount of floors");
        floors = s.nextInt();
        int number = r.nextInt(floors) + 1;
        System.out.println(number);
        cabine = new Cabine(number);
        motor.cabineConnector(cabine);
    }
    public void connectPult(Pult pult){
        pult.connector(controller);
    }
    public class Controller{
        public void upDown(int number){
            if (number <= 0 || number > floors){
                return;
            }
           if (cabine.getNumber() > number){
               int res = cabine.getNumber() - number;
               motor.down(res);
               cabine.doorOpenClose();
           }
           else {
               int res = number - cabine.getNumber();
               motor.up(res);
               cabine.doorOpenClose();
           }
        }
    }
}
