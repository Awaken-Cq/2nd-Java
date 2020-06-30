package thisisjava.collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");

		int size = list.size();
		
		System.out.println("총계체 수  : " + size);
		
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		
		for ( int i = 0; i < list.size(); i++ ) {
			String str = list.get(i);

			System.out.println( i + " : " + str );
		}
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		for ( int j = 0; j < list.size(); j ++) {
			
			String str = list.get(j);
			
			System.out.println(j + " : " + str);
		}

		
		System.out.println("=====================================");
		
		//Arrays.asList()
		
		List<String> list2 = Arrays.asList("홍길동", "신용권", "감자바");
		
		for ( String name : list2 ) {
			System.out.println(name);
		}
		
		
	} 
	
}

