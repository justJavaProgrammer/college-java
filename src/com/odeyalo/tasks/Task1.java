package com.odeyalo.tasks;

import java.util.Scanner;

/**
 * 1. Пользователь должен ввести свое имя
 * 2. Пользователь должен выбрать операцию (+, - , *, /, %, возведение в степень, квадратный корень)
 * 3. Пользователь должен значение (Пример: 2+2)
 * 4. Нужно округлить число до сотых
 * 5. Программа должна выдать результат
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Supported: +, - , *, /, %, возведение в степень(^), квадратный корень(#)");
        System.out.print("\n Enter math operation: ");
        String operation = scanner.nextLine();

        double firstNumber, secondNumber, result = 0;

        switch (operation) {
            case ("+") -> {
                firstNumber = scanner.nextDouble();
                secondNumber = scanner.nextDouble();
                result = firstNumber + secondNumber;
            }
            case ("-") -> {
                firstNumber = scanner.nextDouble();
                secondNumber = scanner.nextDouble();
                result = firstNumber - secondNumber;
            }
            case ("*") -> {
                firstNumber = scanner.nextDouble();
                secondNumber = scanner.nextDouble();
                result = firstNumber * secondNumber;
            }
            case ("/") -> {
                firstNumber = scanner.nextDouble();
                secondNumber = scanner.nextDouble();
                result = firstNumber / secondNumber;
            }
            case ("%") -> {
                firstNumber = scanner.nextDouble();
                secondNumber = scanner.nextDouble();
                result = firstNumber % secondNumber;
            }
            case ("^") -> {
                firstNumber = scanner.nextDouble();
                result = firstNumber * firstNumber;
            }
            case ("#") -> {
                firstNumber = scanner.nextDouble();
                result = Math.sqrt(firstNumber);
            }
            default -> {
                System.out.println("Operation is not supported!");
                System.exit(-1);
            }
        }

        System.out.printf("Result: %.2f, your name is: %s", result, name);

    }
}
