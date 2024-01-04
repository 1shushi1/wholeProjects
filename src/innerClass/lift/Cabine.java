package innerClass.lift;

public class Cabine {
    private int number;
    private boolean isOpen;
    public Cabine(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public void doorOpenClose(){
        if (isOpen == true){
            isOpen = false;
            System.out.println("Door closed");
        }
        else {
            isOpen = true;
            System.out.println("Door opened  on a " + number + " floor");
        }
    }
}
