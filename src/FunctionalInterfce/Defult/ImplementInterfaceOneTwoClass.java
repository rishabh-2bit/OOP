package FunctionalInterfce.Defult;

public class ImplementInterfaceOneTwoClass implements InterfaceOne, InterfaceTwo{

    @Override
    public void printNames() {
        System.out.println("implemented method 'printNames' interfaceOne");
    }

    @Override
    public void getName() {
        System.out.println("implemented method 'getName' interfaceOne");
    }

    @Override
        public void defaultMethod() {
            InterfaceOne.super.defaultMethod();
            InterfaceTwo.super.defaultMethod();
        }
    
}
