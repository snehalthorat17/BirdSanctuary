package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class UserInterface {

    private static UserInterface instance;

    private UserInterface() {

    }

     static UserInterface getInstance() {
        if(instance == null) {
            instance = new UserInterface();
        }
        return instance;
    }

    public void print(HashSet<Bird> birdList) {
        for (Bird bird: birdList) {
            System.out.println(bird);
        }
    }

    public void printSwimmable(HashSet<Bird> birdList) {
        for (Bird bird: birdList) {
            if (bird instanceof Swimmable)
                System.out.println(bird);
        }
    }

    public void printFlyable(HashSet<Bird> birdList) {
        for (Bird bird : birdList) {
            if (bird instanceof Flyable) {
                System.out.println(bird);
            }
        }
    }

    public int showUserMenu() {
        System.out.println("Enter 1 : Add Bird");
        System.out.println("Enter 2 : Delete Bird");
        System.out.println("Enter 3 : Print all Birds");
        System.out.println("Enter 4 : Print all swimmable Birds");
        System.out.println("Enter 5 : Print all flyable Birds");
        System.out.println("Enter 6 : Exit");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        return option;
    }

}
