package DesignPatterns.Behavioral.State;

public class HasCoinState implements VendingMachineState {

	@Override
    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("Coin already inserted.");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine) {
        System.out.println("Product selected.");
        vendingMachine.setState(new SoldState());
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine) {
        System.out.println("Please select a product first.");
    }

}
