package DesignPatterns.Behavioral.Observer;

public class Investors implements Observer{
    private String name;

    public Investors(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("Notification to Investor " + name + ": Stock " + stockName + " is now $" + price);
    }
    
}
