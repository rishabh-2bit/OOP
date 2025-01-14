package FunctionalInterfce.PredefinedFunctionalInterfaces.Predicate;

import java.util.function.Predicate;

public class PredicateDemo {

    //Predicate functional interface abstract method takes one value returns boolean
    // boolean test(T t);

    public static void main(String[] args) {

        Predicate<Integer> ageCheck = age -> age > 25;
        System.out.println(ageCheck.test(23));
        System.out.println(ageCheck.test(26));

        if(ageCheck.test(26)){
            System.out.println("check passed");
        }else{
            System.out.println("check failed");
        }

        Employee e1 = new Employee();
        e1.setId(111);
        e1.setName("Me");
        e1.setSalery(100000);

        Predicate<Employee> empCheck = e -> e.getSalery() > 90000;
        if(empCheck.test(e1)){
            System.out.println("above ");
        } else {
            System.out.println("below ");
        }
    }
    
}
