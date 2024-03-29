package _240305_CarRental.comparators;

import _240305_CarRental.Car;

import java.util.Comparator;

public class MileageComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getMilage() - o2.getMilage();
    }
}
