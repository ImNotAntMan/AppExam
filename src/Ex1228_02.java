import java.io.*;
public class Ex1228_02 {

	public static void main(String[] args) {
		// 컴파일러에 의해 체크되는 예외
		FileInputStream fis = null; // try 블럭 외부에서도 사용가능
		try {
			fis = new FileInputStream("a.txt"); // 예외 처리를 반드시 해야함.
			
			// 이 부분은 정상처리되는 영역
			// 리소스 종료 처리
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e);
			// 비정상 종료 영역
			// 여기에도 리소스 종료 처리
		} finally {	// 항상 처리될 영역
			// 최종 처리할 공통의 내용 작성
			// 예외 처리 해야 함.
			if(fis != null) {
				try {
					fis.close();
				} catch (Exception ex) {
					ex.printStackTrace();// 예외 관련 내용 출력
				}
				
			}			
		}
	}
}
