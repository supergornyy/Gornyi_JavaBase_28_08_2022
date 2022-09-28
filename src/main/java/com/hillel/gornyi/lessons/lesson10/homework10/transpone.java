package com.hillel.gornyi.lessons.lesson10.homework10;

import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;

public class transpone {

//    ������������ ������� M x N. ������ M �� N ��������� � ������.
//    ϳ��� �������� ������ ����������� ������������ ��� ������ ������� M x N ������ �� N x M ������.

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("������ ������ ������� ������� M �� N");
        System.out.println("������ ������� �����");
        int N = scanner.nextInt();
        System.out.println("������ ������� ���������");
        int M = scanner.nextInt();

        // ������ �������, �� ������

        int[][] matrix = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = ((int)(Math.random()*100));
            }
        }

        System.out.println("������� �� �� �������������, �������");
        System.out.println();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }

        // �����������-����������� �� �������������

        for (int i = 0; i < M; i++) {
            for (int j = i+1; j < N; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println();
        System.out.println("� �� ������ �������������. ���� �����.");
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < M; i++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }

}
