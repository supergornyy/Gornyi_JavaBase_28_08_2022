package com.hillel.gornyi.lessons.lesson9.homework9;

import java.lang.Math;
import java.util.Arrays;

public class lotto {

//    Зробити два масиви з 7 цифр, заповнених випадковими цифрами (від 0 до 9).
//    Перший масив - це числа, які загадані фірмою-організатором лотереї.
//    Другий масив - це числа, які вгадав гравець.
//    Після того, як обидва масиви заповнені цифрами, потрібно відсортувати їх за зростанням будь-яким способом.
//    У відсортованих масивах визначити кількість збігів, тобто чисел у двох масивах з однаковим індексом; Наприклад:
//    first[3] повинен дорівнювати second[3], як показано нижче.
//    Приклад виведення в консоль (збіглися 1й, 4й та 6й елементи):
//            [0, 1, 4, 5, 5, 8, 9]
//            [1, 1, 2, 3, 5, 6, 9]
//    Кількість збігів: 3

    public static void main(String[] args) {

        int massOfNum = 7;
        int minNum = 0;
        int maxNum = 9;

        // PLAYER NUMBERS

        int[] playerNum = new int[massOfNum];
        System.out.println("Числа, що обрав гравець: ");
        for (int i = 0; i < playerNum.length; i++) {
            playerNum[i] = ((int) (Math.random() * (maxNum - minNum + 1) + minNum));
            }
        Arrays.sort(playerNum);
        for (int playerSort : playerNum) {
            System.out.print(playerSort + " ");
        }

        System.out.println();System.out.println();

        // LOTTO NUMBERS

        int[] lottoZabava = new int[massOfNum];
        System.out.println("Числа з лототрону 'Лото Забава': ");
        for (int j = 0; j < lottoZabava.length; j++) {
            lottoZabava[j] = ((int) (Math.random() * (maxNum - minNum + 1) + minNum));
            }
        Arrays.sort(lottoZabava);
        for (int lottoSort : lottoZabava) {
            System.out.print(lottoSort + " ");
        }

        // Порівнюємо

        System.out.println();System.out.println();

        int index = 1;
        int counter = 0;

        System.out.print("Індексі співпадаючих елементів: [");
        for (int i = 0; i < playerNum.length; i++ ) {
            if (playerNum[i] != lottoZabava[i]) {
                index++;
                continue;
            } else {
                System.out.print(" " + index + " ");
                index++;
                counter++;
            }
        }
        System.out.print("]");
        System.out.println();System.out.println("Загальна кількість збігів: " + counter);

    }
}
