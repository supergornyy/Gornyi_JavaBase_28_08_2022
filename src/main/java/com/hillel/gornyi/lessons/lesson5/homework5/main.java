package com.hillel.gornyi.lessons.lesson5.homework5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // TEAM 1 NAME AND STATS

        System.out.println("Введіть назву першої команди:");
        String team1 = scanner.nextLine();
        System.out.println("Назва першої команди - " + team1);

        System.out.println("Введіть по черзи кількість фрагів кожного гравця команди " + team1);
        scanner.hasNextInt();
        int player1 = scanner.nextInt();
        System.out.println("Перший гравець команди " + team1 + " має " + player1 + " фрагів");
        scanner.hasNextInt();
        int player2 = scanner.nextInt();
        System.out.println("Другий гравець команди " + team1 + " має " + player2 + " фрагів");
        scanner.hasNextInt();
        int player3 = scanner.nextInt();
        System.out.println("Третій гравець команди " + team1 + " має " + player3 + " фрагів");
        scanner.nextLine();
        int player4 = scanner.nextInt();
        System.out.println("Четвертий гравець команди " + team1 + " має " + player4 + " фрагів");
        scanner.hasNextInt();
        int player5 = scanner.nextInt();
        System.out.println("П'ятий гравець команди " + team1 + " має " + player5 + " фрагів");
        scanner.nextLine();

        // TEAM 2 NAME AND STATS

        System.out.println("Введіть назву другої команди:");
        String team2 = scanner.nextLine();
        System.out.println("Назва другої команди - " + team2);

        System.out.println("Введіть по черзи кількість фрагів кожного гравця команди " + team2);
        scanner.hasNextInt();
        int player6 = scanner.nextInt();
        System.out.println("Перший гравець команди " + team2 + " має " + player6 + " фрагів");
        scanner.hasNextInt();
        int player7 = scanner.nextInt();
        System.out.println("Перший гравець команди " + team2 + " має " + player7 + " фрагів");
        scanner.hasNextInt();
        int player8 = scanner.nextInt();
        System.out.println("Перший гравець команди " + team2 + " має " + player8 + " фрагів");
        scanner.nextLine();
        int player9 = scanner.nextInt();
        System.out.println("Перший гравець команди " + team2 + " має " + player9 + " фрагів");
        scanner.hasNextInt();
        int player10 = scanner.nextInt();
        System.out.println("Перший гравець команди " + team2 + " має " + player10 + " фрагів");
        scanner.nextLine();

        // AVERAGE FRAGS OF BOTH TEAMS

        double team1AverFrags = ((double) (player1 + player2 + player3 + player4 + player5)/5);
        double team2AverFrags = ((double) (player6 + player7 + player8 + player9 + player10)/5);

//        System.out.println(team1AverFrags);
//        System.out.println(team2AverFrags);

        if (team1AverFrags > team2AverFrags) {
            System.out.println("Перемогла команда " + team1 + " набравши " + team1AverFrags + " очків");
        } else if (team1AverFrags < team2AverFrags) {
            System.out.println("Перемогла команда " + team2 + " набравши " + team2AverFrags + " очків");
        } else if (team1AverFrags == team2AverFrags){
            System.out.println("Команди " + team1 + " та " + team2 + " зіграли внічию");
        }
    }
}