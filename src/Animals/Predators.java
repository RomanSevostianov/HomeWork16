package Animals;

import java.util.Objects;

public class Predators extends Mammals {

    private String typeOfFood;

    public Predators(String nameAnimals, int numberOfUYears, String habitat, int speedGo, String typeOfFood) {
        super(nameAnimals, numberOfUYears, habitat, speedGo);
        this.typeOfFood = typeOfFood;
    }

    public void hunt() {

    }

    public void eat() {
        System.out.println("Ест мясо");
    }

    public void go() {
        System.out.println("Перемещается бегом");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Predators)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(getTypeOfFood(), predators.getTypeOfFood());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTypeOfFood());
    }

    @Override
    public String toString() {
        return "Predators{" +
                "typeOfFood='" + typeOfFood + '\'' +
                ", habitat='" + habitat + '\'' +
                ", speedGo=" + speedGo +
                ", nameAnimals='" + nameAnimals + '\'' +
                ", numberOfUYears=" + numberOfUYears +
                '}';
    }
}
