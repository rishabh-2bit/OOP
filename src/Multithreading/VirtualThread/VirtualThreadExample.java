package Multithreading.VirtualThread;

import java.util.ArrayList;
import java.util.List;

public class VirtualThreadExample {

    // virtual threads are from java 19(preview) and java 21 standard feature
    // these threads are lighter than Plateform threads(traditional threads managed
    // by OS)
    // virual threads are managed by plateform threads.

    public static void main(String[] args) {
        List<Thread> vThreadList = new ArrayList<>();
        int vThreadCount = 10000;
        for (int i = 0; i < vThreadCount; i++) {
            int vThreadIndex = i;
            // Creating a virtual thread directly
            Thread vthread = Thread.ofVirtual().start(() -> {
                int result = 1;
                for (int j = 0; j < 10; j++) {
                    result *= (j + 1);
                }
                System.out.println("Result[" + vThreadIndex + "]: " + result);
            });

            // we can also create virtual threads Using ExecutorService
            /*
             * try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
             * for (int i = 0; i < 10; i++) {
             * executor.submit(() -> {
             * System.out.println("Task in virtual thread: " + Thread.currentThread());
             * });
             * }
             * }
             */

             vThreadList.add(vthread);
        }

        for (int i = 0; i < vThreadList.size(); i++) {
            try {
                vThreadList.get(i).join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
