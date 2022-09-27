package com.hillel.gornyi.lessons.lesson9.homework9;

import java.lang.Math;
import java.util.Arrays;

public class lotto {

//    ������� ��� ������ � 7 ����, ���������� ����������� ������� (�� 0 �� 9).
//    ������ ����� - �� �����, �� ������� ������-������������ ������.
//    ������ ����� - �� �����, �� ������ �������.
//    ϳ��� ����, �� ������ ������ �������� �������, ������� ����������� �� �� ���������� ����-���� ��������.
//    � ������������ ������� ��������� ������� ����, ����� ����� � ���� ������� � ��������� ��������; ���������:
//    first[3] ������� ���������� second[3], �� �������� �����.
//    ������� ��������� � ������� (������� 1�, 4� �� 6� ��������):
//            [0, 1, 4, 5, 5, 8, 9]
//            [1, 1, 2, 3, 5, 6, 9]
//    ʳ������ ����: 3

    public static void main(String[] args) {

        int massOfNum = 7;
        int minNum = 0;
        int maxNum = 9;

        // PLAYER NUMBERS

        int[] playerNum = new int[massOfNum];
        System.out.println("�����, �� ����� �������: ");
        for (int i = 0; i < playerNum.length; i++) {
            playerNum[i] = ((int) (Math.random() * (maxNum - minNum + 1) + minNum));
            }
        Arrays.sort(playerNum);
        for (int playerSort : playerNum) {
            System.out.print(playerSort + " ");
        }

        System.out.println();System.out.println();

        // LOTTO NUMBERS

        int[] lottoZabava = new int[massOfNum];
        System.out.println("����� � ��������� '���� ������': ");
        for (int j = 0; j < lottoZabava.length; j++) {
            lottoZabava[j] = ((int) (Math.random() * (maxNum - minNum + 1) + minNum));
            }
        Arrays.sort(lottoZabava);
        for (int lottoSort : lottoZabava) {
            System.out.print(lottoSort + " ");
        }

        // ���������

        System.out.println();System.out.println();

        int index = 1;
        int counter = 0;

        System.out.print("������ ����������� ��������: [");
        for (int i = 0; i < playerNum.length; i++ ) {
            if (playerNum[i] != lottoZabava[i]) {
                index++;
                continue;
            } else {
                System.out.print(" " + index + " ");
                index++;
                counter++;
            }
        }
        System.out.print("]");
        System.out.println();System.out.println("�������� ������� ����: " + counter);

    }
}
