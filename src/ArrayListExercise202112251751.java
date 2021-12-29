import java.util.*;
public class ArrayListExercise202112251751 {
	// ArrayList를 많이 사용할 것 같아서 연습중
	// ArrayList는 데이터가 추가되면 자동으로 용량을 늘려준다.
	// ArrayList의 초기 용량은 10이다.
	// 용량이 11이 되는 순간 오버헤드가 발생한다.(성능 저하)
	// 기본형(int, char, double ...)들은 클래스가 아니기 때문에 wrapper클래스로 만들어서 사용한다.
	// String은 기본형이 아닌 클래스이기 때문에 그냥 사용할 수 있다.

//	ArrayList<String> arrayList = new ArrayList<String>(44);

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("홍길동1");
		list1.add("홍길동2");
		list1.add("홍길동3");
		list1.add("홍길동4");
		list1.add("홍길동5");
		list1.add("홍길동6");
		list1.add("홍길동7");
		list1.add("홍길동8");
		list1.add("홍길동9");
		list1.add("홍길동10");
		list1.add("홍길동11");
		list1.add("홍길동8");
		list1.add("홍길동12");
		list1.add("홍길동8");
		list1.add(3, "이순신"); // 끼워 넣기
		
		// 특이하게도 String 객체를 출력하면 주소가 아니라 value가 출력 됨.
		for(String st : list1) {	// 리스트 출력
			System.out.println(st);
		}
		
		boolean isContained = list1.contains("홍길동"); // 홍길동이 있는지 검색
		System.out.println(isContained);	// false
		
		isContained = list1.contains("이순신"); // 이순신이 있는지 검색
		System.out.println(isContained);	// true
		
		int index = list1.indexOf("홍길동"); // 있으면 해당 인덱스 번호 , 없으면 -1
		System.out.println(index); // -1
		
		index = list1.indexOf("이순신");
		System.out.println(index);	// 3
		
		// 홍길동5 삭제
		// 그런데 이렇게 코딩을 하면 범용성이 없다. 일일이 이름을 넣어서 쭉 써 내려가야 한다. 
		// 즉 외부에 클래스 파일을 만들어서 메서드를 만들어 사용하는 것이 효율적이다.
		index = list1.indexOf("홍길동5"); // 홍길동5의 인덱스번호를 알아 내자. 넌 죽었어!
		if(index > -1) {
			System.out.println(list1.get(index) + ": 삭제했습니다. ");
			list1.remove(index); // 홍길동5 삭제
		} else {
			System.out.println("그런거 없습니다.");
		}
		
		// 삭제를 다른 방법으로 홍길동8 죽었으!
		int k = 0;
		for(String st2 : list1) {	// 리스트 출력
			System.out.println(st2);
		}
		System.out.println(list1.size());
		k = 0;
		for(int i = 0; i < list1.size() ; i++) {
			k = list1.indexOf("홍길동8");
			if(k > 0) {
				System.out.println(list1.get(k) + ": 삭제했습니다." + k);
				list1.remove(k);
			}
//			System.out.println(list1.get(i));
		}
		
//		for(String st : list1) {
//			if(st.contains("홍길동")) {
//				System.out.println(st + ": 삭제했습니다." + k);
//				list1.remove(k);
//				break; // 그런데 홍길동8이 한명이 아니라 여러명이면 break문 삭제
//			}
//			System.out.println(st);
//			k++;
//		}
		
		for(String st3 : list1) {	// 리스트 출력
			System.out.println(st3);
		}

	}
}
