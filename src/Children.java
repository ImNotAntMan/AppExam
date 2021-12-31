
public class Children extends Person {
	public Children(String personName) {
		super(personName);
	}

	public void doWorks() {
		System.out.println(getPersonName() + "이 학원을 가고 있습니다. 불쌍해");
	}
}
