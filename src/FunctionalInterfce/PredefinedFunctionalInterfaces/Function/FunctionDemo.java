package FunctionalInterfce.PredefinedFunctionalInterfaces.Function;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionDemo {

    //function interface takes one input and returns a result;
    // function interface has one predefind abstract method R apply(T t).

    public static void main(String[] args) {

        // Find half value from  given value
        Function<Integer, Double> fun = i -> i/2.0;

        Double dd = fun.apply(10);
        System.out.println(dd);

        // input String to uppercase String output
        Function<String, String> uppercase = String::toUpperCase;
        String upper = uppercase.apply("heKLo");
        System.out.println(upper);

        //default andThen() method  of Function
        Function<String, String> nullCheckafter = str -> str == null ? "this is null checked after" : str;
       String str1 =  nullCheckafter.andThen(uppercase).apply("this is andThen");
       System.out.println(str1);

       // default compose() method of Function
        Function<String, String> nullCheckbefore = str -> str == null ? "this is null checked before" : str;
       String str2 = nullCheckbefore.compose(uppercase).apply("this is compose");
       System.out.println(str2);

       //static method of Function is identity()
       // Example- i have to collect all values as a list from stream object
       Stream<String> stream = Stream.of("One","two","three");
       List<String> streamValues = stream.map(Function.identity()).collect(Collectors.toList());
       System.out.println(streamValues);
    }
    
}
