package DesignPatterns.Creational.AbstractFactory;

public class Application {

    private Button button;
    private CheckBox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckBox();
    }

    public void renderUI() {
        button.render();
        checkbox.render();
    }
    
}
