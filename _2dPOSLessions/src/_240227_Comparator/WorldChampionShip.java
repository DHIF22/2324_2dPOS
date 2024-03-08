package _240227_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorldChampionShip {
    private List<Player> team;

    public WorldChampionShip(){
        team = new ArrayList<>();
        prepareTeam();
    }

    private void prepareTeam(){
        team.add(new Player("Reiner", 65));
        team.add(new Player("Horst", 19));
        team.add(new Player("Edwin", 58));
        team.add(new Player("Kurt", 19));
        team.add(new Player("Edwin", 31));
    }

    public void sortByComparable(){
        team.sort(Player::compareTo);
    }

    public void sortByCollection(){
        Collections.sort(team); // same as team.sort(Player::compareTo);
    }

    public void sortByComparator(){
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(team, ageComparator);
    }

    public void printTeam(){
        System.out.println("++++++++++++++++++++++++");
        for(Player p : team){
            System.out.println(p);
        }
        System.out.println("++++++++++++++++++++++++");
    }

    public static void main(String[] args) {
        WorldChampionShip worldChampionShip = new WorldChampionShip();
        worldChampionShip.printTeam();
        worldChampionShip.sortByComparable(); // sort name
        worldChampionShip.printTeam();
        worldChampionShip.sortByComparator(); // sort by age
        worldChampionShip.printTeam();
    }
}
