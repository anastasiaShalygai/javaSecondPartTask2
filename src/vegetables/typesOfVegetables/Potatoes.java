package vegetables.typesOfVegetables;

import vegetables.Vegetables;

/**
 * Created by Anastasiya on 05.02.2017.
 */
public class Potatoes extends Vegetables {

    private int weight;
    private int calories;
    private String colour;
    private String species;

    public Potatoes(int weight, int calories, String colour, String species) {
        super(weight, calories, colour);

        this.weight = weight;
        this.calories = calories;
        this.colour = colour;
        this.species = species;
    }

    @Override
    public String toString() {
        return "- Potatoes{" +
                "weight=" + weight +
                ", calories=" + calories +
                ", colour='" + colour + '\'' +
                ", species='" + species + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Potatoes potatoes = (Potatoes) o;

        if (weight != potatoes.weight) return false;
        if (calories != potatoes.calories) return false;
        if (colour != null ? !colour.equals(potatoes.colour) : potatoes.colour != null) return false;
        return species != null ? species.equals(potatoes.species) : potatoes.species == null;
    }

    @Override
    public int hashCode() {
        int result = weight;
        result = 31 * result + calories;
        result = 31 * result + (colour != null ? colour.hashCode() : 0);
        result = 31 * result + (species != null ? species.hashCode() : 0);
        return result;
    }
}
