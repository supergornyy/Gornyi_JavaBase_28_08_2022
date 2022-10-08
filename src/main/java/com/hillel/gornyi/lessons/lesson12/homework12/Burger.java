package com.hillel.gornyi.lessons.lesson12.homework12;

public class Burger {

    String bun, meat, doubleMeat, cheese, greens, mayonnaise;

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
    }
    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
    }
    public Burger(String bun, String meat, String doubleMeat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.doubleMeat = doubleMeat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
    }
}
