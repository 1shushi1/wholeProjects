package oop.simpleObjects.library;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private Scanner s = new Scanner(System.in);
    private ArrayList<ArrayList<Book>> books = new ArrayList<>();

    public Library() {
        Book book1 = new Book("TheGreatGatsby", "F. Scott Fitzgerald", 1925, "fiction", 180);
        Book book2 = new Book("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 2014, "non-fiction", 464);
        Book book3 = new Book("1984", "George Orwell", 1949, "fiction", 328);
        System.out.println("Enter a number of shelfs");
        int shelfNumber = Integer.parseInt(s.nextLine());
        for (int i = 0; i < shelfNumber; i++) {
            System.out.println("Enter an amount of spots on a shelf " + i);
            int spotsAmount = Integer.parseInt(s.nextLine());
            ArrayList<Book> books1 = new ArrayList<>();
            for (int j = 0; j < spotsAmount; j++) {
                books1.add(null);
            }
            books.add(books1);
        }
        books.get(0).set(0, book1);
        books.get(0).set(1, book2);
        books.get(2).set(3, book3);
        menu();
    }

    private void add() {
        System.out.println("Enter the name of the book you would like to add");
        String titleOfTheBook = s.nextLine();
        System.out.println("Enter the author name");
        String authorFullName = s.nextLine();
        System.out.println("Enter the year the book was written");
        int year = Integer.parseInt(s.nextLine());
        System.out.println("Enter the genre of the book");
        String genre = s.nextLine();
        System.out.println("Enter the page amount");
        int pageAmount = Integer.parseInt(s.nextLine());
        Book book = new Book(titleOfTheBook, authorFullName, year, genre, pageAmount);
        for (int i = 0; i < books.size(); i++) {
            ArrayList<Book> shelf = books.get(i);
            for (int j = 0; j < shelf.size(); j++) {
                if (shelf.get(i) == null) {
                    shelf.set(j, book);
                    shelf.get(j).info();
                    System.out.println("You've set a book on a " + i + " shelf," + j + " position");
                    return;
                }
            }
        }
        System.out.println("No free space");
    }

    private void find() {
        System.out.println("Enter a criteria by which you would like to find a book");
        System.out.println("1 - by title, 2 - by title and author name, 3 - by genre and title, 4 - by title, author name, year, genre and amount of pages");
        int sel = Integer.parseInt(s.nextLine());
        switch (sel) {
            case 1 -> byTitle();
            case 2 -> byTitelAndAuthorName();
            case 3 -> byGenreAndTitle();
            case 4 -> byTitleAuthorYearGenreAmountOfPages();
        }
    }

    private void byTitle() {
        System.out.println("Enter a book title");
        String title = s.nextLine();
        int counter = 0;
        for (int i = 0; i < books.size(); i++) {
            ArrayList<Book> book = books.get(i);
            for (int j = 0; j < book.size(); j++) {
                if (book.get(j) != null) {
                    if (title.equals(book.get(j).getTitle())) {
                        counter++;
                        book.get(j).info();
                        System.out.println("You found a book on a " + i + " shelf, " + j + " position");
                    }
                }
            }
        }
        if (counter == 0) {
            System.out.println("Book is not found");
        }
    }

    private void byTitelAndAuthorName() {
        System.out.println("Enter a book title");
        String title = s.nextLine();
        System.out.println("Enter a author name");
        String authorName = s.nextLine();
        int counter = 0;
        for (int i = 0; i < books.size(); i++) {
            ArrayList<Book> book = books.get(i);
            for (int j = 0; j < book.size(); j++) {
                if (book.get(j) != null) {
                    if (title.equals(book.get(j).getTitle()) && authorName.equals(book.get(j).getAuthor())) {
                        counter++;
                        book.get(j).info();
                        System.out.println("You found a book on a " + i + " shelf, " + j + " position");
                    }
                }
            }
        }
        if (counter == 0) {
            System.out.println("Book is not found");
        }
    }

    private void byGenreAndTitle() {
        System.out.println("Enter a genre of the book");
        String genre = s.nextLine();
        System.out.println("Enter a title of the book");
        String title = s.nextLine();
        int counter = 0;
        for (int i = 0; i < books.size(); i++) {
            ArrayList<Book> book = books.get(i);
            for (int j = 0; j < book.size(); j++) {
                if (book.get(j) != null) {
                    if (title.equals(book.get(j).getTitle()) && genre.equals(book.get(j).getGenre())) {
                        counter++;
                        book.get(j).info();
                        System.out.println("You found a book on a " + i + " shelf, " + j + " position");
                    }
                }
            }
        }
        if (counter == 0) {
            System.out.println("Book is not found");
        }
    }

    private void byTitleAuthorYearGenreAmountOfPages() {
        System.out.println("Enter a title of the book");
        String title = s.nextLine();
        System.out.println("Enter an author name");
        String authorName = s.nextLine();
        System.out.println("Enter writing year");
        int year = Integer.parseInt(s.nextLine());
        System.out.println("Enter a genre of the book");
        String genre = s.nextLine();
        System.out.println("Enter an amount of pages book has");
        int pageAmount = Integer.parseInt(s.nextLine());
        int counter = 0;
        for (int i = 0; i < books.size(); i++) {
            ArrayList<Book> books1 = books.get(i);
            for (int j = 0; j < books1.size(); j++) {
                if (books1.get(j) != null) {
                    if (title.equals(books1.get(j).getTitle()) && genre.equals(books1.get(j).getGenre()) && authorName.equals(books1.get(j).getAuthor()) && year == books1.get(j).getYear() && pageAmount == books1.get(j).getPages()) {
                        counter++;
                        books1.get(j).info();
                        System.out.println("You found a book on a " + i + " shelf, " + j + " position");
                    }
                }
            }
        }
        if (counter == 0) {
            System.out.println("Book is not found");
        }
    }

    private void take() {
        System.out.println("Enter a book title");
        String bookTitle = s.nextLine();
        System.out.println("Enter a author name ");
        String authorName = s.nextLine();
        for (int i = 0; i < books.size(); i++) {
            ArrayList<Book> books1 = books.get(i);
            for (int j = 0; j < books1.size(); j++) {
                if (books1.get(j) != null) {
                    if (bookTitle.equals(books1.get(j).getTitle()) && authorName.equals(books1.get(j).getAuthor())) {
                        books1.get(j).info();
                        System.out.println("You took a book form the library");
                        books1.set(j, null);
                        return;
                    }
                }
            }
        }
    }

    private void menu() {
        while (true) {
            System.out.println("Select a from 3 variants. 1 - Add book, 2 - Find book, 3 - Take book, 4 - Program exit ");
            int selection = Integer.parseInt(s.nextLine());
            switch (selection) {
                case 1 -> add();
                case 2 -> find();
                case 3 -> take();
                case 4 -> System.exit(0);
            }
        }
    }
}
