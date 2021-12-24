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
				System.out.println(student + "을 삭제하였습니다.");
//				System.out.println(arrayList);
//				System.out.println(studentId + " " + student.getStudentName() + "을 삭제하였습니다.");
				arrayList.remove(k);
				return true;
			}
			++k;
		}
		System.out.println("대상을 찾을 수 없습니다.");
		return false;
	}

	public boolean removeStudent(String studentName) {
		int k = 0;
		for(Student student : arrayList) {
			if(student.getStudentName().equals(studentName)) {
				System.out.println(student.getStudentId() + " " + student.getStudentName() + "을 삭제하였습니다.");
				arrayList.remove(k);
				return true;
			}
			++k;
		}
		System.out.println("대상을 찾을 수 없습니다.");
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
