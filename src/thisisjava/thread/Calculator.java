package thisisjava.thread;

public class Calculator {
	
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	//synchronized를 통해 동기화 메소드를 만들어 하나의 스레드가 해당 메소드를 실행중일때는 다른 쓰레드 실행 접근할 수 없게한다.
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try{
			Thread.sleep(2000);
		} catch(InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
	
	//synchronized (객체)를 통해 동기화 블록을 만들어 해당 구간을 임계영역으로 지정한다.
	public void setMemory1(int memory) {
		synchronized (this) {	//(this) 공유 객체인 Calculator의 참조(잠금대상)
			
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) { 
			}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
	}
}
