package Lambda;

public class SumOfTwoValues{

    public static void main(String[] s){
        Functional fun = (a,b) -> a + b;
        System.out.println(fun.sumOfTwoValues(6,9));
    }
    
}
