package thisisjava.deepClone;

import java.util.Arrays;

public class Member implements Cloneable {

	public String id;
	public String name;
	public int age;
	public int[] numArr;
		
	
	public Member ( String id, String name, int age, int[] numArr ) {
		
		this.id 		= id;
		this.name 		= name;
		this.age 		= age;
		this.numArr 	= numArr;
		
	}
	

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + ", numArr=" + Arrays.toString(numArr) + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// thinClone
		Member cloned = (Member) super.clone();
		// numArr deepClone
		cloned.numArr = Arrays.copyOf(this.numArr, this.numArr.length);
		
		// deepClone된 numArr을 필드로 가진 결과적으로 deepClone된  Member 객체를 리턴.
		return cloned;
	}


	public Member getMember () {
		Member cloned = null;
		
		try {
			
			cloned = (Member) clone();
		} catch ( CloneNotSupportedException e ) { 
			
			System.out.println("CloneNotSupportedException");
		}
		
		return cloned;
	}
}

