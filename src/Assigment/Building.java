package Assigment;

public class Building {

    String name;
    String address;
    int numberFloor;

    public Building(String name, String address, int numberFloor) {
        this.name = name;
        this.address = address;
        this.numberFloor = numberFloor;

        displayBuildInfo();

    }

    public void displayBuildInfo(){
        System.out.println("--- Building Information ---");
        System.out.println("Name of the building: " + name);
        System.out.println("Address of the builing: " + address);
        System.out.println("Number of floors: " + numberFloor);

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
