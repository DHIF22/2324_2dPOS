package _240305_CarRental;

import _240305_CarRental.comparators.MileageComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarRentalCompany {

    private List<String> possibleBrands = new ArrayList<>();
    private List<String> possibleModels = new ArrayList<>();
    private List<Car> cars;

    public CarRentalCompany(){
        cars = new ArrayList<>();
        possibleBrands.add("Valvo");
        possibleBrands.add("BMV");
        possibleBrands.add("VWe");
        possibleBrands.add("Obel");
        possibleBrands.add("Mitzumischi");
        possibleBrands.add("Poch");
        possibleBrands.add("Alfredomeo");

        possibleModels.add("Ente");
        possibleModels.add("Kaefer");
        possibleModels.add("Elefant");
        possibleModels.add("Hund");
        possibleModels.add("Katze");
        possibleModels.add("Maultier");
        possibleModels.add("Faultier");
        possibleModels.add("Mondschaf");
        possibleModels.add("Ameise");
        possibleModels.add("Muecke");

        init();
    }

    public void init(){
        Random random = new Random();
        for(int i = 0; i < 100; i++){
            String brand = possibleBrands.get(random.nextInt(0, possibleBrands.size()));
            String model = possibleModels.get(random.nextInt(0, possibleModels.size()));

            Car car = new Car(brand, model);
            car.setMilage(random.nextInt(100, 200_000));
            cars.add(car);
        }
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public void removeCar(Car car){
        cars.remove(car);
    }

    public void sortByBrandAndModel(){
        cars.sort(Car::compareTo);
    }

    public void sortByMileage(){
        cars.sort(new MileageComparator());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("-----------------------\n");
        for(Car c : cars){
            sb.append(c + "\n");
        }
        sb.append("-----------------------\n");
        return sb.toString();
    }

    public static void main(String[] args) {
        CarRentalCompany carRentalCompany = new CarRentalCompany();
        System.out.println(carRentalCompany);

        carRentalCompany.sortByBrandAndModel();
        System.out.println(carRentalCompany);

        carRentalCompany.sortByMileage();
        System.out.println(carRentalCompany);

    }

}
