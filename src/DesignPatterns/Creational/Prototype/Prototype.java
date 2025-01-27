package DesignPatterns.Creational.Prototype;

//The interface includes the clone() method for creating a copy of the object.
public interface Prototype extends Cloneable{
    Prototype clone();
    
}
