package executorservice.callable.advanced;

import java.util.List;
import java.util.concurrent.*;

/**
 * Author: ldeepak
 */

/**
 * Notice the use of invokeAll() method of ExecutorService which takes a collection of Callable tasks
 */
class CallableTask implements Callable<String> {

	private String name;

	public CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000); // Simulate a long-running task
		return "Hello " + name + " executed.";
	}
}

public class MultipleCallableRunner {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);

		List<CallableTask> callableTasks = List.of(new CallableTask("Deepak"), new CallableTask("John"));
		List<Future<String>> results = executorService.invokeAll(callableTasks);

		for (Future<String> future : results) {
			System.out.println(future.get());
		}

		executorService.shutdown();
	}
}
