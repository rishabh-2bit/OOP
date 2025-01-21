package Interface;

public class ImplementOneTwo  implements InterfaceOne, InterfaceTwo{

    @Override
    public void printMessage() {
        System.out.println("Hello");
    }
    
}
