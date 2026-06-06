public class Archer extends GameCharacter {
    private int arrows;

    public Archer(String name, int age, int arrows) throws InvalidAgeException {
        super(name, age);

        if (arrows <= 0) {
            throw new IllegalArgumentException("Arrows must be > 0!");
        }

        this.arrows = arrows;
    }

    @Override
    public void attack() {
        System.out.println(name + " shoots an arrow! 🏹 (Arrows: " + arrows + ")");
    }
}
