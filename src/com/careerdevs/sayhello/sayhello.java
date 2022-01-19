package com.careerdevs.sayhello;

import java.util.Scanner;

public class sayhello {
    public static void main(String [] args)
    {
        whatIsYourName();
    }

    public static void whatIsYourName()
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String name = keyboardInput.nextLine();
        System.out.println("Hello, nice to meet you " + name + "!");
    }
}
