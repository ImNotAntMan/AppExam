import java.io.*;
public class Ex1228_03 {

	public static void main(String[] args) {
		// 스트림 클래스 활용(파일 읽기)
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("reader.txt"); // 파일 열기
			//파일 처리 구간
			int i;	// 문자의 읽은 바이트 값을 저장하는 변수
			while((i = fis.read()) != -1) {	//데이터를 읽으면 계속 진행
				System.out.println((char)i);	// 바이트를 문자로 출력
//				System.out.println(i);	// 바이트를 문자로 출력
			}
			// 여기까지 
		} catch (Exception e) {
			System.out.println("1: " + e);
		} finally {
			if(fis != null) {	// 파일이 오픈 되었다면
				try {
					fis.close();// 파일 닫기
				} catch (Exception ex) {
					System.out.println("2: " + ex);
				}
			}
		}
	}
}
