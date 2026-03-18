package AssigmentModul1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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

                    System.out.println("\n=========================");
                    System.out.println("Building Name: " + name);
                    System.out.println("Building Address: " + address);
                    System.out.println("Number of floor: " + numberFloor );
                    System.out.println("=========================");
                    System.out.println("Building added succesfully!!\n");
                    break;
                case 2:
                    System.out.println("\n===============");
                    System.out.println("-coming soon!!-");
                    System.out.println("===============\n");
                    break;
                case 3:
                    return;
                default:
                    System.out.println("pilihan tidak valid");
            }
        }
    }
}
