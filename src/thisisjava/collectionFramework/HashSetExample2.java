package thisisjava.collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<Member>();
		
		
		set.add(new Member("와드", 25));
		set.add(new Member("와드", 25));

		System.out.println("총 객체수 : " + set.size()
		
				);
	}
	
}
