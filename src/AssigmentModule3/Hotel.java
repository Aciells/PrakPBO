package AssigmentModule3;

public class Hotel extends Building{

    private int numberOfRooms;

    public Hotel(String name, String address, int numberFloor, int numberOfRooms) {
        super(name, address, numberFloor);
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public void displayBuildInfo() {
        System.out.println("\n ----------Hotel-----------");
        super.displayBuildInfo();
        System.out.println("Number of Beds: " + this.numberOfRooms);
        System.out.println("===========================");
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }
}
