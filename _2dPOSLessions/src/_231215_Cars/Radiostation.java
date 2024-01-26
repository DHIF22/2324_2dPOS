package _231215_Cars;


/*
 Each RadiosStation contains a name and a frequency.
 */
public class Radiostation {
    private String name;
    private float frequency;

    public Radiostation(String name, float frequency){
        this.name = name;
        this.frequency = frequency;
    }

    public String getName(){
        return name;
    }

    public float getFrequency(){
        return frequency;
    }

    @Override
    public String toString(){
        return String.format("RadioStadion: %s (%.1f) ",name, frequency);
    }

    public static void main(String[] args) {
        Radiostation r = new Radiostation("FM4", 101.7f);
        System.out.println(r);
        System.out.println("Name " + r.getName());
        System.out.println("Freq " + r.getFrequency());
    }

}
