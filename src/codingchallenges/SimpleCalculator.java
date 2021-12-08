package codingchallenges;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        SimpleCalculator simpCalc = new SimpleCalculator();
        simpCalc.calculatorMethod();

    }

    private void calculatorMethod() {
        System.out.println("Please enter your first number");
        Scanner scn = new Scanner(System.in);
        double firstNumber = scn.nextInt();
        System.out.println("Please enter your second number");
        double secondNumber = scn.nextInt();
        System.out.println("Please enter the operation you would like to complete");
        System.out.println("1 - Addition ");
        System.out.println("2 - Subtraction ");
        System.out.println("3 - Multiplication ");
        System.out.println("4 - Division ");
        System.out.println("5 - Exit ");
        int selection = scn.nextInt();
        switch (selection) {

                case (1):
                double result = firstNumber + secondNumber;
                System.out.println(result);
                calculatorMethod();
                break;

                case (2):
                double subResult = firstNumber - secondNumber;
                System.out.println(subResult);
                calculatorMethod();
                break;

                case (3):
                double multiResult = firstNumber * secondNumber;
                System.out.println(multiResult);
                calculatorMethod();
                break;

                case (4):
                double divResult = firstNumber / secondNumber;
                System.out.println(divResult);
                calculatorMethod();
                break;

                case (5):
                break;
        }
    }
}
