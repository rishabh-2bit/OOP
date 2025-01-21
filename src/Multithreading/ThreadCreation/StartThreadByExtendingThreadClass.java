package Multithreading.ThreadCreation;

public class StartThreadByExtendingThreadClass{

    // by extending Thread class from java.lang package

    public static class MyThread extends Thread {
        public void run(){
            System.out.println("thread running");
        }
    }

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
    }
    
}
