
public class EqualTest2 {

	public static void main(String[] args) {
		Student st1 = new Student(100, "ȫ�浿");
		Student st2 = new Student(100, "ȫ�浿");
		System.out.println("�����ں� : " + (st1 == st2));	// ��ü �ּ�(�ؽ��ڵ�) ��
		System.out.println("�޼���� : " + st1.equals(st2));	// ��ü �ؽ��ڵ� ��
		
		Student st3 = st1;
		System.out.println("�����ں� : " + (st1 == st3));	// ��ü �ּ�(�ؽ��ڵ�) ��
		System.out.println("�޼���� : " + st1.equals(st3));	// ��ü �ؽ��ڵ� ��
		
		String s1 = new String("ȣ����");
		String s2 = new String("ȣ����");
		System.out.println("�����ں� : " + (s1 == s2));	// ���ڿ� �ּ� ��
		System.out.println("�޼���� : " + s1.equals(s2));	// ���ڿ� ���� ��
		
		String s3 = s1;
		System.out.println("�����ں� : " + (s1 == s3));	// ���ڿ� �ּ� ��
		System.out.println("�޼���� : " + s1.equals(s3));	// ���ڿ� ���� ��
		
		String s4 = "�̼���";	// ��ü����
		String s5 = "�̼���";	// ��ü����
		System.out.println("�����ں� : " + (s4 == s5));	// ���ڿ� �ּ� ��
		System.out.println("�޼���� : " + s4.equals(s5));	// ���ڿ� ���� ��
		
		String svalue = "101";	// ���ڿ�, ���� �Ұ���
		System.out.println(3 + svalue);
		//Integer ivalue = new Integer(svalue);	// �� ������� �������� ����.
		int ivalue = Integer.parseInt(svalue);	// �Ű� ������ ���������� ���ڿ��̾�� �Ѵ�.
		System.out.println(ivalue + 1);
		double dvalue = Double.parseDouble(svalue);	// ���ڿ��� double�� ��ȯ
		System.out.println(dvalue + 1.00000006);	// �Ǽ�����
	}

}
