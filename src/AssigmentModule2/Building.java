package AssigmentModule2;

public class Building {

    private String name;
    private String address;
    private int numberFloor;

    public Building(String name, String address, int numberFloor) {
        this.name = name;
        this.address = address;
        this.numberFloor = numberFloor;

    displayBuildInfo();

    }

    public void displayBuildInfo(){
        System.out.println("\n--- Building Information ---");
        System.out.println("Name of the building: " + name);
        System.out.println("Address of the builing: " + address);
        System.out.println("Number of floors: " + numberFloor);
        System.out.println("===========================\n");


    }

    String getName(){
        return this.name;
    }

    String getAddress(){
        return this.address;
    }

    int getNumberFloor(){
        return this.numberFloor;
    }
}
