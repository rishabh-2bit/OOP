package DesignPatterns.Behavioral.State;

public class StateDesignPatternDemo {

	public static void main(String[] args) {
		VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.insertCoin();  // Coin inserted.
        vendingMachine.selectProduct();  // Product selected.
        vendingMachine.dispenseProduct();  // Product dispensed.

        vendingMachine.insertCoin();  // Coin inserted.
        vendingMachine.insertCoin();  // Coin already inserted.
        vendingMachine.dispenseProduct();  // Please select a product first.

	}

}
