package DesignPatterns.Creational.Builder;

public class MealDirector {
    private MealBuilder mealBuilder;

    public MealDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal constructMeal() {
        mealBuilder.buildMainCourse();
        mealBuilder.buildSideDish();
        mealBuilder.buildDrink();
        return mealBuilder.getMeal();
    }
}