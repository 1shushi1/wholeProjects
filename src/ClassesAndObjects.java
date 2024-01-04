

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("");
        person1.setAge(-5);
        System.out.println("Showing a data in main method " + person1.getAge());
        System.out.println("Showing a data in main method " + person1.getName());

    }
}
class Person{
    private String name;
    private int age;

    public void setName(String username){
        if (username.isEmpty()){
            System.out.println("You've entered an empty name");
        }else {
            name = username;
        }
        name = username;
    }
    public String getName(){
        return name;
    }
    public void setAge(int userAge){
        if (userAge<0){
            System.out.println("Age must be positive");
        }else {
            age = userAge;
        }
        age = userAge;
    }
    public int getAge(){
        return age;
    }
    void calculateYearsToRetirement(){
        int years = 65-age;
        System.out.println("Years to retirement is " + years);
    }
    void speak(){
        System.out.println("My name is " + name + ". I'm " + age +
                " years old");
    }
    void sayHello(){
        System.out.println("Hello");
    }
}
