package oop.simpleObjects.library;

public class Book {
    private String title;
    private String author;
    private int year;
    private String genre;
    private int pages;

    public Book(String title, String author, int year, String genre, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }
    public void info() {
        System.out.println("Book title is " + title + ". Book author is " + author + ". Book year is " + year +
                ". Book genre is " + genre + ". The amount of pages is " + pages);
    }
}
