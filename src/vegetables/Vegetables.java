package vegetables;

/**
 * Created by Anastasiya on 05.02.2017.
 */
public class Vegetables {
    //is all vegetable in abstract sense has different names?
    private String name;
    private int weight;
    private int calories;
    private String colour;

    public Vegetables(String name, int weight, int calories, String colour) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getCalories() {
        return calories;
    }

    public String getColour() {
        return colour;
    }
}


