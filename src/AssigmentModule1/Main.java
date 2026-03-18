package AssigmentModule1;
import java.util.Scanner;

public class Main {
    public void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("1.Input Building");
            System.out.println("2.Tampilkan Building");
            System.out.println("3.Keluar");
            System.out.print("Pilih: ");
            int pilih = scanner.nextInt();
            scanner.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Enter name Building: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter Floor: ");
                    int numberFloor = scanner.nextInt();
                    scanner.nextLine();

                    Building build1 = new Building(name, address, numberFloor);

                    break;
                case 2:
                    System.out.println("===============");
                    System.out.println("-coming soon!!-");
                    System.out.println("===============");
                    break;
                case 3:
                    return;
                default:
                    System.out.println("pilihan tidak valid");
            }
        }
    }
}
