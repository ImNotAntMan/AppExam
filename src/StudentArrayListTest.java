
public class StudentArrayListTest {

	public static void main(String[] args) {
		StudentArrayList studentList = new StudentArrayList();
		Student st1 = new Student(100, "이순신");
		Student st2 = new Student(200, "이순선");
		Student st3 = new Student(300, "이순순");
		Student st4 = new Student(400, "이순쓕");
		Student st5 = new Student(500, "이순심");
		Student st6 = new Student(600, "이순술");
		Student st7 = new Student(700, "이순수");
		System.out.println(st7.toString());
		studentList.addStudent(st1);
		studentList.addStudent(st2);
		studentList.addStudent(st3);
		studentList.addStudent(st4);
		studentList.addStudent(st5);
		studentList.addStudent(st6);
		studentList.addStudent(st7);
		studentList.showAllStudent();
		studentList.removeStudent(500);
		studentList.removeStudent("이순술");
		studentList.showAllStudent();
	}

}
