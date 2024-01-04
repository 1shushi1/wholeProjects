package innerClass.building;

public class Apartment {
    int number;
    public Apartment(int number){
        this.number = number;
    }
    public void call(){
        System.out.println("You've called to apartment " + number);
    }
    public int getNumber(){
        return number;
    }
}
