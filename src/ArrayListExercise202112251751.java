// ArrayList�� ���� ����� �� ���Ƽ� ������
// �����Ͱ� �߰��Ǹ� �ڵ����� �뷮�� �÷��ش�.
// ArrayList�� �ʱ� �뷮�� 10�̴�.
// �뷮�� 11�� �Ǵ� ���� ������尡 �߻��Ѵ�.(���� ����)
// �⺻��(int, char, double ...)���� Ŭ������ �ƴϱ� ������ wrapperŬ������ ���� ����Ѵ�.
// String�� �⺻���� �ƴ� Ŭ�����̱� ������ �׳� ����� �� �ִ�.

import java.util.*;
public class ArrayListExercise202112251751 {
	ArrayList<String> list1 = new ArrayList<String>();	// String type ����
	ArrayList<String> list3 = new ArrayList<String>(100);	// �뷮 ����
	//ArrayList<String> list4 = new ArrayList<String>(otherList)
	
	list1.add("ȫ�浿");
	list1.add(3, "�̼���");
	for(String ls : list1) {
		System.out.println(ls);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
