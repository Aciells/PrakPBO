package AssigmentModule2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Building building = null;

        while (true) {

            System.out.println("----Welcome-----");
            System.out.println("1.Input Building");
            System.out.println("2.Show Building");
            System.out.println("3.Exit");
            System.out.print("Choose : ");
            int pilih = scanner.nextInt();
            scanner.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("\nEnter name Building: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter Floor: ");
                    int numberFloor = scanner.nextInt();
                    scanner.nextLine();

                    building = new Building(name, address, numberFloor);

                    System.out.println("Building added successfully!");
                    System.out.println("---------------------------\n");

                    break;
                case 2:
                   if (building != null){
                       building.displayBuildInfo();
                   } else {
                       System.out.println("=============");
                       System.out.println("Nothing Data!");
                       System.out.println("=============");
                   }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("pilihan tidak valid");
            }
        }
    }
}
