package _231222_extends;

public class Zoo {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Lula");
        Lion lion = new Lion("Simba");
        Dog dog = new Dog("Bello");
        Animal animal = new Animal("Herbert");
        animal.setName("Albert");

        Cat cat = new Cat("Schnitzel");
        Wolf wolf = new Wolf("Wolf");
        Cheetah cheetah = new Cheetah("Ernstl");
        Hippo hippo = new Hippo("Edwin");

        System.out.println(tiger);
        System.out.println(lion);
        System.out.println(dog);
        System.out.println(animal);

        System.out.println(cat);
        System.out.println(wolf);
        System.out.println(hippo);
        System.out.println(cheetah);
    }
}
