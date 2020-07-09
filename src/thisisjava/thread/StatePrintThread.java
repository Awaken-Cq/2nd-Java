package thisisjava.thread;

public class StatePrintThread extends Thread {

	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState(); 
			System.out.println("타켓 쓰레드 상태 : " + state);
			
			if ( state == Thread.State.NEW ) {
				targetThread.start();
			}
			
			if (state == Thread.State.TERMINATED) {	//실행을 마친 상태
				break;
			}
			
			try {
				Thread.sleep(100);
			} catch(Exception e) {
				
			}
		}
	}
	
}
