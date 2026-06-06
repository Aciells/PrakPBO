package AssigmentModule4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option;

        Building[] buildings = new Building[100];
        int count = 0;

        do {

            System.out.println("\nWelcome to Smart City Management System");
            System.out.println("1. Add New Building");
            System.out.println("2. Add New Hospital");
            System.out.println("3. Add New Cinema");
            System.out.println("4. Add New Apartment");
            System.out.println("5. Show All Buildings");
            System.out.println("6. Exit");
            System.out.print("Please select an option: ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {

                case 1:
                    System.out.print("Enter Building Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Building Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter Number of Floors: ");
                    int floors = scanner.nextInt();

                    System.out.print("Enter Status (1.ACTIVE 2.UNDER_CONSTRUCTION 3.INACTIVE): ");
                    int statusChoice1 = scanner.nextInt();
                    scanner.nextLine();

                    BuildingStatus status1;
                    if (statusChoice1 == 1) status1 = BuildingStatus.ACTIVE;
                    else if (statusChoice1 == 2) status1 = BuildingStatus.UNDER_CONSTRUCTION;
                    else status1 = BuildingStatus.INACTIVE;

                    buildings[count++] = new Building(name, address, floors, status1) {
                        @Override
                        public void showBuilding() {
                            System.out.println("================================");
                            System.out.println("Type: General Building");
                            System.out.println("Name: " + name);
                            System.out.println("Address: " + address);
                            System.out.println("Floors: " + numberOfFloors);
                            System.out.println("Status: " + status);
                            System.out.println("================================");
                        }
                    };
                    break;

                case 2:
                    System.out.print("Enter Hospital Name: ");
                    String hospitalName = scanner.nextLine();
                    System.out.print("Enter Hospital Address: ");
                    String hospitalAddress = scanner.nextLine();
                    System.out.print("Enter Number of Floors: ");
                    int hospitalFloors = scanner.nextInt();
                    System.out.print("Enter Number of Beds: ");
                    int beds = scanner.nextInt();
                    System.out.print("Enter Monthly Revenue: ");
                    double hospitalRevenue = scanner.nextDouble();

                    System.out.print("Enter Status (1.ACTIVE 2.UNDER_CONSTRUCTION 3.INACTIVE): ");
                    int statusChoice2 = scanner.nextInt();
                    scanner.nextLine();

                    BuildingStatus status2;
                    if (statusChoice2 == 1) status2 = BuildingStatus.ACTIVE;
                    else if (statusChoice2 == 2) status2 = BuildingStatus.UNDER_CONSTRUCTION;
                    else status2 = BuildingStatus.INACTIVE;

                    buildings[count++] = new Hospital(
                            hospitalName,
                            hospitalAddress,
                            hospitalFloors,
                            status2,
                            beds,
                            hospitalRevenue
                    );
                    break;

                case 3:
                    System.out.print("Enter Hotel Name: ");
                    String hotelName = scanner.nextLine();
                    System.out.print("Enter Hotel Address: ");
                    String hotelAddress = scanner.nextLine();
                    System.out.print("Enter Number of Floors: ");
                    int hotelFloors = scanner.nextInt();
                    System.out.print("Enter Number of Rooms: ");
                    int rooms = scanner.nextInt();
                    System.out.print("Enter Monthly Revenue: ");
                    double hotelRevenue = scanner.nextDouble();

                    System.out.print("Enter Status (1.ACTIVE 2.UNDER_CONSTRUCTION 3.INACTIVE): ");
                    int statusChoice3 = scanner.nextInt();
                    scanner.nextLine();

                    BuildingStatus status3;
                    if (statusChoice3 == 1) status3 = BuildingStatus.ACTIVE;
                    else if (statusChoice3 == 2) status3 = BuildingStatus.UNDER_CONSTRUCTION;
                    else status3 = BuildingStatus.INACTIVE;

                    buildings[count++] = new Hotel(
                            hotelName,
                            hotelAddress,
                            hotelFloors,
                            status3,
                            rooms,
                            hotelRevenue
                    );
                    break;

                case 4:
                    System.out.print("Enter Restoran Name: ");
                    String restoranName = scanner.nextLine();
                    System.out.print("Enter Restoran Address: ");
                    String restoranAddress = scanner.nextLine();
                    System.out.print("Enter Number of Floors: ");
                    int restoranFloors = scanner.nextInt();
                    System.out.print("Enter Number of Tables: ");
                    int tables = scanner.nextInt();
                    System.out.print("Enter Monthly Revenue: ");
                    double restoranRevenue = scanner.nextDouble();

                    System.out.print("Enter Status (1.ACTIVE 2.UNDER_CONSTRUCTION 3.INACTIVE): ");
                    int statusChoice4 = scanner.nextInt();
                    scanner.nextLine();

                    BuildingStatus status4;
                    if (statusChoice4 == 1) status4 = BuildingStatus.ACTIVE;
                    else if (statusChoice4 == 2) status4 = BuildingStatus.UNDER_CONSTRUCTION;
                    else status4 = BuildingStatus.INACTIVE;

                    buildings[count++] = new Restoran(
                            restoranName,
                            restoranAddress,
                            restoranFloors,
                            status4,
                            tables,
                            restoranRevenue
                    );
                    break;

                case 5:
                    if (count == 0) {
                        System.out.println("No buildings available!");
                    } else {
                        for (int i = 0; i < count; i++) {
                            buildings[i].showBuilding();
                        }
                    }
                    break;

                case 6:
                    System.out.println("Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again!");
            }

        } while (option != 6);

        scanner.close();
    }
}
