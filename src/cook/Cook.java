package cook;

import vegetables.Vegetables;
import vegetables.typesOfVegetables.Cabbage;
import vegetables.typesOfVegetables.Carrot;
import vegetables.typesOfVegetables.Potatoes;

/**
 * Created by Anastasiya on 05.02.2017.
 */
public class Cook {
    // array initialization better to move to constructor
    static public Vegetables[] salad = new Vegetables[4];
    static public int sizeOfTheArray = 0;

    public Cook() {
    }

    // all of this methods must not have static modifier, due to all this possibilities must have every class instance.
    public static boolean checkForVegetables(String className) {
        if (salad[0] == null) return true;
        for (int i = 0; i < sizeOfTheArray; i++)
            if (salad[i].getClass().getName().equals(className)) return false;

        return true;
    }

    //Is this not better to use one universal method? You have hierarchy of vegetables. For what do you duplicate you code for three times?
    public static void addVegetables(Cabbage cabbage) {
        salad[sizeOfTheArray++] = cabbage;
    }

    public static void addVegetables(Carrot carrot) {
        salad[sizeOfTheArray++] = carrot;
    }

    public static void addVegetables(Potatoes potatoes) {
        salad[sizeOfTheArray++] = potatoes;
    }

    //it is better to use full english words in methods names
    public static void delVegetables(String name) {
        Boolean delElement = false;

        for (int i = 0; i < sizeOfTheArray; i++) {
            if (salad[i].getName().equals(name) || delElement) {
                salad[i] = salad[i + 1];

                delElement = true;
            }
        }
        sizeOfTheArray--;
    }

    public static void printSalad() {
        System.out.println("Список овощей: ");
        for (int i = 0; i < sizeOfTheArray; i++) {
            System.out.print("\n" + i + ") " + salad[i].getName() + " (вес: " + salad[i].getWeight() + ", калории: " + salad[i].getCalories() + ", цвет: " + salad[i].getColour());

            //switch (salad[i].getName()) можно ли вывести индивидуальные параметры каждого класса?
        }
    }
}
