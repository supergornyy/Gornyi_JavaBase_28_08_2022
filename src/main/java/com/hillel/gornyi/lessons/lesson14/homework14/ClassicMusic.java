package com.hillel.gornyi.lessons.lesson14.homework14;

public class ClassicMusic extends MusicStyles {

    public ClassicMusic (String bandName) {
        super (bandName);
    }

    @Override
    void playMusic() {
        System.out.println("This orchestra is " + bandName);
    }

}
