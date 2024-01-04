package oop.simpleObjects.contactBookHashMap;

import oop.simpleObjects.contactBook.Contact;

import java.util.HashMap;
import java.util.Scanner;

public class ContactBookHashMap {
    Scanner s = new Scanner(System.in);
    private HashMap<String, Contact1> contactHashMap = new HashMap<>();

    public ContactBookHashMap() {
        Contact1 contact1 = new Contact1("Emma Johnson", "emma.johnson@example.com", "+1-555-555-1111");
        Contact1 contact2 = new Contact1("William Chen", "william.chen@example.com", "+1-555-555-2222");
        Contact1 contact3 = new Contact1("Sophia Lee", "sophia.lee@example.com", "+1-555-555-3333");
        Contact1 contact4 = new Contact1("Ethan Kim", "ethan.kim@example.com", "+1-555-555-4444");
        contactHashMap.put(contact1.getUsername() + "_" + contact1.getPhoneNumber(), contact1);
        contactHashMap.put(contact2.getUsername() + "_" + contact2.getPhoneNumber(), contact2);
        contactHashMap.put(contact3.getUsername() + "_" + contact3.getPhoneNumber(), contact3);
        contactHashMap.put(contact4.getUsername() + "_" + contact4.getPhoneNumber(), contact4);
        menu();
    }

    private void add() {
        System.out.println("In order to create a new contact you have to input all the information below");
        System.out.println("Enter a username");
        String name = s.nextLine();
        System.out.println("Enter a phone number");
        String phoneNumber = s.nextLine();
        if (contactHashMap.containsKey(name + "_" + phoneNumber)) {
            System.out.println("This phone number already exist");
            return;
        }
        System.out.println("Enter an email");
        String email = s.nextLine();
        Contact1 contact = new Contact1(name, email, phoneNumber);
        contactHashMap.put(name + "_" + phoneNumber, contact);
        System.out.println("You've successfully added a new contact");
    }

    private void find() {
        System.out.println("Select a criteria in what you would like to find a contact(by phone or by name)");
        String criteria = s.nextLine();
        for (String key : contactHashMap.keySet()) {
            if (key.contains(criteria)) {
                contactHashMap.get(key).info();
                return;
            }
        }
        System.out.println("Contact does not exist");
    }

    private void remove() {
        System.out.println("In order to remove a contact you have to check whether it is exist");
        System.out.println("Enter a username");
        String userName = s.nextLine();
        System.out.println("Enter a phoneNumber");
        String phoneNumber = s.nextLine();
        if (contactHashMap.remove(userName + "_" + phoneNumber) != null) {
            System.out.println("You've successfully removed a contact");
        } else {
            System.out.println("Contact is not exist");
        }

    }

    private void update() {
        System.out.println("Enter a user name you would like to find.");
        String userName = s.nextLine();
        System.out.println("Enter a phone number.");
        String phoneNumber = s.nextLine();
        if (!contactHashMap.containsKey(userName + "_" + phoneNumber)) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("What criteria you would like to change");
        System.out.println("1 - phone number, 2 - user name, 3 - email");
        int selection1 = Integer.parseInt(s.nextLine());
        Contact1 foundContact = contactHashMap.get(userName + "_" + phoneNumber);
        switch (selection1) {
            case 1 : {
                contactHashMap.remove(userName + "_" + phoneNumber);
                System.out.println("Enter a new phone number");
                String newPhoneNum = s.nextLine();
                foundContact.setPhoneNumber(newPhoneNum);
                contactHashMap.put(userName + "_" + newPhoneNum, foundContact);
                System.out.println("You've successfully changed a phone number");
                break;
            }
            case 2: {
                contactHashMap.remove(userName + "_" + phoneNumber);
                System.out.println("Enter a new user name");
                String newUserName = s.nextLine();
                foundContact.setUsername(newUserName);
                contactHashMap.put(newUserName + "_" + phoneNumber, foundContact );
                System.out.println("You've successfully changed username");
                break;
            }
            case 3: {
                contactHashMap.remove(userName + "_" + phoneNumber);
                System.out.println("Enter new email");
                String newEmail = s.nextLine();
                foundContact.setEmail(newEmail);
                contactHashMap.put(userName + "_" + phoneNumber, foundContact);
                System.out.println("You've successfully changed an email");
                break;
            }
        }
    }

    public void menu() {
        while (true) {
            System.out.println("Select from 4 variants : 1 - add to contact book, 2 - to find a contact, " +
                    "3 - to remove from contact book, 4 - to update a contact book,  5 - to exit the program");
            int selection = Integer.parseInt(s.nextLine());
            switch (selection) {
                case 1 -> add();
                case 2 -> find();
                case 3 -> remove();
                case 4 -> update();
                case 5 -> System.exit(0);
            }
        }
    }
}
