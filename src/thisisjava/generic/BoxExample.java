package thisisjava.generic;

public class BoxExample {

	
	public static void main(String[] args) {
		
		Box<String> box1 = new Box<String>();
		
		box1.set("hello");
		System.out.println(box1.get());
		
		Box<Integer> box2 = new Box<Integer>();
		
		box2.set(99);
		System.out.println(box2.get());
		
		//box1.set(15);	is not applicable (int)
		
	}
}
