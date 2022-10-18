package com.hillel.gornyi.lessons.lesson14.homework14;

public class RockMusic extends MusicStyles {

    public RockMusic (String bandName) {
        super (bandName);
    }

    @Override
    void playMusic() {
        System.out.println("This rock band is called " + bandName);
    }

}
