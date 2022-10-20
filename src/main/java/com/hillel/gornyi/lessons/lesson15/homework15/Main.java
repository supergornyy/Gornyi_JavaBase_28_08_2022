package com.hillel.gornyi.lessons.lesson15.homework15;

public class Main {

    public static void main(String[] args) {

        Androids[] androids = {
                new Androids("Samsung Galaxy"),
                new Androids("Xiaomi Mi")
    };
        Iphones[] iphones = {
                new Iphones("Iphone 4s"),
                new Iphones("Iphone 15 XR PRO MAX")
    };

        for (Androids android : androids) {
            android.sms();
            android.call();
            android.internet();
            android.vedro();
            System.out.println();
        }

        System.out.println("--------------------");

        for (Iphones iphone : iphones) {
            iphone.sms();
            iphone.call();
            iphone.internet();
            iphone.chelka();
            System.out.println();
        }
    }
}
