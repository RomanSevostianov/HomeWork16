package Garage;

import java.util.Objects;

public class Transport {

    protected String brand;
    protected String model;
    protected int yearOfIssue;
    protected String manufacturersCountry;
    String bodyColor;
    int maxSpeed;
    protected String refill;

    public Transport(String brand, String model, int yearOfIssue, String manufacturersCountry, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.manufacturersCountry = manufacturersCountry;

        this.maxSpeed = maxSpeed;

    }
 public void refueling(){


 }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getManufacturersCountry() {
        return manufacturersCountry;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }


    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty() && brand.isBlank()) {
            this.brand = brand;
        } else this.brand = "Бренд не указан";
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty() && model.isBlank()) {
            this.model = model;
        } else this.model = " Модель не указана";
    }

    public void setYearOfIssue(int yearOfIssue) {
        if (yearOfIssue != 0) {
            this.yearOfIssue = yearOfIssue;
        }

    }

    public void setManufacturersCountry(String manufacturersCountry) {
        if (manufacturersCountry != null && !manufacturersCountry.isEmpty() && manufacturersCountry.isBlank())
            this.manufacturersCountry = manufacturersCountry;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


}
