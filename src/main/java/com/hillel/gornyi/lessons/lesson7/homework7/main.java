package com.hillel.gornyi.lessons.lesson7.homework7;

import java.lang.Math;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //���������� ������� ��� ����� ������

        Scanner scanner = new Scanner(System.in);
        System.out.println("������ ��� ����� ����� �� 0 �� 10:");

        int userTry1 = scanner.nextInt();
        scanner.hasNextInt();
        int userTry2 = scanner.nextInt();
        scanner.hasNextInt();
        int userTry3 = scanner.nextInt();

        //�������� ���� �������� ��������

        double aiRandom = (int) (Math.random() * 11);

        //���������� ����������� ������� �� ���������

        if ((userTry1 >= 0) & (userTry1 <= 11) & (userTry2 >= 0) & (userTry2 <= 11) & (userTry3 >= 0) & (userTry3 <= 11) ) {
            if ((aiRandom == userTry1) || (aiRandom == userTry2) || (aiRandom == userTry3)) {
                System.out.println("�� �������, � ������� �����: " + aiRandom);
            } else {
                System.out.println("�� �� �������, � ������� �����: " + aiRandom);
            }
        } else {
                System.out.println("���� � ������� ����� ���� ������ ���������� ��������");
                System.exit(0);
            }
        }
    }