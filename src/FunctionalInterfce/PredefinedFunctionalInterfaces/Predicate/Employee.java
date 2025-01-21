package FunctionalInterfce.PredefinedFunctionalInterfaces.Predicate;

public class Employee {
    private int id;
    private String name;
    private double salery;
    private String gender;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalery(double salery) {
        this.salery = salery;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalery() {
        return salery;
    }

    public String getGender() {
        return gender;
    }

}
