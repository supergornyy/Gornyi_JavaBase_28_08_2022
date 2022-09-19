package com.hillel.gornyi.lessons.lesson7.homework7;

import java.lang.Math;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //Користувач вводить свої числа одразу

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть три цілих числа від 0 до 10:");

        int userTry1 = scanner.nextInt();
        scanner.hasNextInt();
        int userTry2 = scanner.nextInt();
        scanner.hasNextInt();
        int userTry3 = scanner.nextInt();

        //Отримуємо одне рандомне значення

        double aiRandom = (int) (Math.random() * 11);

        //Перевіряємо корректність введеня та співпадіння

        if ((userTry1 >= 0) & (userTry1 <= 11) & (userTry2 >= 0) & (userTry2 <= 11) & (userTry3 >= 0) & (userTry3 <= 11) ) {
            if ((aiRandom == userTry1) || (aiRandom == userTry2) || (aiRandom == userTry3)) {
                System.out.println("Ви вгадали, я загадав число: " + aiRandom);
            } else {
                System.out.println("Ви не вгадали, я загадав число: " + aiRandom);
            }
        } else {
                System.out.println("Одне з ведених чисел поза межами вказанного діапазону");
                System.exit(0);
            }
        }
    }