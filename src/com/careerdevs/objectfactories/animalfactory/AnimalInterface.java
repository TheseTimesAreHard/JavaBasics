package com.careerdevs.objectfactories.animalfactory;

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


        System.out.println("How much does you animal way? (please put information in pounds (lbs): ");
        int pounds = scanner.nextInt();

        Animal createAnAnimal = new Animal(name, breed, pounds);

        System.out.println(createAnAnimal);
    }
}
