package _240305_CarRental;

import java.time.LocalDate;
import java.util.Date;

enum Color{
    RED,
    GREEN,
    BLUE,
    UNDEFINDED_DIRTY,
    SANDGESTRAHLT
}

public class Car implements Comparable<Car>{
    private String brand;
    private String model;
    private int milage;
    private LocalDate registrationDate;
    private Color color;
    private boolean rented = false;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        color = Color.SANDGESTRAHLT;
        registrationDate = LocalDate.now();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isRental() {
        return rented;
    }

    public void setRented(boolean b) {
        this.rented = b;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", milage=" + milage +
                ", registrationDate=" + registrationDate +
                ", color=" + color +
                ", isRented=" + rented +
                '}';
    }

    public int compareTo(Car other) {
        int retValue = this.getBrand().compareTo(other.getBrand());
        if(retValue == 0){
            retValue = this.getModel().compareTo(other.getModel());
        }
        return retValue;
    }
}
