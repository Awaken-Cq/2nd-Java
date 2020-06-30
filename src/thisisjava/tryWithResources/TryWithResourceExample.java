package thisisjava.tryWithResources;

public class TryWithResourceExample {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt");
				FileInputStream fis2 = new FileInputStream("file2.txt")) {
			
			fis.read();
			fis2.read();
			throw new Exception(); // 강제적으로 예외 발생
			
		} catch (Exception e) {
			
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
	}
}
