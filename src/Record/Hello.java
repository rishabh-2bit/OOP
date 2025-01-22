package Record;

public record Hello(String name, int age) {

    public String greet(){
        System.out.println("hello , namaste");
        return "Hello, "+name;
    }
    
}
