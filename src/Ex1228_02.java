import java.io.*;
public class Ex1228_02 {

	public static void main(String[] args) {
		// �����Ϸ��� ���� üũ�Ǵ� ����
		FileInputStream fis = null; // try �� �ܺο����� ��밡��
		try {
			fis = new FileInputStream("a.txt"); // ���� ó���� �ݵ�� �ؾ���.
			
			// �� �κ��� ����ó���Ǵ� ����
			// ���ҽ� ���� ó��
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e);
			// ������ ���� ����
			// ���⿡�� ���ҽ� ���� ó��
		} finally {	// �׻� ó���� ����
			// ���� ó���� ������ ���� �ۼ�
			// ���� ó�� �ؾ� ��.
			if(fis != null) {
				try {
					fis.close();
				} catch (Exception ex) {
					ex.printStackTrace();// ���� ���� ���� ���
				}
				
			}			
		}
	}
}
