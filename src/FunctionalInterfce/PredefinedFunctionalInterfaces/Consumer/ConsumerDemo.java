package FunctionalInterfce.PredefinedFunctionalInterfaces.Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    // Consumer FunctionalInterface takes an argument as input and does not return
    // anything(no output).
    // abstract method of Consumer FunctionalInterface is ->  accept(T t).
    // Consumer has one default method ->  default Consumer<T> andThen(Consumer<? super T> after).

    public static void main(String[] args) {
        List<String> values = Arrays.asList("abc", "bcd", "cdE");
        Consumer<String> printConsumer = str -> System.out.println(str.toUpperCase());

        //accept method 
        printConsumer.accept("Hello , Namaste");
        values.forEach(printConsumer);

        List<String> nValues = new ArrayList<>();
        Consumer<String> addToList = str -> nValues.add(str.toUpperCase());
        values.forEach(addToList);
        System.out.println(nValues);

        

    }

}
