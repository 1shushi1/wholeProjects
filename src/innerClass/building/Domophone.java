package innerClass.building;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import innerClass.building.Building.Controller;

public class Domophone {
    private Scanner s = new Scanner(System.in);
    private Controller controller;
    public void connector(Controller controller){
        this.controller = controller;
    }
    public void enterNum(){
        System.out.println("Enter an apartment number");
        int apartmentNumber = s.nextInt();
        if (controller != null) {
            controller.apartmentCall(apartmentNumber);
        }
    }
}
