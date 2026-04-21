package AssigmentModule3;

public class Hospital extends Building{
    private int numberOfBeds;

    public Hospital(String name, String address, int numberFloor, int numberOfBeds) {
        super(name, address, numberFloor);
        this.numberOfBeds = numberOfBeds;
    }

    @Override
    public void displayBuildInfo() {
        System.out.println("\n ---------Hospital---------");
        super.displayBuildInfo();
        System.out.println("Number of Beds: " + this.numberOfBeds);
        System.out.println("===========================");

    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }
}
