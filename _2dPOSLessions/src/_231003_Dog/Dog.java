package _231003_Dog;

public class Dog {
    // Your turn:
    // Each Dog has a name, a date of birth, a weight and the status of
    // dead or alive.
    // Each dog is born with a name ...
    // Write a class and test the class :-)
    private String name;
    private String dateOfBirth;
    private float weight;
    private boolean isAlive;

    public Dog(String name){
        this.name = name; // this: its me
    }

    // setter method
    public void setDateOfBirth(String dateOfBirth){
        // Your turn: The setter method will be successful, when
        // * the given String has a length of 10
        // ** and if contains 2 dots
        // ** the year starts with 2

        if(dateOfBirth.length() != 10){
            System.out.println("Error: Failed");
        } else {
            String[] tokens = dateOfBirth.split("-"); // split an string into strings, delimited by .
            if(tokens.length == 3) { // check if three token in tokens-array
                //String year = tokens[2];
                if(tokens[2].startsWith("2")) {
                    this.dateOfBirth = dateOfBirth;
                }
            }
        }
    }

    // getter method
    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public String toString(){
        return name + ": Birthday is" + dateOfBirth;
    }
}
