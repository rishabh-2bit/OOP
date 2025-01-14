package FunctionalInterfce.Static;

public class StaticImplClass implements InterfaceTest{

    @Override
    public void printNames() {
        System.out.println("implemented method 'printNames' interfaceOne");
    }

    @Override
    public void getName() {
        System.out.println("implemented method 'getName' interfaceOne");
    }
    
}
