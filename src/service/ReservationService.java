package service;

import model.Customer;
import model.IRoom;
import model.Reservation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class ReservationService {

    private List<IRoom> rooms = new ArrayList<>();

    private List<Reservation> reservations =new ArrayList<>();


    public  void addRoom(IRoom room){
        rooms.add(room);
    }

    public IRoom getARoom(String roomID){
        for (IRoom room: rooms){
            if(roomID.equals(room.getRoomNumber())){
                return room;
            }
        }
        return null;
    }

    public Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate){
        //TODO :: make sure room is available on the date if say room not available
        Reservation reserve= new Reservation( customer, room, checkInDate, checkOutDate);
        for (Reservation reserve:reservations){
            if (checkInDate.(reserve.getCheckInDate())

        } {

        }
        //for (Reservation reserve:reservations) {

            
        }
    }

    public Collection<IRoom> findRooms(Date checkInDate,Date checkOutDate){
        
    }
    public Collection<Reservation> getCustomersReservation(Customer customer){

    }

    public void printAllReservation(){

    }



}
