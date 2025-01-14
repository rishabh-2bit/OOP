package Stream;

import java.util.stream.*;

public class Streams {
    public static void main(String[] args) throws Exception {

        // Stream.of(values) is a static factory method that puts values in Stream<String> fruit in sequential order
        // filter() - it retains data only match the given predicte(returns true or false) - predicate here is given as lambda expression[s -> s.contains("a")]
        // map() operation transforms each element using given function, called mapper.
        // map() operation returns a stream with a different generic type
        // sorted() operation sorts the elements of the stream according to natural ordering
        // forEach(action) operation performs an action which acts on each element of Stream, passig to a Consumer 

        //change to upper case and sort
        Stream<String> fruit = Stream.of("apple","banana","orange","kiwi","pear");
        fruit.filter(s -> s.contains("a")).map(String::toUpperCase).sorted().forEach(System.out::println);
        System.out.println(fruit);
    }
    
    
}
