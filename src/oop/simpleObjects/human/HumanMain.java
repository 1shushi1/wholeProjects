package oop.simpleObjects.human;

public class HumanMain {
    public static void main(String[] args) {
//        Human vasya;
//        int i;
//        //System.out.println(i);
//        new Human();
//        System.out.println(new Human());
//        vasya = new Human();
//        System.out.println("vasya = " + vasya);
//        Human ivan = new Human();
//        Human petro = new Human();
//        System.out.println("ivan = " + ivan);
//        System.out.println("petro = "  + petro);
//        petro = ivan;
//        System.out.println();
//        System.out.println("ivan = " + ivan);
//        System.out.println("petro = "  + petro);
//        petro = null;
//        ivan = null;
//        System.out.println("ivan = " + ivan);
//        System.out.println("petro = "  + petro);
//        vasya.eat("Fish", 0.45);
//        vasya.info();
////        petro.info(); can't invoke because "petro" is null
//        petro = new Human();
//        petro.info();
        Human sasha = new Human(23, 67.7, false, "Sasha");
        sasha.info();
        Human vanya = new Human(16, 53.1, false, "Vanya");
        vanya.info();
        Human anthony = new Human("Anthony", 34, true);
        anthony.info();
        Human oleg = new Human("Oleg", 29, false);
        oleg.info();
        System.out.println("___________________________________");
        Human tolya = new Human();
        System.out.println(tolya);
        System.out.println("____________________________________");
        tolya.info();
        String name = sasha.getName();
        boolean  marriageStatus = sasha.isMarried();
        double weight = sasha.getWeight();
        System.out.println(name + "'s weight is "+ weight + ". He's " + (marriageStatus ? "married" : "not married") );
        vanya.setName("Petro");
        vanya.info();
    }
}
