package com.careerdevs.asktheuser;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {

        createAUser();

    }

    public static void createAUser()
    {
        Scanner scanner = new Scanner(System.in);
        //Step 1 ask user a question???
        System.out.println("Full Name: ");

        //Step 2 User input
        String fullName = scanner.nextLine();

        System.out.println("DOB : ");
        String dateOfBirth = scanner.nextLine();

        System.out.println("Age: ");
        int age = scanner.nextInt();

        User generatedUser = new User(fullName, dateOfBirth, age);

        System.out.println(generatedUser);
    }


}
