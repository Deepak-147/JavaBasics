package executorservice.runnable.singlethread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author: ldeepak
 */

/**
 * Single Thread Executor:
 * A single thread executor is a type of ExecutorService that uses only one worker thread to execute tasks.
 * This means that tasks are executed sequentially, one after the other.
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

		// Creates an ExecutorService that uses a single worker thread to execute submitted tasks sequentially.
		// This means only one task runs at a time, and tasks are executed in the order they are submitted.
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new RunnableTask(1)); // This task will always finish before other task starts
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

