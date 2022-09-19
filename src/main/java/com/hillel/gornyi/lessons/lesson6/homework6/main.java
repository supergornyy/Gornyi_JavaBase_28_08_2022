package com.hillel.gornyi.lessons.lesson6.homework6;

public class main {
    public static void main(String[] args) {

        int counter = 0;
        for (int i = 1; i < 200; i++) {
            if (((i == 4) || (i == 9) || (i / 10 == 4) || (i / 10 == 9) || (i % 10 == 4) || (i % 10 == 9) || ((i / 10 - 10) == 4) || (i / 10 - 10 == 9) || (i % 100 == 4) || (i % 100 == 9)) || (counter == 100)) {
                continue;
            }
            System.out.println("Номер шаттлу: "+ i);
            counter++;
        }
        System.out.println();
        System.out.println("Загальна кількість пронумерованих шаттлів: " + counter);
    }
}
