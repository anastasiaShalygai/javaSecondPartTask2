package vegetables.typesOfVegetables;

import vegetables.Vegetables;

/**
 * Created by Anastasiya on 05.02.2017.
 */
public class Cabbage extends Vegetables {
    private String leaves;

    public Cabbage(String name, int weight, int calories, String colour, String leaves) {
        super(name, weight, calories, colour);

        this.leaves = leaves;
    }

    public String getLeaves() {
        return leaves;
    }
}
