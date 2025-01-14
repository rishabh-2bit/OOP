package FunctionalInterfce.Defult;

public interface InterfaceOne {

    void printNames();
    void getName();

    default void defaultMethod() {
        System.out.println("implemented default method One -> InterfaceOne");
    }

    default String defaultMethod2() {
        System.out.println("implemented default method Two -> InterfaceOne");
        return "defaultMethodTwoInterfaceOne";
    }
    
}
