package DesignPatterns.Behavioral.Iterator;

public interface Iterator<T> {
    boolean hasNext();
    T next();
    void remove(); // Optional
}