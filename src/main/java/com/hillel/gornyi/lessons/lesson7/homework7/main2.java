package com.hillel.gornyi.lessons.lesson7.homework7;

import java.lang.Math;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {

        //�������� ���� �������� �������� �� ��������� ��������

        double aiRandom = (int) (Math.random() * 11);
        int counter = 0;

        //���������� ������� ��� ����� �� ����

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("������ ���� ����� �� 0 �� 10:");
            int userTry = scanner.nextInt();
            if ((userTry >= 0) & (userTry <= 11)) {
                System.out.println();
                if (userTry == aiRandom) {
                    System.out.println("�� �������!");
                } else {
                    System.out.println("�� �� �������!");
                }
            } else {
                System.out.println("������� ����� ���� ������ ���������� ��������");
            }
            counter++;
        } while (counter <= 2);
    }
}

