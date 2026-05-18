public abstract class GameCharacter {
    protected String name;
    protected int age;

    public GameCharacter(String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Character must be 18+!");
        }
        this.name = name;
        this.age = age;
    }

    public abstract void attack();

    public String getName() {
        return name;
    }
}
