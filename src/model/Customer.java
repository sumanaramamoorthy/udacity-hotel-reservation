package model;

import java.util.regex.Pattern;

public class Customer {
    String firstName;
    String lastName;
    String email;
    String emailRegex="^(.+)@(.+)\\.(.+)";
    Pattern pattern=Pattern.compile(emailRegex);

    public Customer(String firstName,String lastName,String email){
        if(!pattern.matcher(email).matches()){
            throw new IllegalArgumentException("Error, Invalid email");
        }
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;

    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }


    public String toString(){
        return "First Name:" + firstName+ " Last Name:" +lastName+  " Email:"+email;
    }

}

