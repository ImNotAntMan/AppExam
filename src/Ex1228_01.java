
public class Ex1228_01 {

	public static void main(String[] args) {
		// ����ó�� try ~ catch
		int[] arr = new int[4];
		try {
			// ���ܰ� �߻��� ���ɼ��� �ִ� ����
			for(int i = 0; i < 5; i++) {
				arr[i] =  i;
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			// ���ܰ� �߻����� ��� ó���� ����
			System.out.println(e.toString());
		}

	}

}
