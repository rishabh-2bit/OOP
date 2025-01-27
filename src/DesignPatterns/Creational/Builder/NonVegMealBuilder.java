package DesignPatterns.Creational.Builder;

public class NonVegMealBuilder implements MealBuilder {
    private Meal meal = new Meal();

    @Override
    public void buildMainCourse() {
        meal.setMainCourse("Chicken Burger");
    }

    @Override
    public void buildSideDish() {
        meal.setSideDish("Fries");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Cola");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
