package com.careerdevs.objectfactories.animalfactory;

import com.careerdevs.asktheuser.User;

import java.util.Scanner;

public class AnimalInterface {
    public static void main(String[] args) {

        createAnAnimal();
    }

    private static void createAnAnimal() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your animal name? : ");
        String name = scanner.nextLine();


        System.out.println("What breed/type is your animal? : ");
        String breed = scanner.nextLine();


        System.out.println("Age: ");
        int pounds = scanner.nextInt();

        User createAnAnimal = new User(name, breed, pounds);

        System.out.println(createAnAnimal);
    }
}
