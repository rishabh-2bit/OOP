package Lambda;


import java.util.stream.Stream;

public class UpperCaseAndLowerCase {

    public static void main(String[] s) {
        //upper
        Stream<String> stream = Stream.of("Hello","hiIIi","bYe","Goodbye");
        stream.map(a -> a.toUpperCase()).forEach(System.out::println);

        //lower
        Stream<String> stream1 = Stream.of("Hello", "hiIIi", "bYe", "Goodbye");
        stream1.map(a -> a.toLowerCase()).forEach(System.out::println);
    }
    
}
