package Garage;

public class Car extends Transport {

    private String bodyType;
    private String typeOfDrive;

    public Car(String brand, String model, int yearOfIssue, String manufacturersCountry, int maxSpeed, String bodyType, String typeOfDrive) {
        super(brand, model, yearOfIssue, manufacturersCountry, maxSpeed);
        this.bodyType = bodyType;
        this.typeOfDrive = typeOfDrive;
    }


        public void refillCar() {
            System.out.println("Автомобиль можно заправлять бензином, дизелем или заряжжать электричеством");
        }

    }
