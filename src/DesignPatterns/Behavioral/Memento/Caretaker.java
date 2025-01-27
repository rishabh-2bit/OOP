package DesignPatterns.Behavioral.Memento;

import java.util.Stack;

public class Caretaker {
	private Stack<Memento> history = new Stack<>();

    public void save(Memento memento) {
        history.push(memento);
    }

    public Memento undo() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }

}
