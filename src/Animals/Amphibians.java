package Animals;

import java.util.Objects;

public class Amphibians extends Animal {
    public String livingEnvironmentl;

    public Amphibians(String nameAnimals, int numberOfUYears, String livingEnvironmentl) {
        super(nameAnimals, numberOfUYears);
        this.livingEnvironmentl = livingEnvironmentl;
    }

    public void hunt() {
        System.out.println("Кушает мух");
    }

    public String getLivingEnvironmentl() {
        return livingEnvironmentl;
    }

    public void setLivingEnvironmentl(String livingEnvironmentl) {
        this.livingEnvironmentl = livingEnvironmentl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amphibians)) return false;
        Amphibians that = (Amphibians) o;
        return getLivingEnvironmentl().equals(that.getLivingEnvironmentl());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLivingEnvironmentl());
    }

    @Override
    public String toString() {
        return "Amphibians{" +
                "livingEnvironmentl='" + livingEnvironmentl + '\'' +
                ", nameAnimals='" + nameAnimals + '\'' +
                ", numberOfUYears=" + numberOfUYears +
                '}';
    }
}
