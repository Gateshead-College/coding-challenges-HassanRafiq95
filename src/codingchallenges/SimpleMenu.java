package codingchallenges;

import java.util.Scanner;

public class SimpleMenu {

    public static void main(String[] args) {
        SimpleMenu simpMenu = new SimpleMenu();
        simpMenu.simpleMenuMethod();
    }

    private void simpleMenuMethod() {

        System.out.println("Please select an option from the list below");
        System.out.println("Would you like to see...");

        System.out.println("1 - A type of cat");
        System.out.println("2 - A type of dog");
        System.out.println("3 - A type of bird");
        System.out.println("4 - A type of fish");
        System.out.println("5 - exit");

        Scanner scn = new Scanner(System.in);
        int option = scn.nextInt();

        switch (option) {
            case 1:
                System.out.println("Tabby cat");
                simpleMenuMethod();
                break;

            case 2:
                System.out.println("Shih Tzu");
                simpleMenuMethod();
                break;
            case 3:
                System.out.println("Parrot");
                simpleMenuMethod();
                break;
            case 4:
                System.out.println("Salmon");
                simpleMenuMethod();
                break;
            case 5:
                System.out.println("you selected exit()");
                break;


        }
    }
}