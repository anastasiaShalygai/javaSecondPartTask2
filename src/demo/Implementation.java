package demo;

import calories.Calories;
import cook.Cook;
import vegetables.typesOfVegetables.Cabbage;
import vegetables.typesOfVegetables.Carrot;
import vegetables.typesOfVegetables.Potatoes;

import java.util.Scanner;

/**
 * Created by Anastasiya on 05.02.2017.
 */
class Implementation {
    private final static int ACTION_LIMIT = 5;
    private final static int VEGETABLES_LIMIT = 3;

    static void selectOperation() {
        printListOfActions();
        switch (inputData(ACTION_LIMIT)) {
            case 1: {
                printListOfVegetable();
                selectVegetableForAdd();
                selectOperation();
            }
            break;
            case 2: {
                printListOfVegetable();
                selectVegetableForDel();
                selectOperation();
                break;
            }
            case 3: {
                Cook.printSalad();
                selectOperation();
                break;
            }
            case 4: {
                System.out.println("Кол-во калорий в салате:" + Calories.countCalories());
                selectOperation();
                break;
            }
            case 5:
                System.exit(0);
        }
    }

    private static void printListOfActions() {
        System.out.println("-----------------------------------------");
        System.out.println("Выберите действие: ");
        System.out.println("        1) Добавить овощи ");
        System.out.println("        2) Убрать овощи ");
        System.out.println("        3) Вывести список овощей ");
        System.out.println("        4) Посчитать калорийность салата ");
        System.out.println("        5) Выход ");
    }

    //For both adding and deleting operations you use this method, it could confuse when you want to delete vegetable,
    // but steel console prints
    // Введите номер овоща для добавления
    private static void printListOfVegetable() {
        System.out.println("Введите номер овоща для добавления: ");
        System.out.println("        1) Капуста ");
        System.out.println("        2) Картофель ");
        System.out.println("        3) Морковь ");
    }

    private static void selectVegetableForAdd() {

        switch (inputData(VEGETABLES_LIMIT)) {
            case 1: {
                if (!Cook.checkForVegetables("vegetables.typesOfVegetables.Cabbage")) {
                    System.out.println("Данный овощ уже присутствует в салате! Для просмотра добавленных овощей, выберите пункт 3");
                    return;
                }
                //Steel we have here hardcoded values for each vegetable, so, for what do we need here a user input operation?
                Cabbage cabbage = new Cabbage("Капуста", 10, 200, "красная", "зелёные");
                Cook.addVegetables(cabbage);
                break;
            }
            case 2: {
                if (!Cook.checkForVegetables("vegetables.typesOfVegetables.Potatoes")) {
                    System.out.println("Данный овощ уже присутствует в салате! Для просмотра добавленных овощей, выберите пункт 3");
                    return;
                }
                Potatoes potatoes = new Potatoes("Картофель", 10, 200, "красный", "сваренный");
                Cook.addVegetables(potatoes);
                break;
            }
            case 3: {
                if (!Cook.checkForVegetables("vegetables.typesOfVegetables.Carrot")) {
                    System.out.println("Данный овощ уже присутствует в салате! Для просмотра добавленных овощей, выберите пункт 3");
                    return;
                }
                Carrot carrot = new Carrot("Морковь", 10, 200, "красная", 15);
                Cook.addVegetables(carrot);
                break;
            }
        }
    }

    private static void selectVegetableForDel() {

        switch (inputData(VEGETABLES_LIMIT)) {
            case 1: {
                //for what do you use reflection mechanism?
                if (Cook.checkForVegetables("vegetables.typesOfVegetables.Cabbage")) {
                    System.out.println("Данного овоща нет в салате! Для просмотра добавленных овощей, выберите пункт 3");
                    selectOperation();
                    return;
                }
                Cook.delVegetables("Капуста");
                break;
            }
            case 2: {
                if (Cook.checkForVegetables("vegetables.typesOfVegetables.Potatoes")) {
                    System.out.println("Данного овоща нет в салате! Для просмотра добавленных овощей, выберите пункт 3");
                    selectOperation();
                    return;
                }
                Cook.delVegetables("Картофель");
                break;
            }
            case 3: {
                if (Cook.checkForVegetables("vegetables.typesOfVegetables.Carrot")) {
                    System.out.println("Данного овоща нет в салате! Для просмотра добавленных овощей, выберите пункт 3");
                    selectOperation();
                    return;
                }
                Cook.delVegetables("Морковь");
                break;
            }
        }
    }

    //for actual, there was no conditions of user input data.
    private static int inputData(int limit) {
        Scanner scanner = new Scanner(System.in);
        int operationNumber;

        try {
            if (scanner.hasNextInt()) {
                operationNumber = scanner.nextInt();

                if ((operationNumber > limit) || (operationNumber < 0)) {
                    System.out.println("Выберите существующее действие: ");
                    return inputData(limit);
                } else return operationNumber;
            } else {
                System.out.println("Формат данных должен быть Int. Попробуйте ещё раз: ");
                return inputData(limit);
            }
        }
        finally {
            //scanner.close();
        }
    }
}
