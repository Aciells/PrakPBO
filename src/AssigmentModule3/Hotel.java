package AssigmentModule3;

public class Hotel extends Building{

    int numberOfRooms;

    public Hotel(String name, String address, int numberFloor, int numberOfRooms) {
        super(name, address, numberFloor);
        this.numberOfRooms = numberOfRooms;
    }
}
