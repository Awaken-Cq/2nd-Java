package thisisjava.thinClone;

public class MemberExample {

	public static void main ( String[] args ) {
		
		Member origin = new Member ( "형", "정탁", 29 );
		
		Member cloned = origin.getMember();
		
		cloned.id 	= "동생";
		cloned.name = "승탁";
		cloned.age	= 25;
		
		System.out.println( "origin ::" + origin );
		System.out.println( "cloned ::" + cloned );
		
	}
}
