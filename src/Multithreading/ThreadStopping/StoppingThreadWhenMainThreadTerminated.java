package Multithreading.ThreadStopping;

public class StoppingThreadWhenMainThreadTerminated {

    public static void main(String[] args) {

        Runnable runnable = () -> {

            while (true){
                sleep(1000);
                System.out.println("Running");
            }
        };

        Thread th = new Thread(runnable);
        //by setting new thread as daemon thread we can stop thread keep running even after main thread stopped
        th.setDaemon(true);
        th.start();
        sleep(3100);
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
