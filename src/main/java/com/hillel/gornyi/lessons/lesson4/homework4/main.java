package com.hillel.gornyi.lessons.lesson4.homework4;

public class main {
    public static void main(String[] args) {

        // Lee
         int warriorLee = 13;
         int archerLee = 24;
         int knightLee = 46;
         double armyLee = 860;
         double damageLee = (warriorLee + archerLee + knightLee) * armyLee;
         System.out.println("Lee's army damage per second: " + damageLee);

         // Ming
         int warriorMing = 9;
         int archerMing = 35;
         int knightMing = 12;
         double armyMing = 1.5 * armyLee;
         double damageMing = (warriorMing + archerMing + knightMing) * armyMing;
         System.out.println("Ming's army damage per second: " + damageMing);

         System.out.println();

         // additional info
         if (damageLee > damageMing) {
             System.out.println("Lee's army is stronger");
         } else {
             System.out.println("Ming's army is stronger!");}
    }
}
