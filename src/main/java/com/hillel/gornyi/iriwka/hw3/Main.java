package com.hillel.gornyi.iriwka.hw3;

import static com.hillel.gornyi.iriwka.hw3.Methods.*;

public class Main {
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char action = getOperation();
        int result = calc(num1, num2, action);
        System.out.println(num1 + " " + action + " " + num2 + " = " + result);
    }
}