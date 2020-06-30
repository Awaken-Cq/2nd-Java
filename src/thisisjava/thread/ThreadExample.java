package thisisjava.thread;

public class ThreadExample {

	public static void main(String[] args) {
		
		
		Thread thread = new Thread( new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("쓰레드 가동");
				
			}
		});
		
		thread.run();
	}
}
