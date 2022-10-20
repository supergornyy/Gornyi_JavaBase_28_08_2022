package com.hillel.gornyi.lessons.lesson15.homework15;

import com.hillel.gornyi.lessons.lesson15.homework15.Interfaces.LinuxOS;
import com.hillel.gornyi.lessons.lesson15.homework15.Interfaces.Smartphones;

public class Androids implements Smartphones, LinuxOS {

    String smartPhone;

    public Androids(String smartPhone) {
            this.smartPhone = smartPhone;
    }

    @Override
    public void call() {
        System.out.println("The " +smartPhone+ " can make a call");
    }

    @Override
    public void sms() {
        System.out.println("The " +smartPhone+ " can send the sms");
    }

    @Override
    public void internet() {
        System.out.println("The " +smartPhone+ " can waste your time in WEB");
    }

    @Override
    public void vedro() {
        System.out.println("But the " +smartPhone+ " is still a plastic bucket");
    }
}
