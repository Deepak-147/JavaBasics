package executorservice.callable.basic;

import java.util.concurrent.*;

/**
 * Author: ldeepak
 */

/**
 * Notice the use of submit() method to submit tasks to the executor service.
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

public class CallableRunner {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> futureMsg = executorService.submit(new CallableTask("Deepak"));

        // Future is a promise to return a result in future
        String msg = futureMsg.get(); // This will block until the result is available
        System.out.println(msg);

        System.out.println("Main finished ...");

         // Always shut down the executor to release resources.
        executorService.shutdown();
    }
}
