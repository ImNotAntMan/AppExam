
public class HighSchool extends Person {
	public HighSchool(String personName) {
		super(personName);
	}
	
	public void doWorks() {
		System.out.println(getPersonName() + "이 열심히 공부하고 있습니다.");
	}
}
