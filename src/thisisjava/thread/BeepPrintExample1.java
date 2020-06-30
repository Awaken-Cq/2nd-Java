package thisisjava.thread;

import java.awt.Toolkit;

public class BeepPrintExample1 {

	public static void main(String[] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for ( int i = 0; i < 5; i++ ) {
			toolkit.beep();
			try { 
				Thread.sleep(500);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		for ( int j = 0; j < 5; j++ ) {
			System.out.println("DDING!");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
