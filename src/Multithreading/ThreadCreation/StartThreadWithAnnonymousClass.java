package Multithreading.ThreadCreation;

public class StartThreadWithAnnonymousClass {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                System.out.println("anonymous class runnable thread creation");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
    
}
