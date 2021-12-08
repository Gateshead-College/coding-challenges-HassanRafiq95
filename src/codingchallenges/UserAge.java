package codingchallenges;

import java.util.Scanner;


public class UserAge {

    public static void main(String[] args) {
        UserAge usage = new UserAge();
        usage.userAge();
    }

    private void userAge() {
        boolean playGame = true;
        while (playGame) {

            //get user age
            Scanner scn = new Scanner(System.in);
            System.out.println("If you will like to exit, type 'q!' and press enter");
            System.out.println("If you would like to play, press enter");
            String exit = scn.nextLine();

            if (exit.equals("q!")) {
                playGame = false;
                break;
            }

            System.out.println("Please enter your age");

            int age = scn.nextInt();

            if (age < 16) {
                System.out.println("You are still young");
            } else if (age > 16 && age < 20) {
                System.out.println("You are coming to the end of your teen years");
            } else if (age >= 20 && age < 25) {
                System.out.println("Apparently you need to 'grow up'");
            } else if (age >= 25 && age < 30) {
                System.out.println("When did life become all about work?");
            } else if (age >= 30 && age < 40) {
                System.out.println("Your body is falling apart, you need help to put socks on don't you?");
            } else if (age >= 40 && age < 50) {
                System.out.println("The kids are almost at the age where they will leave you alone, hooray!?");
            } else if (age >= 50) {
                System.out.println("Kids are gone, lots of free time, time for a mid life crisis");
            } else {
                System.out.println("You entered an in-compatible age, try again");
                userAge();
            }
        }
    }
}

