public class Mage extends GameCharacter {
    private int mana;

    public Mage(String name, int age, int mana) throws InvalidAgeException {
        super(name, age);

        if (mana <= 0) {
            throw new IllegalArgumentException("Mana must be > 0!");
        }

        this.mana = mana;
    }

    @Override
    public void attack() {
        System.out.println(name + " casts a fireball! 🔥 (Mana: " + mana + ")");
    }
}
