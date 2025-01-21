package FunctionalInterfce.PredefinedFunctionalInterfaces.Predicate;

import java.util.function.Predicate;

public class PredicateDemo {

    //Predicate functional interface abstract method takes one value returns boolean
    // boolean test(T t);

    // Predicate have  3 default methods and 1 static method
    // -> default Predicate<T> and(Predicate<? super T> others)
    // -> default Predicate<T> negate()
    // -> default Predicate<T> or(Predicate<? super T> others)
    // -> static <T> Predicate<T> isEqual(Object targetRef)

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


        //and() method to check if gender is female and salaary is >90000
        Predicate<Employee> genderCheck = e -> e.getGender().equalsIgnoreCase("female");
        e1.setGender("female");
        boolean isGender = empCheck.and(genderCheck).test(e1);
        System.out.println(isGender);

        //or() method to check salary is > 90000 or gender is male
        isGender = empCheck.or(genderCheck).test(e1);
        System.out.println(isGender);

        //negate() method to produce opposite result
        isGender = genderCheck.negate().test(e1);
        System.out.println(isGender);

        


    }
    
}
