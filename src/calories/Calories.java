package calories;

import vegetables.Vegetables;

/**
 * Created by Anastasiya on 05.02.2017.
 */
public class Calories {

    public static int countCalories(Vegetables[] vegetables) {
        int count = 0;
        for (Vegetables vegetable : vegetables) {
            if (vegetable != null) count += vegetable.getCalories();
        }
        return count;
    }
}
