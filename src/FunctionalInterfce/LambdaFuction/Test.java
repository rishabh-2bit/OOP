package FunctionalInterfce.LambdaFuction;

public class Test {

    public static void main(String[] s){

    //    Calculate cal = () -> {
    //     System.out.println(" lmbddaa impl");
    //    };
    //    cal.printName();

    CalculatorOperation ops = (int a, int b) -> {
        return a+b;
    };
      System.out.println(ops.operation(2, 5));

      CalculatorOperation ops1 = (a, b) -> {
          return a - b;
      };
      System.out.println(ops1.operation(200, 50));
    }
    
}
