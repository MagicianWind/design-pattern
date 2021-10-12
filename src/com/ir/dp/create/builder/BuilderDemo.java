package com.ir.dp.create.builder;

import com.ir.dp.create.builder.core.Meal;
import com.ir.dp.create.builder.core.MealBuilder;

/**
 * @author i-rain
 */
public class BuilderDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal meal = mealBuilder.prepareVegMeal();
        meal.showItems();
        System.out.println("cost: " + meal.getCost());

        System.out.println("\n\n");
        Meal meal1 = mealBuilder.prepareNonVegMeal();
        meal1.showItems();
        System.out.println("cost: " + meal1.getCost());
    }
}
