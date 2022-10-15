package com.hillel.gornyi.lessons.lesson13.homework13;

public class Main {

    public static void main(String[] args) {

        UserData user1 = new UserData("Igor", "president@gov.ua", "555-call-to-me", 1988, 8, 21, "Gornyi", 95.1, 140, 20000);
        UserData user2 = new UserData("Lionel", "president@gov.ua", "555-call-to-me", 1987, 8, 21, "Messi", 70.6, 140, 20000);
        UserData user3 = new UserData("Cristiano", "president@gov.ua", "555-call-to-me", 1986, 8, 21, "Ronaldo", 75.2, 140, 20000);
        UserData user4 = new UserData("Zlatan", "president@gov.ua", "555-call-to-me", 1985, 8, 21, "Gornyi", 90.0, 140, 20000);
        UserData user5 = new UserData("Wayne", "president@gov.ua", "555-call-to-me", 1984, 8, 21, "Gornyi", 80.7, 140, 20000);

        System.out.println("Initial users:");

        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
        user4.printAccountInfo();
        user5.printAccountInfo();

        user1.setWeight(65);
        user1.setBloodPressure(110);
        user4.setFamilyName("Biden");
        user4.setStepsCounter(5000);

        System.out.println();
        System.out.println("Changed users:");

        user1.printAccountInfo();
        user4.printAccountInfo();

//        record Person (String name, int age){};
//        Person person1 = new Person("Igor", 4);
//        System.out.println(person1.name());

    }
}
