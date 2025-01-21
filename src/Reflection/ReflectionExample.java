package Reflection;

import java.lang.reflect.*;

class ExampleClass {
    private int id;
    public String name;

    public ExampleClass() {
    }

    public ExampleClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    private void privateMethod() {
        System.out.println("Private method invoked");
    }
}

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        // Get Class object
        Class<?> clazz = ExampleClass.class;

        // Print class name
        System.out.println("Class Name: " + clazz.getName());

        // Get and print fields
        Field[] fields = clazz.getDeclaredFields();
        System.out.println("Fields:");
        for (Field field : fields) {
            System.out.println("  " + field.getName() + " (" + field.getType() + ")");
        }

        // Get and print methods
        Method[] methods = clazz.getDeclaredMethods();
        System.out.println("Methods:");
        for (Method method : methods) {
            System.out.println("  " + method.getName());
        }

        // Access private method
        ExampleClass obj = new ExampleClass();
        Method privateMethod = clazz.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true); // Bypass private access
        privateMethod.invoke(obj); // Invoke the private method
    }
}