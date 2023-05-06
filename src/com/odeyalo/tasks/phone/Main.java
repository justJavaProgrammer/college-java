package com.odeyalo.tasks.phone;

public class Main {
    public static void main(String[] args) {
        Phone samsung = new Phone("6214212", "Samsung", 2.0);
        Phone iPhone = new Phone("1111111", "IPhone");
        Phone lg = new Phone("2222222", "LG");
        System.out.println(samsung);
        System.out.println(iPhone);
        System.out.println(lg);

        samsung.receiveCall("Odeyalo");
        iPhone.receiveCall("Miku");
        lg.receiveCall("Koji");

        iPhone.receiveCall("Unknown", "1234321");

        System.out.println("Номер IPhone: " + iPhone.getNumber());

        samsung.sendMessage("1234321", "6214212", "1111111");
    }
}
