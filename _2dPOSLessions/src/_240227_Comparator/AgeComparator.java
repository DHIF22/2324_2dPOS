package _240227_Comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        return o1.getAge() - o2.getAge();
    }
}
