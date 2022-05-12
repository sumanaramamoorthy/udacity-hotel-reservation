package model;

public class Room implements IRoom{
    String roomNumber;
    double price;
    RoomType roomType;
    boolean roomAvail;


    public Room(String roomNumber,double price,RoomType roomType,boolean roomAvail){
        this.roomNumber=roomNumber;
        this.price=price;
        this.roomType=roomType;
        this.roomAvail=roomAvail;
    }

    public String getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(String roomNumber) {
        this.roomNumber=roomNumber;
    }

    public String getRoomPrice() {
        return Double.toString(price);
    }
    public void setRoomPrice(double price) {
        this.price=price;
    }
    public RoomType getRoomType(){
        return roomType;
    }
    public boolean isFree(){
        return roomAvail;
    }

    @Override
    public String toString() {
        return "RoomClass{" +
                "roomNumber='" + roomNumber + '\'' +
                ", price=" + price +
                ", roomType=" + roomType +
                ", roomAvail=" + roomAvail +
                '}';
    }
}
