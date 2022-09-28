package com.hillel.gornyi.lessons.lesson10.homework10;

import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;

public class transpone {

//    Транспонуйте матрицю M x N. Розміри M та N задаються з консолі.
//    Після введення повинні автоматично створюватися два масиви розміром M x N перший та N x M другий.

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розміри двомірної матриці M та N");
        System.out.println("Введіть кількість рядків");
        int N = scanner.nextInt();
        System.out.println("Введіть кількість стовбчиків");
        int M = scanner.nextInt();

        // Будуємо матрицю, бо можемо

        int[][] matrix = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = ((int)(Math.random()*100));
            }
        }

        System.out.println("Матриця ще не транспонована, терпіння");
        System.out.println();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }

        // Транспонуємо-транспонуємо та витранспонуємо

        for (int i = 0; i < M; i++) {
            for (int j = i+1; j < N; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println();
        System.out.println("А от теперь транспонована. Магія поруч.");
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < M; i++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }

}
