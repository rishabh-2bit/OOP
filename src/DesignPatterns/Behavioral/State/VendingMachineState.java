package DesignPatterns.Behavioral.State;

public interface VendingMachineState {
	void insertCoin(VendingMachine vendingMachine);
    void selectProduct(VendingMachine vendingMachine);
    void dispenseProduct(VendingMachine vendingMachine);

}
