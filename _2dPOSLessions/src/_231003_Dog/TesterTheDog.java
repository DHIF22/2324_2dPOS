package _231003_Dog;

public class TesterTheDog {
    public static void main(String[] args) {
        System.out.println("before ctor");
        Dog dog = new Dog("Hansi");
        System.out.println("after ctor");
        dog.setDateOfBirth("12-12-1982");
        System.out.println("Birthday of dog: " + dog.getDateOfBirth());
        System.out.println(dog); // call toString() from Object
    }
}
