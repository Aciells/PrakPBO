import java.util.Scanner;

public class codelab {
    public static void main(String[] args) {
        Scanner choose = new Scanner(System.in);
        int pilihan;

        System.out.println("Welcome to Smart City Management System");
        System.out.println("1");
        System.out.println("2");
        System.out.println("pilih : ");
        pilihan = choose.nextInt();

        switch (pilihan){
            case 1:
                System.out.println("gg");
                break;
            case 2:
                System.out.println("aw");
                break;
            default:
                System.out.println("salah");
        }

        System.out.println("pilihan :" + pilihan);



    }
}