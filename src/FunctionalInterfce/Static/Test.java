package FunctionalInterfce.Static;

public class Test {

    public static void main(String[] s){

        // static methods can not be accesed by using impl object;
        // static method does not belong to any object , it belong to the class.
      // StaticImplClass impl = new StaticImplClass();
       System.out.println(InterfaceTest.staticMethodOne());
       InterfaceTest.staticMethodTwo();

    }
    
}
