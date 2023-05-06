package com.odeyalo.tasks.person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Odeyalo", 18);

        person1.move();
        person1.talk();

        System.out.println();

        person2.move();
        person2.talk();
    }
}
