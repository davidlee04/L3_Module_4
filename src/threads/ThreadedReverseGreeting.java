package threads;

import java.util.ArrayList;

public class ThreadedReverseGreeting {
	static int max = 50;
	static int count = 0;
	int x;
	public static void main(String[] args) {
		
	}
	
	int createThread() {
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				if(count < max) {
					count++;
					x = createThread();
				} else {
					x = max;
				}
					System.out.println();
				}
		});
	}
	
	
  //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
}
