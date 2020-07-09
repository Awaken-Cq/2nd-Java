package thisisjava.thread;

//공유객체를 사용할때 발생하는 문제점 ( 비동기일 경우 )
public class MainThreadExample {
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
		
	}
}
