package model;

import service.CustomerService;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome To Hotel Reservation Application");
        System.out.println("-----------------------------------------");
       // CustomerService.getInstance();
        CustomerService customerService = CustomerService.getInstance();
        customerService.addCustomer("emily@gmail.com","Emily","kira");
        customerService.addCustomer("johnp@gmail.com","John","phillips");

        System.out.println(customerService.getCustomer("johnp@gmail.com"));

        CustomerService customerService1=CustomerService.getInstance();
        System.out.println(customerService1.getCustomer("johnp@gmail.com"));

	// write your code here
    }
}
