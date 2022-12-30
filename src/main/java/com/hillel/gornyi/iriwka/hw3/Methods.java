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
    public static int calc(int num1, int num2, char action) {
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
            default:
                System.out.println("Error! You entered incorrect action sign! Try again");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}