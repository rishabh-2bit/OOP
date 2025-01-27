package DesignPatterns.Creational.Builder;

public class VegMealBuilder implements MealBuilder {
    private Meal meal = new Meal();

    @Override
    public void buildMainCourse() {
        meal.setMainCourse("Veggie Burger");
    }

    @Override
    public void buildSideDish() {
        meal.setSideDish("Salad");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Orange Juice");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
