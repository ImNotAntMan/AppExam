
public class EqualTest {

	public static void main(String[] args) {
		Student st1 = new Student(100, "ȫ�浿");
		Student st2 = st1; // ��ü���� ������ �ּҸ� ��Ÿ ��.
		System.out.println(st1);
		System.out.println(st2);
		Student st3 = new Student(100, "ȫ�浿");	// ������ �����ϳ� �ּҰ� �ٸ�.
		System.out.println(st3);
		System.out.println("st1�� st2 �� : " + st1.equals(st2));
		//equals() �޼��� ������ �ؽ��ڵ� �񱳴�.
//		String str1 = "ȫ�浿";
//		String str2 = new String("ȫ�浿");
//		String str3 = new String("ȫ�浿");
//
//		System.out.println("str1 == str2 ? " + (str1 == str2));
//		System.out.println("str1 == str3 ? " + (str1 == str3));
//
//		System.out.println("str1 hashCode ? " + System.identityHashCode(str1));
//		System.out.println("str2 hashCode ? " + System.identityHashCode(str2));
//		System.out.println("str3 hashCode ? " + System.identityHashCode(str3));
	}

}
