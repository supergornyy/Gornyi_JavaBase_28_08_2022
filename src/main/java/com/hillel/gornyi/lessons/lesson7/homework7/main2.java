package com.hillel.gornyi.lessons.lesson7.homework7;

import java.lang.Math;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {

        //�������� ���� �������� �������� �� ��������� ��������

        double aiRandom = (int) (Math.random() * 11);
        int counter = 3;
        int userTry;

        //���������� ������� ��� ����� �� ����

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("������ ���� ����� �� 0 �� 10:");
            if (scanner.hasNextInt()) {
                userTry = scanner.nextInt();
                if ((userTry >= 0) & (userTry <= 11)) {
                    System.out.println();
                    if (userTry == aiRandom) {
                        System.out.println("�� �������!");
                        break;
                    } else if (counter >= 3) {
                        counter--;
                        System.out.println("�� �� �������! � ��� ���������� " + counter + " ������!");
                    } else if (counter >= 2) {
                        counter--;
                        System.out.println("�� �� �������! � ��� ���������� " + counter + " ������!");
                    } else if (counter <= 1) {
                        counter--;
                        System.out.println("�� ��������! � ��� �� ���������� �����!");
                    }
                } else {
                    counter--;
                    System.out.println("������� ����� ���� ������ ���������� ��������! ʳ������ �����, �� ����������: " + counter);
                }
            } else {
                System.out.println("�� ����� ����� ���, ������������ ���");
                break;
            }
        }
        while (counter >= 1) ;
    }
}
