package AssigmentModule3;

public class Restoran extends Building{

    private int numberOfTables;

    public Restoran(String name, String address, int numberFloor, int numberOfTables) {
        super(name, address, numberFloor);
        this.numberOfTables = numberOfTables;
    }

    @Override
    public void displayBuildInfo() {
        System.out.println("\n ---------Restoran---------");
        super.displayBuildInfo();
        System.out.println("Number of Beds: " + this.numberOfTables);
        System.out.println("===========================");
    }

    public int getNumberOfTables() {
        return numberOfTables;
    }
}
