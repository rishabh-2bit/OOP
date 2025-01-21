package Multithreading.ThreadStopping;

public class StoppingThread {

    // this example will stop the new thread when requested.

    public static class StoppableRunnable implements Runnable {

        private boolean stopRequested = false;

        public synchronized void requestStop() {
            this.stopRequested = true;
        }

        public synchronized boolean isStopRequested() {
            return this.stopRequested;
        }

        private void sleep(long millis) {
            try {
                Thread.sleep(millis);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            System.out.println("a running thread");
            while (!isStopRequested()) {
                sleep(1000);
                System.out.println("....");
            }
            System.out.println("thread stopped");
        }

    }

    public static void main(String[] args) {
        StoppableRunnable sr = new StoppableRunnable();
        Thread thread = new Thread(sr,"My Thread");
        thread.start();
        try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("requesting stop of 'My thread' thread");
        sr.requestStop();
        System.out.println("stop requested");


  }
}
