import java.io.*;
public class Ex1228_03 {

	public static void main(String[] args) {
		// ��Ʈ�� Ŭ���� Ȱ��(���� �б�)
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("reader.txt"); // ���� ����
			//���� ó�� ����
			int i;	// ������ ���� ����Ʈ ���� �����ϴ� ����
			while((i = fis.read()) != -1) {	//�����͸� ������ ��� ����
				System.out.println((char)i);	// ����Ʈ�� ���ڷ� ���
//				System.out.println(i);	// ����Ʈ�� ���ڷ� ���
			}
			// ������� 
		} catch (Exception e) {
			System.out.println("1: " + e);
		} finally {
			if(fis != null) {	// ������ ���� �Ǿ��ٸ�
				try {
					fis.close();// ���� �ݱ�
				} catch (Exception ex) {
					System.out.println("2: " + ex);
				}
			}
		}
	}
}
