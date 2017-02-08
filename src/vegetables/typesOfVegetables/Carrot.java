package vegetables.typesOfVegetables;

import vegetables.Vegetables;

/**
 * Created by Anastasiya on 05.02.2017.
 */
public class Carrot extends Vegetables {
    private int weight;
    private int calories;
    private String colour;
    private int length;


    public Carrot(int weight, int calories, String colour, int length) {
        super(weight, calories, colour);

        this.weight = weight;
        this.calories = calories;
        this.colour = colour;
        this.length = length;
    }

    @Override
    public String toString() {
        return "- Carrot{" +
                "weight=" + weight +
                ", calories=" + calories +
                ", colour='" + colour + '\'' +
                ", length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Carrot carrot = (Carrot) o;

        if (weight != carrot.weight) return false;
        if (calories != carrot.calories) return false;
        if (length != carrot.length) return false;
        return colour != null ? colour.equals(carrot.colour) : carrot.colour == null;
    }

    @Override
    public int hashCode() {
        int result = weight;
        result = 31 * result + calories;
        result = 31 * result + (colour != null ? colour.hashCode() : 0);
        result = 31 * result + length;
        return result;
    }
}
