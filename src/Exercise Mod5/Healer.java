public class Healer extends GameCharacter {
    private int healingPower;

    public Healer(String name, int age, int healingPower) throws InvalidAgeException {
        super(name, age);

        if (healingPower <= 0) {
            throw new IllegalArgumentException("Healing power must be > 0!");
        }

        this.healingPower = healingPower;
    }

    @Override
    public void attack() {
        System.out.println(name + " heals allies ✨ (Power: " + healingPower + ")");
    }
}
