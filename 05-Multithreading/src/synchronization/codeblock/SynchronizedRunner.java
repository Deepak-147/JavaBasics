package synchronization.codeblock;

/**
 * Author: ldeepak
 */

/**
 * Race conditions caused by multiple threads accessing and modifying the same variable concurrently.
 * When you start multiple threads, each thread updates the shared variable without any synchronization mechanism in place, leading to unpredictable behavior.
 * The synchronized keyword in Java is used to control access to shared resources in multithreaded environments.
 * It ensures that only one thread can execute a block of code or method at a time for a given object or class, preventing race conditions.
 * When a thread enters a synchronized block or method, it acquires a lock on the specified object (or class for static blocks).
 * Other threads must wait until the lock is released before entering the block.
 */
class Counter {
    private int count = 0;

    public void increment() {
        // Synchronized code block
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

public class SynchronizedRunner {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create 10 threads that increment the counter 10000 times each
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
                    counter.increment();
                }
            });
            threads[i].start();
        }

        // Wait for all threads to finish before printing the output
        // This does not block other threads; it only makes the main thread wait for all child threads to finish before printing the result. All threads run concurrently.
        for (Thread t : threads) {
            t.join();
        }

        // Output should be 100000
        System.out.println("Final count: " + counter.getCount());
    }
}

