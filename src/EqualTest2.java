
public class EqualTest2 {

	public static void main(String[] args) {
		Student st1 = new Student(100, "홍길동");
		Student st2 = new Student(100, "홍길동");
		System.out.println("연산자비교 : " + (st1 == st2));	// 객체 주소(해쉬코드) 비교
		System.out.println("메서드비교 : " + st1.equals(st2));	// 객체 해쉬코드 비교
		
		Student st3 = st1;
		System.out.println("연산자비교 : " + (st1 == st3));	// 객체 주소(해쉬코드) 비교
		System.out.println("메서드비교 : " + st1.equals(st3));	// 객체 해쉬코드 비교
		
		String s1 = new String("호랑이");
		String s2 = new String("호랑이");
		System.out.println("연산자비교 : " + (s1 == s2));	// 문자열 주소 비교
		System.out.println("메서드비교 : " + s1.equals(s2));	// 문자열 내용 비교
		
		String s3 = s1;
		System.out.println("연산자비교 : " + (s1 == s3));	// 문자열 주소 비교
		System.out.println("메서드비교 : " + s1.equals(s3));	// 문자열 내용 비교
		
		String s4 = "이순신";	// 객체생성
		String s5 = "이순신";	// 객체생성
		System.out.println("연산자비교 : " + (s4 == s5));	// 문자열 주소 비교
		System.out.println("메서드비교 : " + s4.equals(s5));	// 문자열 내용 비교
		
		String svalue = "101";	// 문자열, 연산 불가능
		System.out.println(3 + svalue);
		//Integer ivalue = new Integer(svalue);	// 이 방식으로 생성하지 않음.
		int ivalue = Integer.parseInt(svalue);	// 매개 변수는 정수형태의 문자열이어야 한다.
		System.out.println(ivalue + 1);
		double dvalue = Double.parseDouble(svalue);	// 문자열을 double로 변환
		System.out.println(dvalue + 1.00000006);	// 실수연산
	}

}
