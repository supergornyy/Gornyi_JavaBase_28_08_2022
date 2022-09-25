package com.hillel.gornyi.lessons.lesson7.homework7;

import java.lang.Math;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {

        //Отримуємо одне рандомне значення та оголошуємо лічильник

        double aiRandom = (int) (Math.random() * 11);
        int counter = 3;
        int userTry;

        //Користувач вводить свої числа по черзі

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введіть ціле число від 0 до 10:");
            if (scanner.hasNextInt()) {
                userTry = scanner.nextInt();
                if ((userTry >= 0) & (userTry <= 11)) {
                    System.out.println();
                    if (userTry == aiRandom) {
                        System.out.println("Ви вгадали!");
                        break;
                    } else if (counter >= 3) {
                        counter--;
                        System.out.println("Ви не вгадали! У вас залишилося " + counter + " спроби!");
                    } else if (counter >= 2) {
                        counter--;
                        System.out.println("Ви не вгадали! У вас залишилася " + counter + " спроба!");
                    } else if (counter <= 1) {
                        counter--;
                        System.out.println("Ви програли! У вас не залишилося спроб!");
                    }
                } else {
                    counter--;
                    System.out.println("Введене число поза межами вказанного діапазону! Кількість спроб, що залишилось: " + counter);
                }
            } else {
                System.out.println("Ви ввели невірні дані, перезапустіть гру");
                break;
            }
        }
        while (counter >= 1) ;
    }
}
