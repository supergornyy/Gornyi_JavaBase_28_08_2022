package com.hillel.gornyi.lessons.lesson8.homework8;

public class main {

//    � �� ������� ���� � 25 ������� ������ ��� � �����.
//    ³� ������ ���������� ����� � ������� �� 18 �� 40.
//    ������� � ���� ������ �� ������� ����� �������.
//    ��������� ������� �� ������� ����� ������� �� ������� �� �����.

    public static void main(String[] args) {

        int players = 25;
        int minAge = 18;
        int maxAge = 40;

        // ������� ��������� "��������"

        int[] ragbyTeam1 = new int[players];
        System.out.println("³� ������� '�������':");
        for (int i = 0; i < ragbyTeam1.length; i++) {
            ragbyTeam1[i] = ((int) (Math.random() * (maxAge - minAge + 1) + minAge));
            System.out.print(ragbyTeam1[i] + " ");
        }

        System.out.println();
        System.out.println();

        // ������� ������ "���� ������� � ���"

        int[] ragbyTeam2 = new int[players];
        System.out.println("³� ������� '������ ������� � ���':");
        for (int i = 0; i < ragbyTeam2.length; i++) {
            ragbyTeam2[i] = ((int) (Math.random() * (maxAge - minAge + 1) + minAge));
            System.out.print(ragbyTeam2[i] + " ");
        }

        // ������ ��� �������

        System.out.println();
        System.out.println();

        // ������� �� ������� ���� ������

        double avAgeTeam1 = 0;
        double avAgeTeam2 = 0;

        for (int i = 0; i < players; i++) {
            avAgeTeam1 += ragbyTeam1[i];
            avAgeTeam2 += ragbyTeam2[i];
        }

        System.out.println("������� �� '�������': " + avAgeTeam1/players);
        System.out.println("������� �� '������ ������� � ���': " + avAgeTeam2/players);
    }

}
