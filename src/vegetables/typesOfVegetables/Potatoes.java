package vegetables.typesOfVegetables;

import vegetables.Vegetables;

/**
 * Created by Anastasiya on 05.02.2017.
 */
public class Potatoes extends Vegetables {
    private String species;

    public Potatoes(String name, int weight, int calories, String colour, String species) {
        super(name, weight, calories, colour);
    }

    public String getSpecies() {
        return species;
    }
}
