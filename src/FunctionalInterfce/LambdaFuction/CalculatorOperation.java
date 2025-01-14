package FunctionalInterfce.LambdaFuction;

@FunctionalInterface
public interface CalculatorOperation {

    double operation(int a, int b);

    default void printInfo(){
        System.out.println("this is default method");
    }

    static void typeOfOps() {
        System.out.println("this is static method");
    }
    
}
