package Garage;

public class Train extends Transport {

    private double trainPrice;
    private String timeTreval;
    private String stationName;
    private String finalStation;
    private int numberOfWagons;


    public Train(String brand, String model, int yearOfIssue, String manufacturersCountry, int maxSpeed, double trainPrice, String stationName, String finalStation, int numberOfWagons) {
        super(brand, model, yearOfIssue, manufacturersCountry, maxSpeed);

        this.trainPrice = trainPrice;
        this.stationName = stationName;
        this.finalStation = finalStation;
        this.numberOfWagons = numberOfWagons;
    }

    public void refillTrain() {
        System.out.println("Поезд заправляется дизелем");
    }

    public double getTrainPrice() {
        return trainPrice;
    }


    public String getStationName() {
        return stationName;
    }

    public String getFinalStation() {
        return finalStation;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setTrainPrice(double trainPrice) {
        this.trainPrice = trainPrice;
    }

    public void setTimeTreval(String timeTreval) {
        this.timeTreval = timeTreval;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public void setFinalStation(String finalStation) {
        this.finalStation = finalStation;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons != 0) {
            this.numberOfWagons = numberOfWagons;
        } else numberOfWagons = 1;
    }

    @Override
    public String toString() {
        return "Поезд " + brand + " " + yearOfIssue + " год выпуска в " + manufacturersCountry + " скорость передвижения - " +
                maxSpeed + " км/ч ," + " отходит от " + stationName + " вокзала и следует до станции " + finalStation + ". " + "Цена поездки "
                + trainPrice + " рублей, в поезде " + numberOfWagons + "вагонов ";
    }
}
