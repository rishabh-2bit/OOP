package FunctionalInterfce.PredefinedFunctionalInterfaces.Supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;
public class SupplierDemo {

    // supplier functional interfce takes no value as input but returns a result
    // supplier functional method is -> [T  get()]

    public static void main(String[] args) {


       // Supplier<LocalDateTime> dt = () -> LocalDateTime::now();
      // System.out.println(dt.get());

     // printCurrentDateTime(dt);

    }

    // public static void printCurrentDateTime(Supplier<LocalDateTime> dateTime){
    //     System.out.println(dateTime.get());
    // }

    
}
