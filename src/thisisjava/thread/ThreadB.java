package thisisjava.thread;

public class ThreadB extends Thread {

	public boolean work = true;
	public boolean stop = false;

	public void run() {
		while(!stop) {
			if (work) {
				System.out.println("ThreadB is running");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadB is terminated");
	}
}
