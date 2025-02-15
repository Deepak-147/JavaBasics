/**
 * 
 * Without synchronization
 *
 */
class MyThread extends Thread {
	public void run() {
        for (int i=0; i<10000; i++) {
        	ThreadBasicsRunner2.count1++;
        }
    }
}

/**
 * 
 * Race conditions caused by multiple threads accessing and modifying the some variable concurrently. 
 * When you start multiple threads, each thread updates the shared variable without any synchronization mechanism in place, leading to unpredictable behavior.
 *
 */
class MySynchronizedThread extends Thread {
	public void run() {
        for (int i=0; i<10000; i++) {
        	synchronized(ThreadBasicsRunner2.class) {
        		ThreadBasicsRunner2.count2++;        		
        	}
        }
    }
}

public class ThreadBasicsRunner2 {
	public static int count1 = 0; // for unsynchronized example
	public static int count2 = 0; // for synchronized example
	
	public static void main(String[] args) throws InterruptedException {
		
		// Unsynchronized
		for (int i=0; i<10; i++) {
			MyThread th = new MyThread();
			th.start();
		}
		
		Thread.sleep(1000);
		
		// Expected count is 100000, but we get unpredictable result, such as I got count = 42457 at the time of execution. We may get random results.
		System.out.println("Unsynchronized value of count: " + ThreadBasicsRunner2.count1); 
		
		// Synchronized threads
		for (int i=0; i<10; i++) {
			MySynchronizedThread th = new MySynchronizedThread();
			th.start();
		}
		
		Thread.sleep(1000);
		
		// Got the correct output as 100000
		System.out.println("Synchronized value of count:" + ThreadBasicsRunner2.count2);
	}
}
