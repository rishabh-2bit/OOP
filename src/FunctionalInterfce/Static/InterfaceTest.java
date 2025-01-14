package FunctionalInterfce.Static;

public interface InterfaceTest {

    void printNames();
    void getName();

    static String staticMethodOne(){
        return "static method one";
    }

    static void staticMethodTwo() {
        System.out.println("static method two");
    }

    
}
