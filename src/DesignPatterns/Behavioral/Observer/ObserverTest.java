package DesignPatterns.Behavioral.Observer;

public class ObserverTest {

    public static void main(String[] args) {
        // Create the stock (subject)
        Stocks googleStock = new Stocks("Google", 1500.00);

        // Create observers (investors)
        Investors investor1 = new Investors("Alice");
        Investors investor2 = new Investors("Bob");

        // Register observers
        googleStock.registerObserver(investor1);
        googleStock.registerObserver(investor2);

        // Change the stock price
        googleStock.setPrice(1520.00);

        // Unregister one observer
        googleStock.unregisterObserver(investor1);

        // Change the stock price again
        googleStock.setPrice(1550.00);
    }
    
}
