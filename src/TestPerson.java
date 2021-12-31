
public class TestPerson {

	public static void main(String[] args) {
		ManagePerson mperson = new ManagePerson();
		mperson.addPerson(new HighSchool("임꺽정"));
		mperson.addPerson(new HighSchool("임꺽정"));
		mperson.addPerson(new HighSchool("임꺽정"));
		mperson.addPerson(new Employee("임꺽정"));
		mperson.addPerson(new Employee("임꺽정"));
		mperson.addPerson(new Employee("임꺽정"));
		mperson.addPerson(new Children("임꺽정"));
		mperson.addPerson(new Children("임꺽정"));
		mperson.addPerson(new Children("임꺽정"));
		mperson.showAllPerson();
	}

}
