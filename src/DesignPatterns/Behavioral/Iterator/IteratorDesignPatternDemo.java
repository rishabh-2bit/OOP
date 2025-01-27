package DesignPatterns.Behavioral.Iterator;

public class IteratorDesignPatternDemo {

	public static void main(String[] args) {
		
		BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("Design Patterns"));
        bookCollection.addBook(new Book("Clean Code"));
        bookCollection.addBook(new Book("Refactoring"));

        Iterator<Book> iterator = bookCollection.createIterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getTitle());
        }

        // Example of using remove
        iterator = bookCollection.createIterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equals("Clean Code")) {
                iterator.remove();
            }
        }

        System.out.println("\nAfter removal:");
        iterator = bookCollection.createIterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getTitle());
        }
	}

}
