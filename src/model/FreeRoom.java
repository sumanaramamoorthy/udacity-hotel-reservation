package model;

public class FreeRoom extends Room {
    public FreeRoom(String roomNumber,RoomType roomType, boolean roomAvail){

        super(roomNumber,0d,roomType,roomAvail);


    }

    @Override
    public String toString() {
        return "FreeRoom::" + super.toString();
    }
}
