package com.hillel.gornyi.lessons.lesson8.homework8;

public class main {

//    Є дві команди регбі з 25 гравців різного віку у кожній.
//    Вік беремо випадковим чином в діапазоні від 18 до 40.
//    Виведіть у двох рядках вік гравців кожної команди.
//    Порахуйте середній вік гравців кожної команди та виведіть на екран.

    public static void main(String[] args) {

        int players = 25;
        int minAge = 18;
        int maxAge = 40;

        // Команда господарів "Цуценята"

        int[] ragbyTeam1 = new int[players];
        System.out.println("Вік гравців 'Цуценят':");
        for (int i = 0; i < ragbyTeam1.length; i++) {
            ragbyTeam1[i] = ((int) (Math.random() * (maxAge - minAge + 1) + minAge));
            System.out.print(ragbyTeam1[i] + " ");
        }

        System.out.println();
        System.out.println();

        // Команда гостей "Адові дияволи з аду"

        int[] ragbyTeam2 = new int[players];
        System.out.println("Вік гравців 'Адових дияволів з аду':");
        for (int i = 0; i < ragbyTeam2.length; i++) {
            ragbyTeam2[i] = ((int) (Math.random() * (maxAge - minAge + 1) + minAge));
            System.out.print(ragbyTeam2[i] + " ");
        }

        // Пробіли для красоти

        System.out.println();
        System.out.println();

        // Середній вік гравців обох команд

        double avAgeTeam1 = 0;
        double avAgeTeam2 = 0;

        for (int i = 0; i < players; i++) {
            avAgeTeam1 += ragbyTeam1[i];
            avAgeTeam2 += ragbyTeam2[i];
        }

        System.out.println("Середній вік 'Цуценят': " + avAgeTeam1/players);
        System.out.println("Середній вік 'Адових дияволів з аду': " + avAgeTeam2/players);
    }

}
