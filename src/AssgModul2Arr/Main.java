package AssgModul2Arr;
import java.util.ArrayList;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            ArrayList<Building> buildings = new ArrayList<>();

            while (true) {
                System.out.println("1. Input Building");
                System.out.println("2. Tampilkan Building");
                System.out.println("3. Keluar");
                System.out.print("Pilih : ");
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

                        buildings.add(new Building(name, address, numberFloor));

                        System.out.println("Building added successfully!");
                        System.out.println("---------------------------");
                        break;

                    case 2:
                        if (buildings.isEmpty()) {
                            System.out.println("Belum ada data building!");
                        } else {
                            for (int i = 0; i < buildings.size(); i++) {
                                System.out.println("Data ke-" + (i + 1));
                                buildings.get(i).displayBuildInfo();
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Program selesai.");
                        return;

                    default:
                        System.out.println("Pilihan tidak valid!");
                }
            }
        }
    }
