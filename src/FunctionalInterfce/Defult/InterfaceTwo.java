package FunctionalInterfce.Defult;

public interface InterfaceTwo {

    default void defaultMethodInterfaceTwo() {
        System.out.println("implemented default method One -> InterfaceTwo");
    }

    default String defaultMethod2InterfaceTwo() {
        System.out.println("implemented default method Two -> InterfaceTwo");
        return "defaultMethodTwoInterfaceTwo";
    }
    
    default void defaultMethod() {
        System.out.println("special case same mettthod signature of  interface one ");
    }
    
}
