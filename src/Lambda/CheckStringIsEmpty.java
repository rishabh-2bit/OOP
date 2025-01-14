package Lambda;

import java.util.function.Predicate;

public class CheckStringIsEmpty {

    public static void main(String[] s) {


        Predicate<String> isStrEmpty = str -> str.isEmpty() || str == null;

        String str1 = "hh";
        System.out.println(str1);
    }
    
}
