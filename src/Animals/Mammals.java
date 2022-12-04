package Animals;

import java.util.Objects;

public class Mammals extends Animal{
    protected String habitat;
    protected int speedGo;

    public Mammals(String nameAnimals, int numberOfUYears, String habitat, int speedGo) {
        super(nameAnimals, numberOfUYears);
        this.habitat = habitat;
        this.speedGo = speedGo;
    }

    public void walk (){

    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getSpeedGo() {
        return speedGo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mammals)) return false;
        Mammals mammals = (Mammals) o;
        return getSpeedGo() == mammals.getSpeedGo() && getHabitat().equals(mammals.getHabitat());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHabitat(), getSpeedGo());
    }
    public void setSpeedGo(int speedGo) {
        this.speedGo = speedGo;
    }

}
