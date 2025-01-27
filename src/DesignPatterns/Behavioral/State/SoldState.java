package DesignPatterns.Behavioral.State;

public class SoldState implements VendingMachineState {

	@Override
    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("Please wait, product is being dispensed.");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine) {
        System.out.println("Please wait, product is being dispensed.");
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine) {
        System.out.println("Product dispensed.");
        vendingMachine.setState(new NoCoinState());
    }

}
