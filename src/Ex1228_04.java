import java.io.*;
public class Ex1228_04 {

	public static void main(String[] args) {
		// 파일리더 클래스 활용
		FileReader fr = null;
		try {
			fr = new FileReader("reader.txt"); // 
			//
			int i;	// 
			while((i = fr.read()) != -1) {	//
				System.out.println((char)i);	// 
//				System.out.println(i);	// 
			}
			// 
		} catch (Exception e) {
			System.out.println("1: " + e);
		} finally {
			if(fr != null) {	//
				try {
					fr.close();//
				} catch (Exception ex) {
					System.out.println("2: " + ex);
				}
			}
		}
	}
}
