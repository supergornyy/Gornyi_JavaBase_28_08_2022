package com.hillel.gornyi.lessons.lesson12.homework12;

public class BurgerMain {

    public static void main(String[] args) {

        Burger burgerCommon = new Burger("The crunchiest bun,"," local meat,"," ideal cheese,"," fresh salad ","and homemade mayonnaise.");
        System.out.println(burgerCommon.bun + burgerCommon.meat + burgerCommon.cheese + burgerCommon.greens + burgerCommon.mayonnaise);
        Burger burgerDiet = new Burger("The crunchiest bun,"," local meat,"," ideal cheese"," and fresh salad.");
        System.out.println(burgerDiet.bun + burgerDiet.meat + burgerDiet.cheese + burgerDiet.greens);
        Burger burgerDouble = new Burger("The crunchiest bun,", "", " local double meat,", " ideal cheese,"," fresh salad ", "and homemade mayonnaise.");
        System.out.println(burgerDouble.bun + burgerDouble.doubleMeat + burgerDouble.cheese + burgerDouble.greens + burgerDouble.mayonnaise);
    }
}