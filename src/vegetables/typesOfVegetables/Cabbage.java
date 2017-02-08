package vegetables.typesOfVegetables;

import vegetables.Vegetables;

/**
 * Created by Anastasiya on 05.02.2017.
 */
public class Cabbage extends Vegetables {
    private int weight;
    private int calories;
    private String colour;
    private String leaves;

    public Cabbage(int weight, int calories, String colour, String leaves) {
        super(weight, calories, colour);

        this.weight = weight;
        this.calories = calories;
        this.colour = colour;
        this.leaves = leaves;
    }

    @Override
    public String toString() {
        return "- Cabbage{" +
                "weight=" + weight +
                ", calories=" + calories +
                ", colour='" + colour + '\'' +
                ", leaves='" + leaves + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cabbage cabbage = (Cabbage) o;

        if (weight != cabbage.weight) return false;
        if (calories != cabbage.calories) return false;
        if (colour != null ? !colour.equals(cabbage.colour) : cabbage.colour != null) return false;
        return leaves != null ? leaves.equals(cabbage.leaves) : cabbage.leaves == null;
    }

    @Override
    public int hashCode() {
        int result = weight;
        result = 31 * result + calories;
        result = 31 * result + (colour != null ? colour.hashCode() : 0);
        result = 31 * result + (leaves != null ? leaves.hashCode() : 0);
        return result;
    }
}
