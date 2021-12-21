
public class EqualTest {

	public static void main(String[] args) {
		Student st1 = new Student(100, "홍길동");
		Student st2 = st1; // 객체복사 동일한 주소를 나타 냄.
		System.out.println(st1);
		System.out.println(st2);
		Student st3 = new Student(100, "홍길동");	// 내용은 동일하나 주소가 다름.
		System.out.println(st3);
		System.out.println("st1과 st2 비교 : " + st1.equals(st2));
		//equals() 메서드 원형은 해시코드 비교다.
//		String str1 = "홍길동";
//		String str2 = new String("홍길동");
//		String str3 = new String("홍길동");
//
//		System.out.println("str1 == str2 ? " + (str1 == str2));
//		System.out.println("str1 == str3 ? " + (str1 == str3));
//
//		System.out.println("str1 hashCode ? " + System.identityHashCode(str1));
//		System.out.println("str2 hashCode ? " + System.identityHashCode(str2));
//		System.out.println("str3 hashCode ? " + System.identityHashCode(str3));
	}

}
