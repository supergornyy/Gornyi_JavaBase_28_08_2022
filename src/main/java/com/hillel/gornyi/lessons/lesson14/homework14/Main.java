package com.hillel.gornyi.lessons.lesson14.homework14;

public class Main {

    public static void main(String[] args) {

        MusicStyles[] classic = {
                new ClassicMusic("Berlin orchestra"),
                new ClassicMusic("Barvinok orchestra"),
                new ClassicMusic("National orchestra"),
                new ClassicMusic("Royal orchestra")
        };

        MusicStyles[] rock = {
                new RockMusic("Scorpions"),
                new RockMusic("Metallica"),
                new RockMusic("Sabaton"),
                new RockMusic("AC/DC")
        };

        MusicStyles[] pop = {
                new PopMusic("Okean Elzy"),
                new PopMusic("Verka Serdiuchka"),
                new PopMusic("Jamala"),
                new PopMusic("Mika Newtone")
        };

        for (MusicStyles classical : classic) {
            classical.playMusic();
        }
        System.out.println();
        for (MusicStyles rocks : rock) {
            rocks.playMusic();
        }
        System.out.println();
        for (MusicStyles popular : pop) {
            popular.playMusic();
        }


//        ClassicMusic classic = new ClassicMusic("Berlin orchestra");
//        RockMusic rock = new RockMusic("Scorpions");
//        PopMusic pop = new PopMusic("Aqua");
//
//        groupList(rock);
//        groupList(pop);
//        groupList(classic);
//
//    static void groupList (MusicStyles music) {
//        music.playMusic();

    }
}
