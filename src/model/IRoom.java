package model;

public interface IRoom {

    String getRoomNumber();

    String getRoomPrice();

    RoomType getRoomType();

    boolean isFree();
}
