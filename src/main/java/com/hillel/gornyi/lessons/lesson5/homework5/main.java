package com.hillel.gornyi.lessons.lesson5.homework5;

public class main {
    public static void main(String[] args) {
        String team1 = "mTw";
        int player1 = 22;
        int player2 = 20;
        int player3 = 14;
        int player4 = 11;
        int player5 = 5;

        String team2 = "SK Gaming";
        int player6 = 31;
        int player7 = 17;
        int player8 = 15;
        int player9 = 7;
        int player10 = 6;

        double team1AverFrags = (player1 + player2 + player3 + player4 + player5)/5;
        double team2AverFrags = (player6 + player7 + player8 + player9 + player10)/5;

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