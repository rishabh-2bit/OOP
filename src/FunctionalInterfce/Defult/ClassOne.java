package FunctionalInterfce.Defult;

public class ClassOne implements InterfaceTest{


    
    @Override
    public void printNames() {
        // TODO Auto-generated method stub
        System.out.println("implemented method 'printNames'");
    }

    @Override
    public void getName() {
        // TODO Auto-generated method stub
        System.out.println("implemented method 'getName'");
    }


    //this method will get priority over interfce default method
    @Override
    public void defaultMethod(){
        System.out.println("hello overriden defult ");
    }
    
}
