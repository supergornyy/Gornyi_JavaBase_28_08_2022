package com.hillel.gornyi.iriwka.hw1;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------task 1-------------");

        double a = 2.54;
        double in1 = 10/a;
        double in2 = 25*a;

        System.out.println(in1 + " inches");
        System.out.println(in2 + " cm");

        System.out.println("---------task 2-------------");

        int vasyl_uah = 5000;
        int par_uah = 5000;
        float exchange_rate = 28.0f;
        System.out.println("Vasyl's money = " + (vasyl_uah+par_uah)/exchange_rate + " EUR");

        System.out.println("---------task 3-------------");

        int x = 63;
        int y = x / 10;
        int z = x % 10;

        if (x > 9 && x < 100 ) {
            System.out.println(z + " " + y);
        } else {
            System.out.println("Ваше число не двузначное / положительное");
        }

        System.out.println("---------task 4-------------");

        int m = 58;
        int n = (m / 10) * 10;
        int k = m % 10;
        System.out.println(n + "+" + k);

        System.out.println("---------task 5-------------");

        int g = 95;
        int h = g / 10;
        int t = g % 10;
        int o = h + t ;

        if (x > 9 && x < 100 ) {
            System.out.println(o);
        } else {
            System.out.println("Ваше число не двузначное / положительное");
        }

        System.out.println("---------task 6-------------");

        int chet = 27;
        int chet_counter = 0;
        int chet_d = chet / 10;
        int chet_e = chet % 10;

        if (chet > 9 && chet < 100) {
            if (chet_d % 2 == 0) {
                chet_counter++;
            }
            if (chet_e % 2 == 0) {
                chet_counter++;
            }
        } else {
            System.out.println("Ваше число не двузначное / отрицательное");
        }
        System.out.println(chet_counter);

        System.out.println("---------task 7-------------");

        int num1 = -23;

        if (num1 >= 1) {
            System.out.println("Число положительное");
        } else if (num1 < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }

        System.out.println("---------task 8-------------");

        int num2 = 100;
        System.out.println("Наше число = " + num2);

        if (num2 > 99) {
            num2--;
            System.out.println("Наше новое число = " + num2);
        } else {
            System.out.println("Ваше число не двузначное / отрицательное");
        }

        System.out.println("---------task 9-------------");

        int num3 = 57;
        int num3_d = num3 / 10;
        int num3_e = num3 % 10;
        int num3_sum = num3_d * num3_e;
        System.out.println("Наше число = " + num3);
        System.out.println("Произведение его цифр = " + num3_sum);

        if (num3 > 9 && num3 < 100) {
            if (num3 > num3_sum) {
                System.out.println("Число больше произведения его цифр");
            } else {
                System.out.println("Число меньше произведения его цифр");
            }
        } else {
            System.out.println("Ваше число не двузначное или отрицательное");
        }
    }
}
