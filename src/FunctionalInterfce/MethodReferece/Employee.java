package FunctionalInterfce.MethodReferece;

public class Employee {

    private int id;
    private String name;
    private String gender;
    private double salary;

    static boolean validateEmployeeDetails(Employee emp){
       if(emp.getId() != 0 && emp.getName() != null){
        return true;
       }
       return false;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    
    public String getGender() {
        return gender;
    }
    
    public double getSalery() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    

    
}
