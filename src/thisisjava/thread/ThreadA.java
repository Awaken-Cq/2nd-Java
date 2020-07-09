package thisisjava.thread;

public class ThreadA extends Thread {
	public boolean work = true;
	public boolean stop = false;
	
	public void run() {
		while(!stop) {
			if ( work ) {
				System.out.println("ThreadA is running");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA is terminated");
	}
}
