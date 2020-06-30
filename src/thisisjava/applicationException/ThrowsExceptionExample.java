package thisisjava.applicationException;

import java.util.Scanner;

public class ThrowsExceptionExample {
	
	public static void main (String[] args) {
		
		int input;
		
		Scanner sc= new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		sb.append(sc.nextLine());
		
		System.out.println(sb.toString());
	
	}
}
