package DesignPatterns.Behavioral.State;

public class SoldOutState implements VendingMachineState {

	@Override
    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("Machine is sold out.");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine) {
        System.out.println("Machine is sold out.");
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine) {
        System.out.println("Machine is sold out.");
    }
}
