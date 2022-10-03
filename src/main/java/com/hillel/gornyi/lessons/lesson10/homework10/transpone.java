package com.hillel.gornyi.lessons.lesson10.homework10;

import java.util.Scanner;
import java.lang.Math;

public class transpone {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int M = 0;
        int N = 0;
        int counter = 1;
        System.out.println("Enter parameters of a new matrix MxN");

        do {
            System.out.println("Enter rows number (1 to 99)");
            if (scanner.hasNextInt()) {
                M = scanner.nextInt();
                counter++;
                if (M >= 1 & M < 100) {
                    System.out.println("Number of rows is " + M);
                    System.out.println();
                    System.out.println("------------------------");
                    System.out.println("Enter columns number (1 to 99)");
                    if (scanner.hasNextInt()) {
                        N = scanner.nextInt();
                        counter++;
                        if (N >= 1 & N < 100) {
                            System.out.println("Number of columns is " + N);
                            System.out.println();
                            System.out.println("------------------------");
                        } else {
                            System.out.println("You have entered incorrect data, restart program");
                        }
                    } else {
                        System.out.println("You have entered incorrect data, restart program");

                    }
                } else {
                    System.out.println("You have entered incorrect data, restart program");
                    break;
                }
            } else {
                System.out.println("You have entered incorrect data, restart program");
                break;
            }
        } while (counter <= 2);

        // We build matrix because we can

        System.out.println();
        if (M > 0) {

            int[][] mx1 = new int[M][N];
            int[][] mx2 = new int[N][M];

            for (int i = 0; i < mx1.length; i++) {
                for (int j = 0; j < mx1[i].length; j++) {
                    mx1[i][j] = ((int)(Math.random()*100));
                }
            }

            System.out.println("MATRIX BEFORE");
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.printf("%3d", mx1[i][j]);
                }
                System.out.println();
                System.out.println();
                System.out.println("------------------------");
            }

        // Transposing-transposing and will be transposed

            if (M > 0) {
                System.out.println();
                System.out.println("MATRIX AFTER");
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        mx2[i][j] = mx1[j][i];
                        System.out.printf("%3d", mx2[i][j]);
                    }
                    System.out.println();
                }
            }
        }
    }
}
