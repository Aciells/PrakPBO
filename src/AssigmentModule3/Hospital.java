package AssigmentModule3;

public class Hospital extends Building{
    int numberOfBeds;

    public Hospital(String name, String address, int numberFloor, int numberOfBeds) {
        super(name, address, numberFloor);
        this.numberOfBeds = numberOfBeds;
    }

}
