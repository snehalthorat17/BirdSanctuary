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
                addNewBird();
                break;
            case 2:
                System.out.println("Enter bird name do you want to delete:");
                Scanner sc = new Scanner(System.in);
                String birdName = sc.nextLine();
                Bird bird = birdRepository.getBird(birdName);
                birdRepository.remove(bird);
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
        ostrich2.id = "O002";

        BirdRepository birdRepository = BirdRepository.getInstance();
        birdRepository.add(parrot);
        birdRepository.add(penguin);
        birdRepository.add(duck);
        birdRepository.add(crow);
        birdRepository.add(ostrich);
        birdRepository.add(ostrich2);
    }

    public void addColorOption(Bird bird) {
        System.out.println("Enter the colour of bird from below options:");
        System.out.println("Enter 1 for RED");
        System.out.println("Enter 2 for GREEN");
        System.out.println("Enter 3 for BLUE");
        System.out.println("Enter 4 for WHITE");
        System.out.println("Enter 5 for BLACK");
        System.out.println("Enter 6 for BLACK_WHITE");

        Scanner sc = new Scanner(System.in);
        int colorOption = sc.nextInt();
//        return colorOption;

        switch (colorOption) {
            case 1:
                bird.color = Bird.Color.RED;
                break;
            case 2:
                bird.color = Bird.Color.GREEN;
                break;
            case 3:
                bird.color = Bird.Color.BLUE;
                break;
            case 4:
                bird.color = Bird.Color.WHITE;
                break;
            case 5:
                bird.color = Bird.Color.BLACK;
                break;
            case 6:
                bird.color = Bird.Color.BLACK_WHITE;
                break;
            default:
                System.out.println("Please enter proper input");
                break;

        }
    }
    void addNewBird() {

        System.out.println("Please enter bird you want to add: ");
        Scanner sc1 = new Scanner(System.in);
        Bird bird = new Bird();
        bird.name = sc1.nextLine();

        System.out.println("Enter the id of bird:");
        Scanner scanner = new Scanner(System.in);
        bird.id = scanner.nextLine();

        addColorOption(bird);
        BirdRepository birdRepository = BirdRepository.getInstance();
        birdRepository.add(bird);


    }
}
