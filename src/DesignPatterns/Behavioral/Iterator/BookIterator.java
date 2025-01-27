package DesignPatterns.Behavioral.Iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class BookIterator implements Iterator<Book> {
	private List<Book> books;
    private int position = 0;

    public BookIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return position < books.size();
    }

    @Override
    public Book next() {
        if (hasNext()) {
            return books.get(position++);
        }
        throw new NoSuchElementException();
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You must call next() at least once before calling remove()");
        }
        books.remove(--position);
    }

}
