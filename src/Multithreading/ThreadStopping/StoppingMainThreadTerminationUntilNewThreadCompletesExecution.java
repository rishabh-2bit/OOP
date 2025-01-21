package Multithreading.ThreadStopping;

public class StoppingMainThreadTerminationUntilNewThreadCompletesExecution {

    public static void main(String[] args) {

        Runnable runnable = () -> {
                for(int i=0; i <5; i++){
                     sleep(1000);
                     System.out.println("Running");
                    }
        };

        Thread th = new Thread(runnable);
        th.setDaemon(true);
        th.start();
        try {
            th.join();
        } catch(InterruptedException e){
            e.printStackTrace();
        }

    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
