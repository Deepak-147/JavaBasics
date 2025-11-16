package synchronization.codeblock.unsynchronized;


/**
 * Author: ldeepak
 */


class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class UnsynchronizedRunner {
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
