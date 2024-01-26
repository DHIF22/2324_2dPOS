package _240126_abstract_zoo;

public class TheMain {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Cat cat = new Cat("Kitty");
        zoo.addAnimal(cat);

        Dog dog = new Dog("Wuff");
        zoo.addAnimal(dog);

        System.out.println(zoo);

        // Your turn: Calculate the veteran (Tierarzt) cost for the zoo.
    }
}
