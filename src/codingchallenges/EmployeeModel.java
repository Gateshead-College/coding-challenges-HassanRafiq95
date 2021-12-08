package codingchallenges;

import java.util.ArrayList;

public class EmployeeModel {

//    public static void main(String[] args) {
//        EmployeeController empc = new EmployeeController();
//        empc.generateUsers();
//        empc.employeeCreateMethod();
//        empc.viewEmployees();
//    }

        String forename;
        String surname;
        int employeeID;
        String employeeDOB;

    public EmployeeModel(String forename, String surname, int employeeID, String employeeDOB) {
        this.forename = forename;
        this.surname = surname;
        this.employeeID = employeeID;
        this.employeeDOB = employeeDOB;
    }


}

