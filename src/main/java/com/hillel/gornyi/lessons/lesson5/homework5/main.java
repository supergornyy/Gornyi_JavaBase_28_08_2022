package com.hillel.gornyi.lessons.lesson5.homework5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // TEAM 1 NAME AND STATS

        System.out.println("������ ����� ����� �������:");
        String team1 = scanner.nextLine();
        System.out.println("����� ����� ������� - " + team1);

        System.out.println("������ �� ����� ������� ����� ������� ������ ������� " + team1);
        scanner.hasNextInt();
        int player1 = scanner.nextInt();
        System.out.println("������ ������� ������� " + team1 + " �� " + player1 + " �����");
        scanner.hasNextInt();
        int player2 = scanner.nextInt();
        System.out.println("������ ������� ������� " + team1 + " �� " + player2 + " �����");
        scanner.hasNextInt();
        int player3 = scanner.nextInt();
        System.out.println("����� ������� ������� " + team1 + " �� " + player3 + " �����");
        scanner.nextLine();
        int player4 = scanner.nextInt();
        System.out.println("��������� ������� ������� " + team1 + " �� " + player4 + " �����");
        scanner.hasNextInt();
        int player5 = scanner.nextInt();
        System.out.println("�'���� ������� ������� " + team1 + " �� " + player5 + " �����");
        scanner.nextLine();

        // TEAM 2 NAME AND STATS

        System.out.println("������ ����� ����� �������:");
        String team2 = scanner.nextLine();
        System.out.println("����� ����� ������� - " + team2);

        System.out.println("������ �� ����� ������� ����� ������� ������ ������� " + team2);
        scanner.hasNextInt();
        int player6 = scanner.nextInt();
        System.out.println("������ ������� ������� " + team2 + " �� " + player6 + " �����");
        scanner.hasNextInt();
        int player7 = scanner.nextInt();
        System.out.println("������ ������� ������� " + team2 + " �� " + player7 + " �����");
        scanner.hasNextInt();
        int player8 = scanner.nextInt();
        System.out.println("������ ������� ������� " + team2 + " �� " + player8 + " �����");
        scanner.nextLine();
        int player9 = scanner.nextInt();
        System.out.println("������ ������� ������� " + team2 + " �� " + player9 + " �����");
        scanner.hasNextInt();
        int player10 = scanner.nextInt();
        System.out.println("������ ������� ������� " + team2 + " �� " + player10 + " �����");
        scanner.nextLine();

        // AVERAGE FRAGS OF BOTH TEAMS

        double team1AverFrags = ((double) (player1 + player2 + player3 + player4 + player5)/5);
        double team2AverFrags = ((double) (player6 + player7 + player8 + player9 + player10)/5);

//        System.out.println(team1AverFrags);
//        System.out.println(team2AverFrags);

        if (team1AverFrags > team2AverFrags) {
            System.out.println("��������� ������� " + team1 + " �������� " + team1AverFrags + " ����");
        } else if (team1AverFrags < team2AverFrags) {
            System.out.println("��������� ������� " + team2 + " �������� " + team2AverFrags + " ����");
        } else if (team1AverFrags == team2AverFrags){
            System.out.println("������� " + team1 + " �� " + team2 + " ������ �����");
        }
    }
}