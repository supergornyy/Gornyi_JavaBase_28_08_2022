package com.hillel.gornyi.lessons.lesson13.homework13;

public class UserData {

    private final String firstName, email, phoneNumber;
    private final int yearBirth, monthBirth, dayBirth;

    private String familyName;
    private double weight, bloodPressure, stepsCounter;

    private final int age;

    public UserData(String firstName, String email, String phoneNumber, int yearBirth, int monthBirth, int dayBirth, String familyName, double weight, double bloodPressure, double stepsCounter) {
        this.firstName = firstName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.yearBirth = yearBirth;
        this.monthBirth = monthBirth;
        this.dayBirth = dayBirth;
        this.familyName = familyName;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.stepsCounter = stepsCounter;
        age = 2020 - yearBirth;
    }

    public String getFirstName() {return firstName;}
    public int getYearBirth() {return yearBirth;}
    public int getMonthBirth() {return monthBirth;}
    public int getDayBirth() {return dayBirth;}
    public String getEmail() {return email;}
    public String getPhoneNumber() {return phoneNumber;}

    public String getFamilyName() {return familyName;}
    public void setFamilyName(String familyName) {this.familyName = familyName;}

    public double getWeight() {return weight;}
    public void setWeight(double weight) {this.weight = weight;}

    public double getBloodPressure() {return bloodPressure;}
    public void setBloodPressure(double bloodPressure) {this.bloodPressure = bloodPressure;}

    public double getStepsCounter() {
        return stepsCounter;
    }
    public void setStepsCounter(double stepsCounter) {
        this.stepsCounter = stepsCounter;
    }

    public int getAge() {
        return age;
    }

    public void printAccountInfo() {
        System.out.println( "User name is " + firstName + " " + familyName + ". User age is " + age +
                ". Date of birth is " + dayBirth + "." + monthBirth + "." + yearBirth +
                ". Contact email and phone number are: " + email + "\\ " + phoneNumber +
                ". User weight is " + weight + ", blood pressure is " + bloodPressure +
                ", steps been made today: " + stepsCounter);
    }
}
