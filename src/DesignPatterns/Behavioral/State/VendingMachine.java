package DesignPatterns.Behavioral.State;

public class VendingMachine {
	private VendingMachineState currentState;

    public VendingMachine() {
        currentState = new NoCoinState();
    }

    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public void insertCoin() {
        currentState.insertCoin(this);
    }

    public void selectProduct() {
        currentState.selectProduct(this);
    }

    public void dispenseProduct() {
        currentState.dispenseProduct(this);
    }

}
