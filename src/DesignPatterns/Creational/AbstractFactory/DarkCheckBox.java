package DesignPatterns.Creational.AbstractFactory;

public class DarkCheckBox implements CheckBox {

    @Override
    public void render() {
        System.out.println("Rendering Dark CheckBox");
    }
    
}
