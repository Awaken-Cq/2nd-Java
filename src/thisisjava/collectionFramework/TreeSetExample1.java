package thisisjava.collectionFramework;

import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(99);
		scores.add(68);
		scores.add(89);
		scores.add(80);
		scores.add(70);
		
		Integer score = null;
		
		score = scores.first();
		
		System.out.println("minimum : " + score);
		
		score = scores.last();
		
		System.out.println("maximum : " + score);
		
		score = scores.lower(80);
		System.out.println("80미만 " + score);
		
		score = scores.higher(80);
		System.out.println("80초과 " + score);
		
		score = scores.floor(80);
		System.out.println("80이하 " + score);
		
		score = scores.ceiling(80);
		System.out.println("80이상 " + score);
		
	
		while ( !scores.isEmpty() ) {
			score = scores.pollFirst();
			System.out.println(score + " 남은 객체 수 : " + scores.size());
		}
	}
}
