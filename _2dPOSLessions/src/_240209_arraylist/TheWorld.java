package _240209_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TheWorld {
    private static final String[] lastNames = {
            "Mueller",
            "Maier",
            "Huber",
            "Braunstein",
            "Mickel",
            "Einstein",
            "Bohr",
            "Schwarzenegger",
            "Oppenheimer",
            "Gates",
            "Brin",
            "Page",
            "Doe",
            "Roberts"
    };

    private static final String[] firstNames = {
            "Marcel",
            "Heinz",
            "Gerhard",
            "Gernot",
            "Maria",
            "Ursula",
            "Reinhard",
            "Elisabeth",
            "Elvis",
            "Richard",
    };

    private List<Person> persons; // ATTENTION!

    public TheWorld() {
        Random random = new Random();
        persons = new ArrayList<>(); // now we have a empty list
        for(int i = 0; i < 1000; ++i){
            int indexLastName = random.nextInt(lastNames.length);
            int indexFirstName = random.nextInt(firstNames.length);
            int year = random.nextInt(1986, 2010);

            // IMPORTANT!
            Person p = new Person(firstNames[indexFirstName], lastNames[indexLastName], year);
            persons.add(p);
        }
    }

    public void printPersons(){
        /* same as the extended for-loop
        for(int i = 0; i < persons.size(); ++i){
            Person element = persons.get(i);
            System.out.println(element);
        }
        */
        for(Person element : persons){
            System.out.println(element);
        }
    }
}
