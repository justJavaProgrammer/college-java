package com.odeyalo.tasks.phone;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит: " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.printf("Звонит: %s с номером: %s%n", callerName, callerNumber);
    }

    public void sendMessage(String... numbers) {
        for (String number : numbers) {
            System.out.println("Отпревленно сообщение для: " + number);
        }
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
