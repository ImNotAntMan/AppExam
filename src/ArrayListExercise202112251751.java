// ArrayList를 많이 사용할 것 같아서 연습중
// 데이터가 추가되면 자동으로 용량을 늘려준다.
// ArrayList의 초기 용량은 10이다.
// 용량이 11이 되는 순간 오버헤드가 발생한다.(성능 저하)
// 기본형(int, char, double ...)들은 클래스가 아니기 때문에 wrapper클래스로 만들어서 사용한다.
// String은 기본형이 아닌 클래스이기 때문에 그냥 사용할 수 있다.

import java.util.*;
public class ArrayListExercise202112251751 {
	ArrayList<String> list1 = new ArrayList<String>();	// String type 지정
	ArrayList<String> list3 = new ArrayList<String>(100);	// 용량 지정
	//ArrayList<String> list4 = new ArrayList<String>(otherList)
	
	list1.add("홍길동");
	list1.add(3, "이순신");
	for(String ls : list1) {
		System.out.println(ls);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
