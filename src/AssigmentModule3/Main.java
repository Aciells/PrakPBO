package AssigmentModule3;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                Building building = null;
                Hospital hospital = null;
                Hotel hotel = null;
                Restoran restoran = null;

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

                             building = new Building(name, address, numberFloor);

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

                            hospital = new Hospital(HospitalName,HospitalAddress, HospitalNumberFloor ,numberOfBeds);
                            break;
                        case 3:
                            System.out.print("Enter name Hotel: ");
                            String HotelName = scanner.nextLine();
                            System.out.print("Enter Address Hotel: ");
                            String HotelAddress = scanner.nextLine();
                            System.out.print("Enter Floor Hotel: ");
                            int HotelNumberFloor = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter Rooms: ");
                            int numberOfRooms = scanner.nextInt();
                            scanner.nextLine();

                            hotel = new Hotel(HotelName, HotelAddress, HotelNumberFloor,numberOfRooms);
                            break;
                        case 4:
                            System.out.print("Enter name Restoran: ");
                            String RestoranName = scanner.nextLine();
                            System.out.print("Enter Address Restoran: ");
                            String RestoranAddress = scanner.nextLine();
                            System.out.print("Enter Floor Restoran: ");
                            int RestoranNumberFloor = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter Tables: ");
                            int RestoranNumberOfTables = scanner.nextInt();
                            scanner.nextLine();

                            restoran = new Restoran(RestoranName, RestoranAddress, RestoranNumberFloor, RestoranNumberOfTables);
                            break;
                        case 5:
                            if(building != null){
                                building.displayBuildInfo();
                            }
                            if(hospital != null){
                                hospital.displayBuildInfo();
                            }
                            if(hotel != null){
                                hotel.displayBuildInfo();
                            }
                            if(restoran != null){
                                restoran.displayBuildInfo();
                            }
                            break;
                        case 6:
                            System.out.println("Anda Exit!!");
                            return;
                        default:
                            System.out.println("pilihan tidak valid");
                    }
                }
    }
}
