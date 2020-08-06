package thisisjava.thread;

public class DataBox {
	private String data;
	
	public synchronized String getData() {
		if (this.data == null) {
			
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		
		String returnValue = data;
		System.out.println("소비자가 " + data + "를 구매했습니다.");
		data = null;
		notify();
		return returnValue;
		
	}

	public synchronized void setData(String data) {
		
		if (this.data != null) {

			try {
				wait();
			} catch(InterruptedException e) {}
		}
		this.data = data;
		System.out.println("생산자가" + data + "를 생성했습니다.");
		notify();
		
	}
	
}
