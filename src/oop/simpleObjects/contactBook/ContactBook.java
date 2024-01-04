package oop.simpleObjects.contactBook;

import oop.simpleObjects.contactBook.Contact;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactBook {
    private Scanner s = new Scanner(System.in);
    private ArrayList<Contact> contacts = new ArrayList<>();

    public ContactBook() {
        Contact contact1 = new Contact("Emma Johnson", "emma.johnson@example.com", "+1-555-555-1111");
        Contact contact2 = new Contact("William Chen", "william.chen@example.com", "+1-555-555-2222");
        Contact contact3 = new Contact("Sophia Lee", "sophia.lee@example.com", "+1-555-555-3333");
        Contact contact4 = new Contact("Ethan Kim", "ethan.kim@example.com", "+1-555-555-4444");
        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);
        contacts.add(contact4);
        menu();
    }

    private void add() {
        System.out.println("In order to create a new contact you have to input all the information below");
        System.out.println("Enter a username");
        String name = s.nextLine();
        System.out.println("Enter a phone number");
        String phoneNumber = s.nextLine();
        for (Contact contact : contacts) {
            if (name.equals(contact.getUsername()) || phoneNumber.equals(contact.getPhoneNumber())) {
                System.out.println("This phone number already exist");
                return;
            }
        }
        System.out.println("Enter an email");
        String email = s.nextLine();
        Contact contact = new Contact(name, phoneNumber, email);
        contacts.add(contact);
        System.out.println("You've successfully added a new contact");
    }

    private void find() {
        System.out.println("Select a criteria in what you would like to find a contact(by phone or by name)");
        String criteria = s.nextLine();
        for (Contact contact : contacts) {
            if (criteria.equals(contact.getPhoneNumber()) || criteria.equals(contact.getUsername())){
                contact.info();
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
        for (Contact contact : contacts) {
            if (userName.equals(contact.getUsername()) || phoneNumber.equals(contact.getPhoneNumber())) {
                contacts.remove(contact);
                System.out.println("You've removed a contact");
                return;
            }
        }
        System.out.println("Contact is not exist");
    }

    public void menu() {
        while (true) {
            System.out.println("Select from 4 variants : 1 - add to contact book, 2 - to find a contact, " +
                    "3 - to remove from contact book, 4 - to exit the program");
            int selection = Integer.parseInt(s.nextLine());
            switch (selection) {
                case 1 -> add();
                case 2 -> find();
                case 3 -> remove();
                case 4 -> System.exit(0);
            }
        }
    }
}
