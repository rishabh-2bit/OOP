package Multithreading.ThreadCreation;

public class StartThreadByImplementingRunnable {

    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Myrunnable running");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
