package DesignPatterns.Creational.AbstractFactory;

public class LightCheckBox implements CheckBox{

    @Override
    public void render() {
        System.out.println("Rendering Light Checkbox.");
    }
    
}
