package DesignPatterns.Behavioral.State;

public class NoCoinState implements VendingMachineState {

	@Override
    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("Coin inserted.");
        vendingMachine.setState(new HasCoinState());
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine) {
        System.out.println("Please insert a coin first.");
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine) {
        System.out.println("Please insert a coin and select a product.");
    }
}
