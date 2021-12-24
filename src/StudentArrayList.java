import java.util.*;
public class StudentArrayList {
	ArrayList<Student> arrayList;
	
	public StudentArrayList() {
		arrayList = new ArrayList<Student>();
	}
	
	public void addStudent(Student student) {
		arrayList.add(student);
	}
	
	public boolean removeStudent(int studentId) {
		int k = 0;
		for(Student student : arrayList) {
			if(student.getStudentId() == studentId) {
				System.out.println(student + "�� �����Ͽ����ϴ�.");
//				System.out.println(arrayList);
//				System.out.println(studentId + " " + student.getStudentName() + "�� �����Ͽ����ϴ�.");
				arrayList.remove(k);
				return true;
			}
			++k;
		}
		System.out.println("����� ã�� �� �����ϴ�.");
		return false;
	}

	public boolean removeStudent(String studentName) {
		int k = 0;
		for(Student student : arrayList) {
			if(student.getStudentName().equals(studentName)) {
				System.out.println(student.getStudentId() + " " + student.getStudentName() + "�� �����Ͽ����ϴ�.");
				arrayList.remove(k);
				return true;
			}
			++k;
		}
		System.out.println("����� ã�� �� �����ϴ�.");
		return false;
	}


	public void showAllStudent() {
		for(Student st : arrayList) {
			System.out.println(st);
//			System.out.println(st.getStudentId() + "  " + st.getStudentName());
		}
		System.out.println();
	}

}
