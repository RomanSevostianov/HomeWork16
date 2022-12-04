package Animals;

import java.util.Objects;

public class Herbivores extends Mammals { // травоядные
    private String typeOfFood;

    public Herbivores(String nameAnimals, int numberOfUYears, String habitat, int speedGo, String typeOfFood) {
        super(nameAnimals, numberOfUYears, habitat, speedGo);
        this.typeOfFood = typeOfFood;
    }

    public void eat() { // пастись
        System.out.println("Ест траву");
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
        if (!(o instanceof Herbivores)) return false;
        Herbivores that = (Herbivores) o;
        return getTypeOfFood().equals(that.getTypeOfFood());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTypeOfFood());
    }

    @Override
    public String toString() {
        return "Herbivores{" +
                "typeOfFood='" + typeOfFood + '\'' +
                ", habitat='" + habitat + '\'' +
                ", speedGo=" + speedGo +
                ", nameAnimals='" + nameAnimals + '\'' +
                ", numberOfUYears=" + numberOfUYears +
                '}';
    }
}
