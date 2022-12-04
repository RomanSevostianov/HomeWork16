package Animals;

import java.util.Objects;

public class FlightlessBird extends Birds {
    public String movementType;

    public FlightlessBird(String nameAnimals, int numberOfUYears, String livingEnvironment, String movementType) {
        super(nameAnimals, numberOfUYears, livingEnvironment);
        this.movementType = movementType;
    }

    public void go() {
        System.out.println("Ходит по земле");
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlightlessBird)) return false;
        FlightlessBird that = (FlightlessBird) o;
        return getMovementType().equals(that.getMovementType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMovementType());
    }

    @Override
    public String toString() {
        return "FlightlessBird{" +
                "movementType='" + movementType + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", nameAnimals='" + nameAnimals + '\'' +
                ", numberOfUYears=" + numberOfUYears +
                '}';
    }
}
