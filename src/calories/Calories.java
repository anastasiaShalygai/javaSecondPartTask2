package calories;

import cook.Cook;

/**
 * Created by Anastasiya on 05.02.2017.
 */
public class Calories {

    public static int countCalories() {
        int count = 0;
        for (int i = 0; i < Cook.sizeOfTheArray; i++) {
            count += Cook.salad[i].getCalories();
        }
        return count;
    }
}
