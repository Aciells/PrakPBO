import java.util.Scanner;

public class codelab {
    public static void main(String[] args) {
        Scanner choose = new Scanner(System.in);
        int pilihan;
        boolean running = true;

        System.out.println("Welcome to Smart City Management System");

        while (running) {
            System.out.println("1.Add New Building");
            System.out.println("2.View All Buildings");
            System.out.println("3.Exit");
            System.out.println("pilih : ");
            pilihan = choose.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Enter building Name: ");
                    System.out.println("Enter building Address: ");
                    System.out.println("Enter Number of Floors: ");
                    break;
                case 2:
                    System.out.println("aw");
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("salah");
            }

            System.out.println("pilihan :" + pilihan);
        }




    }
}