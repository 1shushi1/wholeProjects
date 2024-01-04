package oop.simpleObjects.contactBook;

public class Contact {
    private String username;
    private String email;
    private String phoneNumber;

    public Contact(String username, String email, String phoneNumber) {
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void info(){
        System.out.println("Username is : " + username + ". Phone number is : " + phoneNumber + ". Email is : " +
                email + ".");
    }
}
