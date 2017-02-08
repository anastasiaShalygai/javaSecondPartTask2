package demo;

import calories.Calories;
import cook.Cook;
import vegetables.typesOfVegetables.Cabbage;
import vegetables.typesOfVegetables.Carrot;
import vegetables.typesOfVegetables.Potatoes;


/**
 * Created by Anastasiya on 05.02.2017.
 */
class Implementation {

    static void selectOperation() {
        Cabbage cabbage1 = new Cabbage(200, 100, "red", "green");
        Carrot carrot1 = new Carrot(100, 20, "green", 10);
        Potatoes potatoes1 = new Potatoes(300, 50, "black", "q");

        Cook cook1 = new Cook();


        cook1.addVegetables(cabbage1, carrot1, potatoes1);
        Cook.printSalad(cook1.getSalad());
        cook1.sortCalories();
        cook1.sortWeight();
        Cook.searchColorOrWeight(cook1.getSalad(), null, 200);

        Calories.countCalories(cook1.getSalad());
        cook1.delVegetable(carrot1);
        Cook.printSalad(cook1.getSalad());
    }

}
