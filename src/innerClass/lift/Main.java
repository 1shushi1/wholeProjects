package innerClass.lift;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        Pult pult = new Pult();
        elevator.connectPult(pult);

    }
}
