package thisisjava.thread;

public class WaitNotifyExample {

	public static void main(String[] args) {
		WorkObject workObject = new WorkObject();
		
		WorkThreadA threadA = new WorkThreadA(workObject);
		WorkThreadB threadB = new WorkThreadB(workObject);
		
		threadA.start();
		threadB.start();
	}
}
