package _240126_abstract_zoo;

public class Zoo {
    private Animal[] animals;

    public Zoo(){
        animals = new Animal[0]; // empty array
    }

    public void addAnimal(Animal animal){
        Animal[] temp = new Animal[animals.length + 1];
        for(int i = 0; i < animals.length; ++i){
            temp[i] = animals[i];
            temp[i].calcVeteranCosts();
        }
        animals = temp;
        animal.calcVeteranCosts();
        animals[animals.length - 1] = animal;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("---------- ZOO ----------\n");
        for(int i = 0; i < animals.length; ++i){
            sb.append(i + " " + animals[i] + "\n");
        }
        sb.append("-------------------------\n");

        return sb.toString();
    }
}
