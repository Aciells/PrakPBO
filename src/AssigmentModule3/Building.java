package AssigmentModule3;

public class Building {
    private String name;
    private String address;
    private int numberFloor;

    public Building(String name, String address, int numberFloor) {
        this.name = name;
        this.address = address;
        this.numberFloor = numberFloor;

        System.out.println("---------------------------");
        System.out.println("Building added succesfully!");
        System.out.println("---------------------------");

    }

    public void displayBuildInfo() {
        System.out.println("--- Building Information ---");
        System.out.println("Name of the building: " + this.name);
        System.out.println("Address of the builing: " + this.address);
        System.out.println("Number of floors: " + this.numberFloor);



    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberFloor() {
        return numberFloor;
    }
}