package Animals;

public class Animal {

    protected String nameAnimals;
    protected int numberOfUYears;

    public Animal(String nameAnimals, int numberOfUYears) {
        this.nameAnimals = nameAnimals;
        this.numberOfUYears = numberOfUYears;
    }

    public void eat() {

    }

    public void go() {
        System.out.println("Ходит пешком");
    }

    public void sleep() {

    }

    public String getNameAnimals() {
        return nameAnimals;
    }

    public int getNumberOfUYears() {
        return numberOfUYears;
    }

    public void setNameAnimals(String nameAnimals) {
        if (nameAnimals != null && !nameAnimals.isEmpty() && nameAnimals.isBlank()) {
            this.nameAnimals = nameAnimals;
        }
    }

    public void setNumberOfUYears(int numberOfUYears) {
        if (numberOfUYears != 0 && nameAnimals.isBlank()) {
            this.numberOfUYears = numberOfUYears;
        }
    }

}
