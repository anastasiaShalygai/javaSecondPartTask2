package vegetables.typesOfVegetables;

import vegetables.Vegetables;

/**
 * Created by Anastasiya on 05.02.2017.
 */
public class Carrot extends Vegetables {
    private int length;

    public Carrot(String name, int weight, int calories, String colour, int length) {
        super(name, weight, calories, colour);

        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
