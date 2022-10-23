package com.hillel.gornyi.lessons.lesson16.homework16;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static int total = 0;

    public static void main(String[] args) {
        prepDrink();

        System.out.println("Total number of drinks: " + Drink.counter);
        System.out.println("Total price: " + total);
        scanner.close();
    }

    public static void prepDrink() {

        System.out.println("Please, choose your drink from the list: " + Arrays.toString(DrinkMachine.values()));

        while (true) {
            DrinkMachine drinkMachine = getProdName();
            if (drinkMachine == null) {
                return;
            }
            String product = "You choose: %s, it's price: %s";
            switch (drinkMachine) {
                case COFFEE: {
                    System.out.println(String.format(product, drinkMachine.getProdName(), Drinks.coffeePrice));
                    DrinkMaker.makeDrink(drinkMachine);
                    total += Drinks.coffeePrice;
                    break;
                }
                case TEA: {
                    System.out.println(String.format(product, drinkMachine.getProdName(), Drinks.teaPrice));
                    DrinkMaker.makeDrink(drinkMachine);
                    total += Drinks.teaPrice;
                    break;
                }
                case LEMONADE: {
                    System.out.println(String.format(product, drinkMachine.getProdName(), Drinks.lemonadePrice));
                    DrinkMaker.makeDrink(drinkMachine);
                    total += Drinks.lemonadePrice;
                    break;
                }
                case MOJITO: {
                    System.out.println(String.format(product, drinkMachine.getProdName(), Drinks.mojitoPrice));
                    DrinkMaker.makeDrink(drinkMachine);
                    total += Drinks.mojitoPrice;
                    break;
                }
                case SODA: {
                    System.out.println(String.format(product, drinkMachine.getProdName(), Drinks.sodaPrice));
                    DrinkMaker.makeDrink(drinkMachine);
                    total += Drinks.sodaPrice;
                    break;
                }
                case COLA: {
                    System.out.println(String.format(product, drinkMachine.getProdName(), Drinks.cokePrice));
                    DrinkMaker.makeDrink(drinkMachine);
                    total += Drinks.cokePrice;
                    break;
                }
            }
        }
    }

        private static DrinkMachine getProdName() {
            System.out.println("Please choose drink or type \"NO\"");
            while (true) {
                String product = scanner.next().toUpperCase();

                if (product.equals("NO")) {
                    return null;
                }

                for (DrinkMachine value : DrinkMachine.values()) {
                    if (product.equals(value.toString())) {
                        return DrinkMachine.valueOf(product);
                    }
                }
                System.out.println("Please choose drink from list " + Arrays.toString(DrinkMachine.values()));
            }
        }
    }

//        while (true) {
//            String userChoice = scanner.nextLine().toUpperCase();
//            DrinkMachine[] drinkMachine;
//            for (DrinkMachine type : drinkMachine) {
//                if (userChoice.equalsIgnoreCase(type.toString())) {
//                    drinkMachine = DrinkMachine.valueOf(userChoice);
//                    System.out.println("You choice has been received. "+userChoice+ " will be prepared soon!");
//                    break;
//                }
//            }
//            if (drinkMachine != null) {
//                break;
//            } else {
//                System.out.println("You have entered wrong data.");
//            }
//        }

//        System.out.println("TOTAL: ");
//        System.out.println(DrinkMachine.SODA.getPrice()+DrinkMachine.MOJITO.getPrice());

//        DrinkMachine drinkType2 = null;
//        try {
//            drinkType2 = DrinkMachine.valueOf("COFFEE");
//        } catch (IllegalArgumentException e) {
//            System.out.println("Incorrect data");
//        }
//        if (drinkType2 != null) {
//            System.out.println(drinkType2.getTitle() + " " + drinkType2.getPrice()+ " USD");
//        }


