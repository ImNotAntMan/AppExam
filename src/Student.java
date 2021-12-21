
public class Student {
	private int studentId;
	private String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			System.out.println(System.identityHashCode(std.studentName));System.out.println(System.identityHashCode(studentName));
			if(this.studentId == std.studentId && studentName.equals(std.studentName)) {
				return true;
			} else {
				return false;
			}
		}
		return false;		
	}
}
