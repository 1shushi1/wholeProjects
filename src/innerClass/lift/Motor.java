package innerClass.lift;

public class Motor {

private Cabine cabine;
public void cabineConnector(Cabine cabine){
    this.cabine = cabine;
}
    public void up(int result){
    System.out.println("You've lifted up an elevator");
        cabine.setNumber(cabine.getNumber()+result);

    }
    public void down(int result){

    System.out.println("You've lifted down an elevator");
        cabine.setNumber(cabine.getNumber() - result);

    }
}
