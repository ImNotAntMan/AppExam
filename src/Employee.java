
public class Employee extends Person {
	public Employee(String personName) {
		super(personName);
	}

	public void doWorks(String personName) {
		System.out.println(getPersonName() + "이 열심히 일하고 있습니다.");
	}
}
