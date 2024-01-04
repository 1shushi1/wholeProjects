package innerClass.building;

import java.util.ArrayList;
import java.util.Scanner;

public class Building {
    private ArrayList<ArrayList<Apartment>> apartments = new ArrayList<>();
    private Controller controller = new Controller();
    private Scanner s = new Scanner(System.in);
    private Domophone domophone = new Domophone();

    public Building(){
        System.out.println("How many floors would you like to have?");
        int floorAmount = s.nextInt();
        for (int i = 0; i < floorAmount; i++){
            ArrayList<Apartment> floor = new ArrayList<>();
            System.out.println("How many apartments on floor " + i + "?" );
            int apartmentsAmount = s.nextInt();
            for (int j = 0; j < apartmentsAmount; j++) {
                int apartmentNumber = (i+1) * 10 + (j+1);
                    floor.add(new Apartment(apartmentNumber));
            }
            apartments.add(floor);
        }
        domophone.connector(controller);
        while(true) {
            domophone.enterNum();
        }
    }

    public class Controller {
        public void apartmentCall(int apartmentNumber){
            for (int i = 0; i < apartments.size(); i++) {
                ArrayList<Apartment> floor = apartments.get(i);
                for (int j = 0; j < floor.size(); j++) {
                    if (floor.get(j) != null && floor.get(j).getNumber() == apartmentNumber){
                        floor.get(j).call();
                    }
                }
            }
        }
    }
}
