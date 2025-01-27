package DesignPatterns.Creational.Builder;

public interface  MealBuilder {
    void buildMainCourse();
    void buildSideDish();
    void buildDrink();
    Meal getMeal();
    
}
