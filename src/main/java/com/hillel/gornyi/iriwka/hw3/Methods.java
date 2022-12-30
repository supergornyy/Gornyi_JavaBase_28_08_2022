package com.hillel.gornyi.iriwka.hw3;

import java.util.Scanner;
public class Methods {
    static int num;
    static char action;
    static int result;
    static Scanner scanner = new Scanner(System.in);
    public static int getInt() {
        System.out.println("Enter your number: ");
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Error! You entered incorrect data! Try again");
            scanner.next();
            num = getInt();
        }
        return num;
    }
    public static char getOperation() {
        System.out.println("Enter the operation type ( + or - or * or / ): ");
        if (scanner.hasNext()) {
            action = scanner.next().charAt(0);
        } else {
            System.out.println("Error! You entered incorrect data! Try again");
            scanner.next();
            action = getOperation();
        }
        return action;
    }
    public static int calc(int num1, char action, int num2) {
        switch (action) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        return result;
    }
}
// Метод int getInt() - должен считывать с консоли целое число и возвращать его
// Метод char getOperation() - должен считывать с консоли какое-то значение
// и возвращать символ с операцией (+, -, * или /)
// Метод int calc(int num1, int num2, char operation)
// - должен выполнять над числами num1 и num2 арифметическую операцию, заданную operation.
// Метод main() - должен считывать 2 числа (с помощью getInt()),
// считать операцию (с помощью getOperation(), передать все методу calc() и вывести на экран результат.