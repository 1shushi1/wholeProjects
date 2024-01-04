package innerClass.lift;

import java.util.Scanner;
import innerClass.lift.Elevator.Controller;

public class Pult {
    private Controller controller;
    private int number;
    private Scanner s = new Scanner(System.in);
    public void pressButton(){
        System.out.println("Enter floor on what you are staying");
        number = s.nextInt();
        controller.upDown(number);
    }
    public void connector(Controller controller){
        this.controller = controller;
        while(true) {
            pressButton();
        }
    }
}
