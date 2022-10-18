package com.hillel.gornyi.lessons.lesson14.homework14;

public class PopMusic extends MusicStyles {

    public PopMusic (String bandName) {
        super (bandName);
    }

    @Override
    void playMusic() {
        System.out.println("This 'pop-band' is called " + bandName);
    }

}
