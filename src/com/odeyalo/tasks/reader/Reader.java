package com.odeyalo.tasks.reader;

public class Reader {
    private String fullName;
    private int ticketNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public Reader(String fullName, int ticketNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " взял " + numberOfBooks + " книги.");
    }

    public void takeBook(String... bookTitles) {
        System.out.print(fullName + " взял книги: ");
        for (int i = 0; i < bookTitles.length; i++) {
            System.out.print(bookTitles[i]);
            if (i < bookTitles.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getTitle() + " (" + books[i].getAuthor() + ")");
            if (i < books.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " вернул " + numberOfBooks + " книги.");
    }

    public void returnBook(String... bookTitles) {
        System.out.print(fullName + " вернул книги: ");
        for (int i = 0; i < bookTitles.length; i++) {
            System.out.print(bookTitles[i]);
            if (i < bookTitles.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getTitle() + " (" + books[i].getAuthor() + ")");
            if (i < books.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }
}

