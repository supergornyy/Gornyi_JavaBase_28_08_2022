package com.hillel.gornyi.lessons.lesson17.homework17;

public class ArrSum {

    public static void arrOp() {

        int x = 5;
        int y = 5;
        int[][] array = new int[x][y];
        double sum = 0;
        double average;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ((int) (Math.random() * 20) + 1);
            }
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d ", array[i][j]);
                sum +=  array[i][j];
            }
            System.out.println();
        }

        average =  sum / (x * y);

        System.out.println("----------------");
        System.out.println("Total sum = " + sum);
        System.out.println("Average = " +  average);
    }

}
