package service;

import model.Customer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CustomerService {

    private  List<Customer> customers = new ArrayList<>();
    private static final CustomerService customerService = new CustomerService();

    private CustomerService(){

    }
    public static CustomerService getInstance(){
        return customerService;
    }

    public void addCustomer(String email,String firstName,String lastName){
        Customer customer=new Customer(firstName,lastName,email);
        customers.add(customer);

    }

    public Customer getCustomer(String customerEmail){
        for (Customer customer:customers) {
            if(customerEmail.equals(customer.getEmail())){
                return  customer;
            }
        }
        return null;

    }

    public Collection<Customer> getAllCustomers(){
        return customers;
    }
}
