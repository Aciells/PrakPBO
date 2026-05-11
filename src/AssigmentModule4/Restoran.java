package AssigmentModule4;

public class Restoran extends Building implements Taxable{

    private int numberOfTables;
    private double monthlyRevenue;

    public Restoran(String name, String address, int numberOfFloors, BuildingStatus status, int numberOfTables, double monthlyRevenue) {
        super(name, address, numberOfFloors, status);
        this.numberOfTables = numberOfTables;
        this.monthlyRevenue = monthlyRevenue;
    }

    @Override
    public double calculateTax(){
        return monthlyRevenue * BASE_TAX_RATE;
    }

    @Override
    public void showBuilding(){
        System.out.println("================================");
        System.out.println("Type: Hotel");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Floors: " + numberOfFloors);
        System.out.println("Status: " + status);
        System.out.println("Units: " + numberOfTables);
        System.out.println("Revenue: " + monthlyRevenue);
        System.out.println("Tax: " + calculateTax());
        System.out.println("================================");

    }
}
