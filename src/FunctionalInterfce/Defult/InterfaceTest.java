package FunctionalInterfce.Defult;

public interface InterfaceTest {

    void printNames();
    void getName();

    default void defaultMethod(){
        System.out.println("implemented default method");
    }

    default String defaultMethod2() {
        System.out.println("implemented default method 2");
        return "defaultMethod2";
    }

    
}
