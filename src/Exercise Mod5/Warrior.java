public class Warrior extends GameCharacter {

    public Warrior(String name, int age) throws InvalidAgeException {
        super(name, age);
    }

    @Override
    public void attack() {
        System.out.println(name + " slashes with sword!");
    }
}