package codingchallenges;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeController {

    // Create employees Array List
    ArrayList<EmployeeModel> employees = new ArrayList<>();
    //create scanner object
    Scanner scn = new Scanner(System.in);

    public void generateUsers() {
        //EmployeeController emp = new EmployeeController();
        //ArrayList employees = new ArrayList<>();
        employees.add(new EmployeeModel("Cristiano", "Ronaldo", 1234, "01/01/1989"));
        employees.add(new EmployeeModel("James", "Bond", 0007, "10/010/1988"));
        employees.add(new EmployeeModel("Ed", "Sheeran", 8754, "08/08/1990"));
        employees.add(new EmployeeModel("Leo", "Messi", 9999, "02/02/1988"));
//        employees.add(new EmployeeModel(emp.firstname, emp.surname, emp.id, emp.dob));

    }

    String firstname;
    String surname;
    int id;
    String dob;

    public void employeeCreateMethod() {
        EmployeeController emp = new EmployeeController();
        System.out.println("Welcome to the employee registration");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstname = scn.nextLine();
        System.out.println("Enter surname");
        String surname = scn.nextLine();
        System.out.println("Enter employee ID");
        int id = Integer.parseInt(scn.nextLine());
        System.out.println("Enter DOB");
        String dob = scn.nextLine();
        employees.add(new EmployeeModel(firstname,surname,id,dob));
        mainMenu();
    }

    public void viewEmployees() {
        for(EmployeeModel e : employees) {
            System.out.println("Firstname: " + e.forename + "," + "Surname: " + e.surname + "," + "ID No: "+ e.employeeID + "'" + "DOB: " + e.employeeDOB);
        }
        mainMenu();
    }

    public void editEmployee() {
        System.out.println("What is the ID of the employee you would like to edit?");
        int editID = Integer.parseInt(scn.nextLine());
        System.out.println("You have entered " + editID);
        System.out.println("What would you like to change?");
        System.out.println("1 - Forename");
        System.out.println("2 - Surname");
        System.out.println("3 - Date of Birth");
        System.out.println("4 - Back to main menu");
        int editSelection = Integer.parseInt(scn.nextLine());

        switch (editSelection) {
            case 1: {
                //
                System.out.println("What would you like to change it to?");
                String newName = scn.nextLine();
                System.out.println("You have entered " + newName);
                System.out.println("Changing name in progress");
                for(EmployeeModel employee : employees) {
                    if(employee.employeeID == editID ) {
                        employee.forename = newName;
                        System.out.println("Returning you to the main menu");
                        mainMenu();
                        break;

                    }
                }
            }
            case 2: {

                System.out.println("What would you like to change it to?");
                String newSurname = scn.nextLine();
                System.out.println("You have entered " + newSurname);
                System.out.println("Changing name in progress");
                for(EmployeeModel employee : employees) {
                    if(employee.employeeID == editID ) {
                        employee.surname = newSurname;
                        System.out.println("Returning you to the main menu");
                        mainMenu();
                        break;
                    }
                }
            }
            case 3: {

                System.out.println("What would you like to change it to?");
                String newDOB = scn.nextLine();
                System.out.println("You have entered " + newDOB);
                System.out.println("Changing DOB in progress");
                for(EmployeeModel employee : employees) {
                    if(employee.employeeID == editID ) {
                        employee.employeeDOB = newDOB;
                        System.out.println("Returning you to the main menu");
                        mainMenu();
                        break;
                    }
                }
            }
            case 4: {
                mainMenu();
                break;
            }

        }


    }

    public void deleteEmployee() {

        System.out.println("Please enter the employee ID of the employee you would like to delete");
        int userInput = Integer.parseInt(scn.nextLine());
        System.out.println("You have entered " + "Employee " + userInput);
        System.out.println("Would you like to continue?");
        System.out.println("1 - Yes");
        System.out.println("2 - No");
        int yesorNo = Integer.parseInt(scn.nextLine());


        switch (yesorNo) {
            case 1: {
                employees.removeIf(employeeModel -> employeeModel.employeeID == userInput);
                System.out.println("Employee has been successfully deleted, returning you to the main menu");
                mainMenu();
                break;
            }

            case 2: {
                mainMenu();
                break;
            }
        }
    }

    public void mainMenu() {

        Scanner scn = new Scanner(System.in);
        System.out.println(" 1 - Add A New Employee");
        System.out.println(" 2 - View Current Employees");
        System.out.println(" 3 - Delete an employee");
        System.out.println(" 4 - Edit an employee");
        int userInput = Integer.parseInt(scn.nextLine());
        switch (userInput) {
            case 1: {
                employeeCreateMethod();
                mainMenu();
                break;
            }

            case 2: {
                viewEmployees();
                mainMenu();
                break;
            }

            case 3: {
                deleteEmployee();
                break;
            }
            case 4: {
                editEmployee();
                break;
            }


        }
    }
}



