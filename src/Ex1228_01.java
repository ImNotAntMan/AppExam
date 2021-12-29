
public class Ex1228_01 {

	public static void main(String[] args) {
		// 에외처리 try ~ catch
		int[] arr = new int[4];
		try {
			// 예외가 발생할 가능성이 있는 문장
			for(int i = 0; i < 5; i++) {
				arr[i] =  i;
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			// 예외가 발생했을 경우 처리할 문장
			System.out.println(e.toString());
		}

	}

}
