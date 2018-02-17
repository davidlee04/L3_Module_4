package threads;

import java.util.ArrayList;

public class ThreadedReverseGreeting {
	static int max = 50;
	static int count = 0;

	public static void main(String[] args) {
		createThread(0);
	}

	static void createThread(int i) {

		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				int x = i;
				if (x < max) {
					createThread(x+1);
				}
				System.out.println("hello from thread #" + x);
			}
		});
		thread.start();

		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Write a program that creates a thread (Thread 1) that creates another thread
	// (Thread 2);
	// Thread 2 creates Thread 3; and so on, up to Thread 50.
	// Each thread should print "Hello from Thread <num>!",
	// but you should structure your program such that the threads print their
	// greetings in reverse order.
}
