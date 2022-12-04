package Garage;

public class Bus extends Transport {

    private int numberOfSeats;// сидячие места
    private int numberSeatPlace; // стоячие места


    public Bus(String brand, String model, int yearOfIssue, String manufacturersCountry, int maxSpeed, int numberOfSeats, int numberSeatPlace) {
        super(brand, model, yearOfIssue, manufacturersCountry, maxSpeed);
        this.numberOfSeats = numberOfSeats;
        this.numberSeatPlace = numberSeatPlace;
    }

    public void refillBus() {
        System.out.println("Можно заправлять бензином или дизелем");

    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getNumberSeatPlace() {
        return numberSeatPlace;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setNumberSeatPlace(int numberSeatPlace) {
        this.numberSeatPlace = numberSeatPlace;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "numberOfSeats=" + numberOfSeats +
                ", numberSeatPlace=" + numberSeatPlace +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", manufacturersCountry='" + manufacturersCountry + '\'' +
                '}';
    }
}
