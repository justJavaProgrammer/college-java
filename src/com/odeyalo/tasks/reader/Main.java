package com.odeyalo.tasks.reader;

public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Odeyalo", 123, "Computer Science", "2000-12-12", "1111111");
        Reader reader2 = new Reader("Someone", 321, "Psychology", "1980-12-03", "2222222");

        reader1.takeBook(3);

        reader2.takeBook("Harry Potter");

        reader1.returnBook(3);


        reader2.returnBook("Harry Potter");
    }
}
