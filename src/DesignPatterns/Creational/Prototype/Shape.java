package DesignPatterns.Creational.Prototype;

public class Shape implements Prototype {

    private String type;
    private String color;

    public Shape(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // @Override
    // public Prototype clone() {
    //     try {
    //         return (Prototype) super.clone(); // Perform shallow copy
    //     } catch (CloneNotSupportedException e) {
    //         throw new RuntimeException("Clone not supported", e);
    //     }
    // }

    @Override
    public Prototype clone() {
        try {
            return (Shape) super.clone(); // Perform Deep copy
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported", e);
        }
    }

    @Override
    public String toString() {
        return "Shape{" + "type='" + type + '\'' + ", color='" + color + '\'' + '}';
    }
    
}
