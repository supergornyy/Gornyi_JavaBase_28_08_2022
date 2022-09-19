package com.hillel.gornyi.lessons.lesson7.homework7;

import java.lang.Math;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {

        //Отримуємо одне рандомне значення та оголошуємо лічильник

        double aiRandom = (int) (Math.random() * 11);
        int counter = 0;

        //Користувач вводить свої числа по черзі

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введіть ціле число від 0 до 10:");
            int userTry = scanner.nextInt();
            if ((userTry >= 0) & (userTry <= 11)) {
                System.out.println();
                if (userTry == aiRandom) {
                    System.out.println("Ви вгадали!");
                } else {
                    System.out.println("Ви не вгадали!");
                }
            } else {
                System.out.println("Введене число поза межами вказанного діапазону");
            }
            counter++;
        } while (counter <= 2);
    }
}

