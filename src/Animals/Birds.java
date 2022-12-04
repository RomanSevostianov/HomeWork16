package Animals;

import java.util.Objects;

public class Birds extends Animal {
    protected String livingEnvironment;

    public Birds(String nameAnimals, int numberOfUYears, String livingEnvironment) {
        super(nameAnimals, numberOfUYears);
        this.livingEnvironment = livingEnvironment;
    }
    public void hunt (){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Birds)) return false;
        Birds birds = (Birds) o;
        return livingEnvironment.equals(birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livingEnvironment);
    }
}
