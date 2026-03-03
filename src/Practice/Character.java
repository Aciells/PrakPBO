package Practice;

public class Character {

    String name;
    int age;
    String heroClass;
    boolean gender;

    public  Character(String name, int age, String heroClass, boolean gender) {
        this.name = name;
        this.age = age;
        this.heroClass = heroClass;
        this.gender = gender;

        displayCharInfo();
    }

     public void displayCharInfo(){
         System.out.println("--- Character Information ---");
         System.out.println("Name: " + name );
         System.out.println("Age: " + age);
         System.out.println("class: " + heroClass);
         System.out.println("gender: " + gender);

     }

    String getName(){
        return this.name;
    }

    int getAge(){
        return this.age;
    }

    String getHeroClass(){
        return this.heroClass;
    }

}
