package thisisjava.collectionFramework;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("apple");
		set.add("grape");
		set.add("orange");
		set.add("melon");
		set.add("pineapple");
		set.add("banana");
		set.add("strobarry");
		set.add("lemon");
		set.add("abocado");
		
		System.out.println("[c~z 사이의 단어 검색]");
		
		NavigableSet<String> rangeSet = set.subSet("c", true, "z", true);
		
		for (String word : rangeSet) {
			
			System.out.println(word);
		}
		
	}



}
