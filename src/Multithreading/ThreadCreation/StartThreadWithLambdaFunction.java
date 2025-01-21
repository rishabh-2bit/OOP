package Multithreading.ThreadCreation;

public class StartThreadWithLambdaFunction {

    public static void main(String[] args) {
        String tString = Thread.currentThread().getName();
        Runnable runnable = () -> {
            String thString = Thread.currentThread().getName();
            System.out.println(tString+" - Lmbda function to create new thread - "+thString);
        };

        Thread thread = new Thread(runnable, "MyThread");
        thread.start();
    } 
}
