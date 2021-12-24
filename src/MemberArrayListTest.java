
public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memlist = new MemberArrayList();
		Member m1 = new Member(100, "홍길동");
		Member m2 = new Member(200, "이순신");
		Member m3 = new Member(300, "홍갈동");
		Member m4 = new Member(400, "홍올동");
		Member m5 = new Member(500, "홍울동");
		Member m6 = new Member(600, "이만기");
		memlist.addMember(m1);
		memlist.addMember(m2);
		memlist.addMember(m3);
		memlist.addMember(m4);
		memlist.addMember(m5);
		memlist.addMember(m6);
		memlist.showAllMember();
		memlist.removeMember(300);
		memlist.removeMember("이만기");
		memlist.showAllMember();
		memlist.removeMember(800);
		
	}
}
