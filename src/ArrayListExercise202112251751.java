import java.util.*;
public class ArrayListExercise202112251751 {
	// ArrayList�� ���� ����� �� ���Ƽ� ������
	// ArrayList�� �����Ͱ� �߰��Ǹ� �ڵ����� �뷮�� �÷��ش�.
	// ArrayList�� �ʱ� �뷮�� 10�̴�.
	// �뷮�� 11�� �Ǵ� ���� ������尡 �߻��Ѵ�.(���� ����)
	// �⺻��(int, char, double ...)���� Ŭ������ �ƴϱ� ������ wrapperŬ������ ���� ����Ѵ�.
	// String�� �⺻���� �ƴ� Ŭ�����̱� ������ �׳� ����� �� �ִ�.

//	ArrayList<String> arrayList = new ArrayList<String>(44);

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("ȫ�浿1");
		list1.add("ȫ�浿2");
		list1.add("ȫ�浿3");
		list1.add("ȫ�浿4");
		list1.add("ȫ�浿5");
		list1.add("ȫ�浿6");
		list1.add("ȫ�浿7");
		list1.add("ȫ�浿8");
		list1.add("ȫ�浿9");
		list1.add("ȫ�浿10");
		list1.add("ȫ�浿11");
		list1.add("ȫ�浿8");
		list1.add("ȫ�浿12");
		list1.add("ȫ�浿8");
		list1.add(3, "�̼���"); // ���� �ֱ�
		
		// Ư���ϰԵ� String ��ü�� ����ϸ� �ּҰ� �ƴ϶� value�� ��� ��.
		for(String st : list1) {	// ����Ʈ ���
			System.out.println(st);
		}
		
		boolean isContained = list1.contains("ȫ�浿"); // ȫ�浿�� �ִ��� �˻�
		System.out.println(isContained);	// false
		
		isContained = list1.contains("�̼���"); // �̼����� �ִ��� �˻�
		System.out.println(isContained);	// true
		
		int index = list1.indexOf("ȫ�浿"); // ������ �ش� �ε��� ��ȣ , ������ -1
		System.out.println(index); // -1
		
		index = list1.indexOf("�̼���");
		System.out.println(index);	// 3
		
		// ȫ�浿5 ����
		// �׷��� �̷��� �ڵ��� �ϸ� ���뼺�� ����. ������ �̸��� �־ �� �� �������� �Ѵ�. 
		// �� �ܺο� Ŭ���� ������ ���� �޼��带 ����� ����ϴ� ���� ȿ�����̴�.
		index = list1.indexOf("ȫ�浿5"); // ȫ�浿5�� �ε�����ȣ�� �˾� ����. �� �׾���!
		if(index > -1) {
			System.out.println(list1.get(index) + ": �����߽��ϴ�. ");
			list1.remove(index); // ȫ�浿5 ����
		} else {
			System.out.println("�׷��� �����ϴ�.");
		}
		
		// ������ �ٸ� ������� ȫ�浿8 �׾���!
		int k = 0;
		for(String st2 : list1) {	// ����Ʈ ���
			System.out.println(st2);
		}
		System.out.println(list1.size());
		k = 0;
		for(int i = 0; i < list1.size() ; i++) {
			k = list1.indexOf("ȫ�浿8");
			if(k > 0) {
				System.out.println(list1.get(k) + ": �����߽��ϴ�." + k);
				list1.remove(k);
			}
//			System.out.println(list1.get(i));
		}
		
//		for(String st : list1) {
//			if(st.contains("ȫ�浿")) {
//				System.out.println(st + ": �����߽��ϴ�." + k);
//				list1.remove(k);
//				break; // �׷��� ȫ�浿8�� �Ѹ��� �ƴ϶� �������̸� break�� ����
//			}
//			System.out.println(st);
//			k++;
//		}
		
		for(String st3 : list1) {	// ����Ʈ ���
			System.out.println(st3);
		}

	}
}
