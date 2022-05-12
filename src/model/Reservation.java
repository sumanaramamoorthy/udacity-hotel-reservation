package model;

import java.util.Date;

public class Reservation {
    Customer customer;
    IRoom room;
    Date checkInDate;
    Date checkOutDate;

    public Reservation(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;

    }
    public Customer getCustomer(){
        return customer;
    }
    public IRoom getRoom(){
        return room;
    }
    public Date getCheckInDate(){

        return checkInDate;
    }
    public Date getCheckOutDate(){
        return checkOutDate;
    }


    public String toString() {
        return "Customer:" + customer + "Room:" + room + "CheckInDate:" + checkInDate + "CheckOutDate:" + checkOutDate;
    }


}
