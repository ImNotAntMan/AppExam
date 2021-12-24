import java.util.*;
public class MemberArrayList {
	ArrayList<Member> arrayList;	// �������, ����
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();	// ��� ��ü�� ������ �� �ִ� ����Ʈ�� ����
	}
	
	public void addMember(Member member) {	// ȸ�� �߰�
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {	// ���� �����ϸ� true ��ȯ
		int k = 0;
		for(Member member : arrayList) {
			if(member.getMenberId() == memberId) {
				System.out.println(memberId + ":" + member.getMemberName() + "��(��) �����߽��ϴ�.");
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
		System.out.println(memberId + "��(��) �������� �ʽ��ϴ�.");
		return false;
	}
	
	public boolean removeMember(String memberName) {
		int k = 0;
		for(Member member : arrayList) {
			if(member.getMemberName().equals(memberName)) {
				System.out.println(member.getMenberId() + ":" + member.getMemberName() + "��(��) �����߽��ϴ�.");
				arrayList.remove(k);
				return true;
			}
			k++;
		}
		System.out.println(memberName + "��(��) �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
