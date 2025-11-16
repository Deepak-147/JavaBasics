package executorservice.runnable.fixedthread;

/**
 * Author: ldeepak
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Fixed Thread Pool:
 * A fixed thread pool is a type of ExecutorService that maintains a set number of threads.
 * When a task is submitted, it is assigned to an available thread from the pool.
 * If all threads are busy, the task waits in a queue until a thread becomes available.
 *
 * Notice the use of execute() method to submit tasks to the executor service.
 */

class RunnableTask implements Runnable {
	private int number;

	public RunnableTask(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		System.out.println("\nRunnable Task " + number + " Started ...\n");

		for (int i=number*100; i<=number*100 + 99; i++) {
			System.out.println(i + " ");
		}

		System.out.println("\nRunnable Task " + number + " finished ...\n");
	}
}

public class ExecutorServiceRunner {

	public static void main(String[] args) {

		// Create a fixed thread pool with 2 threads
		// Two tasks can run concurrently.
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(new RunnableTask(1));
		executorService.execute(new RunnableTask(2));

		// Task 3 is not submitted to the executor service, so it runs in the main thread.
		// Therefore, Task 3 may start executing before other tasks are complete.
		System.out.println("\nTask 3 Started ...\n");

		for (int i=301; i<=399; i++) {
			System.out.println(i + " ");
		}

		System.out.println("\nTask 3 finished ...\n");
		System.out.println("\nMain finished ...\n");

		// Always shut down the executor to release resources.
		executorService.shutdown();
	}
}
