package thisisjava.etc;

import java.io.UnsupportedEncodingException;

public class ClassStringExample {
	
	public static void main(String[] args) {
		String str= "ABCDEF";
		
		byte[] byteArr;
		
		try {
			byteArr = str.getBytes("UTF-8");

			for ( int i = 0; i < byteArr.length; i++ ) {
				
				System.out.println(byteArr[i]);
			}
		
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//conflictTest용 주석
	}
}
