package reservation;

import java.util.ArrayList;

public class CustomerModel {

    // ArrayList containing customers details
    ArrayList<CustomerModel> customer = new ArrayList<>();

        String firstname;
        String lastname;
        String phoneNo;
        String emailAddress;

    public CustomerModel(String firstname, String lastname, String phoneNo, String emailAddress) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNo = phoneNo;
        this.emailAddress = emailAddress;
    }



}
