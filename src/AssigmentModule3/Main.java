package AssigmentModule3;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                /*Hospital hospital = new Hospital("rs", "maburai",1,4);
                Hotel hotel = new Hotel("aston", "tanjung", 4, 2); */

                while (true) {

                    System.out.println("==== Building ====");
                    System.out.println("1.Add Building");
                    System.out.println("2.Add Hospital");
                    System.out.println("3.Add Hotel");
                    System.out.println("4.Add Restoran");
                    System.out.println("5.Tampilkan Building");
                    System.out.println("6.Keluar");
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

                            Building build1 = new Building(name, address, numberFloor);

                            break;
                        case 2:
                            System.out.print("Enter name Hospital: ");
                            String HospitalName = scanner.nextLine();
                            System.out.print("Enter Address Hospital: ");
                            String HospitalAddress = scanner.nextLine();
                            System.out.print("Enter Floor Hospital: ");
                            int HospitalNumberFloor = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter Beds: ");
                            int numberOfBeds = scanner.nextInt();
                            scanner.nextLine();

                            Hospital hospital = new Hospital(HospitalName,HospitalAddress, HospitalNumberFloor ,numberOfBeds);
                            break;
                        case 3:
                            break;
                        case 4:
                            System.out.println("===============");
                            System.out.println("-coming soon!!-");
                            System.out.println("===============");
                            break;
                        case 5:
                            break;
                        case 6:
                            System.out.println("Anda keluar!!");
                            return;
                        default:
                            System.out.println("pilihan tidak valid");
                    }
                }
    }
}
