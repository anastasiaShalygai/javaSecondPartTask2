package cook;

import vegetables.Vegetables;

/**
 * Created by Anastasiya on 05.02.2017.
 */
public class Cook {
    public Vegetables[] salad;
    public int sizeOfTheArray;

    public Cook() {
        salad = new Vegetables[5];
        sizeOfTheArray = 0;
    }

    public Vegetables[] getSalad() {
        return salad;
    }

    public void addVegetables(Vegetables... vegetable) {
        for (Vegetables vegetables : vegetable) {
            salad[sizeOfTheArray++] = vegetables;
        }
    }

    public void delVegetable(Vegetables vegetable) {
        Boolean delElement = false;

        for (int i = 0; i < sizeOfTheArray; i++) {
            if (salad[i].equals(vegetable) || delElement) {
                salad[i] = salad[i + 1];

                delElement = true;
            }
        }
        sizeOfTheArray--;
    }

    public void sortCalories() {
        for (int i = sizeOfTheArray - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (salad[j].getCalories() > salad[j + 1].getCalories()) {
                    Vegetables tmp = salad[j];
                    salad[j] = salad[j + 1];
                    salad[j + 1] = tmp;
                }
            }
        }
        System.out.print("After sortCalories");
        printSalad(salad);
    }

    public void sortWeight() {
        for (int i = sizeOfTheArray - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (salad[j].getWeight() > salad[j + 1].getWeight()) {
                    Vegetables tmp = salad[j];
                    salad[j] = salad[j + 1];
                    salad[j + 1] = tmp;
                }
            }

        }
        System.out.print("After sortWeight");
        printSalad(salad);
    }

    public static void searchColorOrWeight(Vegetables[] salad, String color, int weight) {
        Vegetables[] searchArray = new Vegetables[salad.length];
        int i = 0;

        for (Vegetables vegetables : salad) {
            if ((vegetables != null) && (color == null) && (vegetables.getWeight() == weight))
                searchArray[i++] = vegetables;
            else if ((vegetables != null) && (weight == 0) && (vegetables.getColour().equals(color)))
                searchArray[i++] = vegetables;
            else if ((vegetables != null) && (vegetables.getWeight() == weight) && (vegetables.getColour().equals(color)))
                searchArray[i++] = vegetables;
        }
        printSalad(searchArray);
    }

    public static void printSalad(Vegetables[] salad) {
        System.out.println("Salad:");
        for (Vegetables vegetables : salad) {
            if (vegetables != null) System.out.println(vegetables.toString());
        }
    }
}
