import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<GameCharacter> characters = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            showMenu();
            int choice = getIntInput("Choose menu: ");

            try {
                switch (choice) {
                    case 1:
                        addCharacter();
                        break;
                    case 2:
                        showCharacters();
                        break;
                    case 3:
                        attackAll();
                        break;
                    case 0:
                        System.out.println("Exit program.");
                        return;
                    default:
                        throw new IllegalArgumentException("Menu tidak tersedia!");
                }
            } catch (Exception e) {
                System.out.println("[ERROR] " + e.getMessage());
            }
        }
    }

    private static void showMenu() {
        System.out.println("\n===== GAME MENU =====");
        System.out.println("1. Add Character");
        System.out.println("2. Show Characters");
        System.out.println("3. Attack All");
        System.out.println("0. Exit");
    }

    private static void addCharacter() {
        try {
            System.out.println("\n=== ADD CHARACTER ===");

            System.out.print("Name: ");
            String name = sc.nextLine();

            int age = getIntInput("Age: ");

            System.out.println("Choose Class:");
            System.out.println("1. Warrior");
            System.out.println("2. Mage");
            System.out.println("3. Archer");
            System.out.println("4. Healer");

            int type = getIntInput("Choice: ");

            GameCharacter character = null;

            switch (type) {
                case 1:
                    character = new Warrior(name, age);
                    break;

                case 2:
                    int mana = getIntInput("Mana: ");
                    character = new Mage(name, age, mana);
                    break;

                case 3:
                    int arrows = getIntInput("Arrows: ");
                    character = new Archer(name, age, arrows);
                    break;

                case 4:
                    int heal = getIntInput("Healing Power: ");
                    character = new Healer(name, age, heal);
                    break;

                default:
                    throw new IllegalArgumentException("Class tidak valid!");
            }

            characters.add(character);
            System.out.println(">> Character berhasil ditambahkan!");

        } catch (InvalidAgeException e) {
            System.out.println("[AGE ERROR] " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("[VALIDATION] " + e.getMessage());
        }
    }

    private static void showCharacters() {
        System.out.println("\n=== CHARACTER LIST ===");

        if (characters.isEmpty()) {
            System.out.println("Tidak ada character.");
            return;
        }

        int i = 1;
        for (GameCharacter c : characters) {
            System.out.println(i + ". " + c.getName());
            i++;
        }
    }

    private static void attackAll() {
        System.out.println("\n=== ATTACK ALL ===");

        if (characters.isEmpty()) {
            System.out.println("Tidak ada character.");
            return;
        }

        for (GameCharacter c : characters) {
            c.attack(); // polymorphism terjadi di sini 🔥
        }
    }

    private static int getIntInput(String message) {
        while (true) {
            try {
                System.out.print(message);
                int input = sc.nextInt();
                sc.nextLine(); // clear buffer
                return input;
            } catch (InputMismatchException e) {
                System.out.println("[INPUT ERROR] Harus angka!");
                sc.nextLine();
            }
        }
    }
}