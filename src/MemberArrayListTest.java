
public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memlist = new MemberArrayList();
		Member m1 = new Member(100, "ȫ�浿");
		Member m2 = new Member(200, "�̼���");
		Member m3 = new Member(300, "ȫ����");
		Member m4 = new Member(400, "ȫ�õ�");
		Member m5 = new Member(500, "ȫ�ﵿ");
		Member m6 = new Member(600, "�̸���");
		memlist.addMember(m1);
		memlist.addMember(m2);
		memlist.addMember(m3);
		memlist.addMember(m4);
		memlist.addMember(m5);
		memlist.addMember(m6);
		memlist.showAllMember();
		memlist.removeMember(300);
		memlist.removeMember("�̸���");
		memlist.showAllMember();
		memlist.removeMember(800);
		
	}
}
