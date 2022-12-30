package com.hillel.gornyi.iriwka.hw2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // CYCLES

        System.out.println("---------task 1-------------");

//        ??

        System.out.println("---------task 2-------------");

//        ??

        System.out.println("---------task 3-------------");

//        int factNum;
//        long multNum = 1;
//
//        System.out.println("Enter any number from 2 to 20");
//        if (scanner.hasNextInt()) {
//            factNum = scanner.nextInt();
//            if (factNum > 0 & factNum < 21) {
//                System.out.println("Your number is: " + factNum);
//                System.out.println();
//                for (int i = 1; i <= factNum; i++) {
//                    multNum = multNum * i;
//                }
//            } else {
//                System.out.println("Error! Your entered number is out of range!");
//            }
////
//            if (multNum == 1) {
//                System.out.println("!1 = 1");
//            } else {
//                System.out.println("The number factorial is: " + multNum);
//            }
//        } else {
//            System.out.println("Error! You entered incorrect data! Restart the program.");
//        }

        System.out.println("---------task 4-------------");
//
//        int natNum;
//        int sumNum = 0;
//
//        System.out.println("Enter any natural number");
//        if (scanner.hasNextInt()) {
//            natNum = scanner.nextInt();
//            if (natNum > 0) {
//                System.out.println("Your number is: " + natNum);
//                System.out.println();
//                while (natNum != 0) {
//                    sumNum += natNum % 10; // sumNum = sumNum + (natNum % 10)
//                    natNum /= 10; // natNum = natNum / 10
//                }
//            } else {
//                System.out.println("Error! You entered incorrect data! Restart the program.");
//            }
//        System.out.println("The sum of numbers is: " + sumNum);
//        } else {
//            System.out.println("Error! You entered incorrect data! Restart the program.");
//        }

        // ARRAYS

        System.out.println("---------task 1-------------");

//        int x = 21;
//        int [] array = new int [x];
//
//        for (int i = 2; i < array.length; i+=2) {
//            i += array[i];
//            System.out.print(" " + i);
//        }
//        System.out.println();
//        for (int i = 2; i < array.length; i+=2) {
//            i += array[i];
//            System.out.println(" " + i);
//        }
//        System.out.println();

        System.out.println("---------task 2-------------");

//        int y = 100;
//
//        int [] array = new int [y];
//        for (int i = 1; i < array.length; i+=2) {
//            i+=array[i];
//            System.out.print(" " + i);
//        }
//        System.out.println();
//        for (int i = 99; i > 0; i-=2) {
//            i-=array[i];
//            System.out.print(" " + i);
//        }
//        System.out.println();

        System.out.println("---------task 3-------------");

        int arrNum = 5;
        int min = 0;
        int max = 5;
        double avArr1 = 0;
        double avArr2 = 0;

        System.out.println("Array 1");
        int[] array1 = new int[arrNum];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = ((int) (Math.random() * (max - min  + 1) + min));
            System.out.print("[" + array1[i] + "] ");
            avArr1 += array1[i];
        }

        System.out.println();

        System.out.println("Array 2");
        int[] array2 = new int[arrNum];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = ((int) (Math.random() * (max - min  + 1) + min));
            System.out.print("[" + array2[i] + "] ");
            avArr2 += array2[i];
        }

        System.out.println();

        System.out.println("Среднеарифметическое первого массива = " + avArr1/5);
        System.out.println("Среднеарифметическое второго массива = " + avArr2/5);

        System.out.println();

        if (avArr1 > avArr2) {
            System.out.println("Среднеарифметическое первого массива больше");
        } else if (avArr1 < avArr2){
            System.out.println("Среднеарифметическое второго массива больше");
        } else {
            System.out.println("Среднеарифметические массивов равны");
        }

    }

}
