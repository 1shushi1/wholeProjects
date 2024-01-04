package oop.simpleObjects.modifiers.pack1;

public class First {
    private int field1 = 5;

    public void setField1(int newValue){
        this.field1 = newValue;
    }
    public void first(){
        System.out.println("first");
        privateMethod();
    }
    private void privateMethod(){
        System.out.println("Private method");
    }
}
