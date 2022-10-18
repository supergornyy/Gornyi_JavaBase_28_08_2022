package com.hillel.gornyi.lessons.lesson14.homework14;

public abstract class MusicStyles {

    String bandName;
    public MusicStyles(String bandName) {
        this.bandName = bandName;
    }
    abstract void playMusic();

}
