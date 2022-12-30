package com.hillel.gornyi.iriwka.hw3;

import static com.hillel.gornyi.iriwka.hw3.Methods.*;

public class Main {
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char action = getOperation();
        int result = calc(num1, action, num2);
        System.out.println(num1 + " " + action + " " + num2 + " = " + result);
    }
}
//        Метод int getInt() - должен считывать с консоли целое число и возвращать его
//        Метод char getOperation() - должен считывать с консоли какое-то значение
//        и возвращать символ с операцией (+, -, * или /)
//        Метод int calc(int num1, int num2, char operation)
//        - должен выполнять над числами num1 и num2 арифметическую операцию,
//        заданную operation.
//        Метод main() - должен считывать 2 числа (с помощью getInt()),
//        считать операцию (с помощью getOperation(), передать все методу calc() и вывести на экран результат.