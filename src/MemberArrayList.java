import java.util.*;
public class MemberArrayList {
	ArrayList<Member> arrayList;	// 멤버변수, 선언만
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();	// 멤버 객체를 저장할 수 있는 리스트를 생성
	}
	
	public void addMember(Member member) {	// 회원 추가
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {	// 삭제 성공하면 true 반환
		int k = 0;
		for(Member member : arrayList) {
			if(member.getMenberId() == memberId) {
				System.out.println(memberId + ":" + member.getMemberName() + "을(를) 삭제했습니다.");
				arrayList.remove(k);
				return true;
			}
			++k;
		}
//		for(int i = 0; i < arrayList.size(); i++) {
//			Member member = arrayList.get(i);
//			int aaa = member.getMenberId();
//			String bbb = member.getMemberName();
//			if(aaa == memberId) {
//				arrayList.remove(i);
//				return true;
//			}
//		}
		System.out.println(memberId + "가(이) 존재하지 않습니다.");
		return false;
	}
	
	public boolean removeMember(String memberName) {
		int k = 0;
		for(Member member : arrayList) {
			if(member.getMemberName().equals(memberName)) {
				System.out.println(member.getMenberId() + ":" + member.getMemberName() + "을(를) 삭제했습니다.");
				arrayList.remove(k);
				return true;
			}
			k++;
		}
		System.out.println(memberName + "가(이) 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
