package com.careerdevs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String firstName = "Eric";
        String lastName = "Kromah";
//      String fullName = firstName + " " + lastName;
//	    System.out.println(fullName);


//      String createdName = createFullName(firstName, lastName);
//      System.out.println(createdName);
        String generatedName = NameGenerator.generateFullName("first", "last");

        Person myPerson = new Person(firstName, lastName);
        System.out.println("First Name: " + myPerson.firstName);
        System.out.println("Last Name: " + myPerson.lastName);
        System.out.println("Human: " + myPerson.human);
        System.out.println("Age: " + myPerson.getAge(1/13/2022));
        System.out.println(myPerson.getFullName());
    }

    public static String createFullName (String fName, String lName)
    {
        return fName + " " + lName;
    }


}
