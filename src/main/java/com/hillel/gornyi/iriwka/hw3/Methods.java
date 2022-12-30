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
// ����� int getInt() - ������ ��������� � ������� ����� ����� � ���������� ���
// ����� char getOperation() - ������ ��������� � ������� �����-�� ��������
// � ���������� ������ � ��������� (+, -, * ��� /)
// ����� int calc(int num1, int num2, char operation)
// - ������ ��������� ��� ������� num1 � num2 �������������� ��������, �������� operation.
// ����� main() - ������ ��������� 2 ����� (� ������� getInt()),
// ������� �������� (� ������� getOperation(), �������� ��� ������ calc() � ������� �� ����� ���������.