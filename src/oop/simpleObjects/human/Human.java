package oop.simpleObjects.human;

public class Human {
    private String name = "Vova";

    private int age;
    private double weight;
    private boolean isMarried;
//    private String gender = "male";

    public Human(int initAge, double weight, boolean isMarried, String name){
        age = initAge;
        this.name = name;
        this.isMarried = isMarried;
        this.weight = weight;

    }
    public Human(String name, int intAge, boolean isMarried){
        age = intAge;
        this.name = name;
        this.isMarried = isMarried;
    }
    public Human(){
        System.out.println("this = " + this);
        this.info();
        age = 20;
        name = "Tolya";
    }
    public void setName(String name){
        this.name = name;
    }
    public double getWeight(){
        return weight;
    }
    public String getName(){
     return name;
    }
    public boolean isMarried(){
        return isMarried;
    }

    public void eat (String food, double weight){
        System.out.println(name + " eats " + food + ". His weight right now is " + (this.weight + weight));
        digest(food);
    }
    private void digest(String food){
        System.out.println(name + " is digesting " + food);
    }
    public void info(){
        System.out.println("My name is " + name + ". I'm " + age + " years old. " + "I'm " + (isMarried == true ? "married" : "not married") + ". My weight is " + weight);
    }
}
