package Assigment;
import java.util.Scanner;

public class Main {
    public void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter name Building: ");
            String name = scanner.nextLine();
            System.out.print("Enter Address: ");
            String address = scanner.nextLine();
            System.out.print("Enter Floor: ");
            int numberFloor = scanner.nextInt();
            scanner.nextLine();


            Building build1 = new Building(name, address, numberFloor);

        }
    }
}
