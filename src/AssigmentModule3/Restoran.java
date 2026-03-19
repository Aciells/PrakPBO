package AssigmentModule3;

public class Restoran extends Building{

    int numberOfTables;

    public Restoran(String name, String address, int numberFloor, int numberOfTables) {
        super(name, address, numberFloor);
        this.numberOfTables = numberOfTables;
    }
}
