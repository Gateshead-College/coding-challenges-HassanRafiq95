package codingchallenges;

import java.util.Scanner;

public class EmployeeStartup {

    public static void main(String[] args) {
        EmployeeStartup startup = new EmployeeStartup();
        startup.startupMessage();
    }

    public void startupMessage() {

        EmployeeController empcontrol = new EmployeeController();
        empcontrol.generateUsers();
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome To The Employee Registration Portal");
        System.out.println("What would you like to do?");
        System.out.println("----------------------------");
        empcontrol.mainMenu();


//        System.out.println(" 1 - Add A New Employee");
//        System.out.println(" 2 - View Current Employees");
//        System.out.println(" 3 - Return to the Main Menu");
//        int userInput = Integer.parseInt(scn.nextLine());
//            switch (userInput) {
//                case 1: {
//                    empcontrol.employeeCreateMethod();
//                    break;
//                }
//
//                case 2: {
//                    empcontrol.viewEmployees();
//                    break;
//                }
//
//                case 3: {
//                    break;
//                }
//
//
//            }
//        }
//
//    }

    }
}