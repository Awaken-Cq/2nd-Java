package thisisjava.thread;

public class ThreadNameExample {
	
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println( "main : " + mainThread.getName() );
	}
}
