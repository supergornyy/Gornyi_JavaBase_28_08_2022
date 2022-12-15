package com.hillel.gornyi.lessons.lesson17.homework17;

public class IsSquare {

    public static void squareCheck() {

        int x = ((int) (Math.random() * 5) + 1);
        int y = ((int) (Math.random() * 5) + 1);
        int[][] array = new int[x][y];

        System.out.println();
        System.out.println("----------------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ((int) (Math.random() * 20) + 1);
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------------");
        if (x == y) {
            System.out.println("Array is square");
        } else {
            System.out.println("Array is not square");
        }
    }
}
