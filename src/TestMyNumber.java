
public class TestMyNumber {

	public static void main(String[] args) {
		MyNumber max = (x, y) -> (x >= y) ? x : y; // �������̽��� �޼��� ����
		System.out.println(max.getMax(100, 200));
		
		String s1 = "�ڹ�";
		String s2 = "���α׷���";
		StringConcat concat = (x, y) -> System.out.println(x + " " + y);
		concat.makeString(s1, s2);
	}
}