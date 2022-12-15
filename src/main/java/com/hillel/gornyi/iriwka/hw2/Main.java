package com.hillel.gornyi.iriwka.hw2;

public class Main {

    public static void main(String[] args) {

        // CYCLES

        System.out.println("---------task 1-------------");



        System.out.println("---------task 2-------------");



        System.out.println("---------task 3-------------");



        System.out.println("---------task 4-------------");




        // ARRAYS

        System.out.println("---------task 1-------------");



        System.out.println("---------task 2-------------");



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
