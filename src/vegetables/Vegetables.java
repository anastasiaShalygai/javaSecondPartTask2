package vegetables;

/**
 * Created by Anastasiya on 05.02.2017.
 */
public abstract class Vegetables {

        private int weight;
        private int calories;
        private String colour;

        public Vegetables(int weight, int calories, String colour) {
            this.weight = weight;
            this.calories = calories;
            this.colour = colour;
        }

        public int getWeight() {
            return weight;
        }

        public int getCalories() {
            return calories;
        }

        public void setCalories(int calories) {
            this.calories = calories;
        }

        public String getColour() {
            return colour;
        }

    }


