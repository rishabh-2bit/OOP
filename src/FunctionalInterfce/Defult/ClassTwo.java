package FunctionalInterfce.Defult;

public class ClassTwo implements InterfaceTest{

    @Override
    public void printNames() {
        // TODO Auto-generated method stub
        System.out.println("implemented method 'printNames' class 2");
    }

    @Override
    public void getName() {
        // TODO Auto-generated method stub
        System.out.println("Unimplemented method 'getName' clss 2");
    }
    
}
