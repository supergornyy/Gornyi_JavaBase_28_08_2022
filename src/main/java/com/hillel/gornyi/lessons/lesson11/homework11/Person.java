package com.hillel.gornyi.lessons.lesson11.homework11;

public class Person {

    public static void main(String[] args) {

        System.out.println(personInfo("Will", "Smith", "New York", "2936729462846"));
        System.out.println(personInfo("Sherlock", "Holmes", "London", "37742123513"));
        System.out.println(personInfo("Jackie", "Chan", "Shanghai", "12312412412"));
    }

    static String personInfo(String userName, String userSurname, String userCity, String userPhone) {
        String user = "Call to " + userName + " " + userSurname + " from " + userCity + " using a phone number: " + userPhone;
        return user;
    }

}
