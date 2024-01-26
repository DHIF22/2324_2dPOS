package _231215_Cars;

public class Radio {
    // possible 12 radiostations
    private final int RADIO_MEMORY = 12;
    private Radiostation[] stations = new Radiostation[RADIO_MEMORY];

    // Power on/ off
    private boolean on; // default is false

    // change the radiostation
    private int currentRadiostationIndex = 0; // no radiostation available

    public Radio(){
        initRadioStations();
    }

    private void initRadioStations(){
        // fill the radio with dummy radiostations
        for(int i = 0; i < RADIO_MEMORY; i++){
            String name = String.format("OE%d", i);

            stations[i] = new Radiostation(name, 100.0f + i );
        }
    }

    public void setOn(boolean b){
        on = b;
    }

    public boolean isOn(){
        return this.on;
    }

    public void setCurrentRadiostationIndex(int index){
        if(index > 0 && index < RADIO_MEMORY) {
            this.currentRadiostationIndex = index;
        } else {
            this.currentRadiostationIndex = 5; // easter egg :-)
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(stations[currentRadiostationIndex]);

        sb.append("Radio is ");
        if(on){
            sb.append(" on\n");
            sb.append(stations[currentRadiostationIndex]);
        } else {
            sb.append(" off");
        }
        sb.append("\n");

        for(int i = 0; i < RADIO_MEMORY; i++){
            sb.append(stations[i].getName() + " " + stations[i].getFrequency());
            sb.append("\n");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Radio r = new Radio();
        System.out.println(r);
        r.setOn(true);
        System.out.println(r);

        for(int i = 0; i < 1000; i++){
            r.setCurrentRadiostationIndex(i);
            System.out.println(r);
        }

    }
}
