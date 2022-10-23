package com.hillel.gornyi.lessons.lesson16.homework16;

public enum DrinkMachine {

    COFFEE("Coffee"),
    TEA("Tea"),
    LEMONADE("Lemonade"),
    MOJITO("Mojito"),
    SODA("Soda"),
    COLA("Coke");

    private String prodName;

    DrinkMachine(String prodName) {
        this.prodName = prodName;
    }

    public String getProdName() {
        return prodName;
    }
}