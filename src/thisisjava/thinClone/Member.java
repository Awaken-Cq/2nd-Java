package thisisjava.thinClone;

public class Member implements Cloneable {

	public String id;
	public String name;
	public int age;
	
	public Member ( String id, String name, int age ) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + "]";
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
