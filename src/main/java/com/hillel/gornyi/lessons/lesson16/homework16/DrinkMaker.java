package com.hillel.gornyi.lessons.lesson16.homework16;

public class DrinkMaker {

    public static void makeDrink (DrinkMachine drinkMachine) {
        System.out.println("Your " + drinkMachine.getProdName() + " is preparing..");
        make();
        System.out.println("Your " + drinkMachine.getProdName() + " is ready!");
    }

    private static void make() {
        try {
            Thread.sleep(3000);
            new Drink();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
