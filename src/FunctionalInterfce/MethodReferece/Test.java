package FunctionalInterfce.MethodReferece;

public class Test {

    public static void main(String[] str){

        // referencing to static method inside Employee class,
        // employee class static method will become implementation of fuctional  interface abstract method
        // method signature of method which is reffered should be matched to method signatures of Functional Interface abstract method
        EmployeeValidation isValidEmpStatic = Employee::validateEmployeeDetails;

        // for non-static method we will create an instace of class and use that instace to access method of class and pass it to fI reference.
        // Employee empy = new Employee();
        // EmployeeValidation isValidEmpInstace = empy::validateEmployeeDetails;

        Employee emp = new Employee();
        System.out.println(isValidEmpStatic.isEmployeeValid(emp)); // false

        Employee emp1 = new Employee();
        emp1.setId(1);
        emp1.setName("ri");
        System.out.println(isValidEmpStatic.isEmployeeValid(emp1)); // true

    }
    
}
