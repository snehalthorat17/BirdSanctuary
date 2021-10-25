package com.bridgelabz;

import java.util.Scanner;

public class Application {

//    UserInterface userInterface = UserInterface.getInstance();
//    BirdRepository birdRepository = BirdRepository.getInstance();

    public static void main(String args[]) {
        System.out.println("Welcome to Bird Sanctuary");

        Application application = new Application();

        boolean printAgainOptions = false;

        while (!printAgainOptions) {
            UserInterface userInterface = UserInterface.getInstance();
            int userOption = userInterface.showUserMenu();
            application.handleUserOption(userOption);
        }
      /*  Bird parrot = new Parrot();
        parrot.id = "P001";
        Bird penguin = new Penguin();
        penguin.id = "PN001";
        Bird duck = new Duck();
        duck.id = "D001";
        Bird crow = new Crow();
        crow.id = "C001";
        Bird ostrich = new Ostrich();
        ostrich.id = "O001";
        Bird ostrich2 = new Ostrich();
        ostrich2.id = "O001";

        BirdRepository birdRepository = new BirdRepository();
        birdRepository.add(parrot);
        birdRepository.add(penguin);
        birdRepository.add(duck);
        birdRepository.add(crow);
        birdRepository.add(ostrich);
        birdRepository.add(ostrich2);


        UserInterface userInterface = new UserInterface();
        userInterface.print(birdRepository.getBirdList());

        birdRepository.remove(parrot);
        System.out.println("After removing bird from list: ");
        userInterface.print(birdRepository.getBirdList());

        System.out.println("Birds who can swim: ");
        userInterface.printSwimmable(birdRepository.getBirdList());

        System.out.println("Birds who can fly: ");
        userInterface.printFlyable(birdRepository.getBirdList()); */
        System.out.println("Goodbye");
    }

    private void handleUserOption(int userOption) {

        UserInterface userInterface = UserInterface.getInstance();
        BirdRepository birdRepository = BirdRepository.getInstance();

        switch (userOption){
            case 1:
                addBird();
                break;
            case 2:
                System.out.println("Enter bird name do you want to delete:");
                Scanner sc = new Scanner(System.in);
                String birdName = sc.nextLine();

                break;
            case 3:
                userInterface.print(birdRepository.getBirdList());
                break;
            case 4:
                userInterface.printSwimmable(birdRepository.getBirdList());
                break;
            case 5:
                userInterface.printFlyable(birdRepository.getBirdList());
                break;
            default:
                System.out.println("Please give proper input");
                break;
        }
    }

    private void addBird() {
        Bird parrot = new Parrot();
        parrot.id = "P001";
        Bird penguin = new Penguin();
        penguin.id = "PN001";
        Bird duck = new Duck();
        duck.id = "D001";
        Bird crow = new Crow();
        crow.id = "C001";
        Bird ostrich = new Ostrich();
        ostrich.id = "O001";
        Bird ostrich2 = new Ostrich();
        ostrich2.id = "O001";

        BirdRepository birdRepository = BirdRepository.getInstance();
        birdRepository.add(parrot);
        birdRepository.add(penguin);
        birdRepository.add(duck);
        birdRepository.add(crow);
        birdRepository.add(ostrich);
        birdRepository.add(ostrich2);
    }
}
