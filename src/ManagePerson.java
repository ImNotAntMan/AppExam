import java.util.*;
public class ManagePerson {
	ArrayList<Person> personList;
	
	public ManagePerson() {
		personList = new ArrayList<Person>();
	}
	
	public void addPerson(Person person) {
		personList.add(person);
	}
	
	public boolean removePerson(String personName) {
		for(Person tmp : personList) {
			if (tmp.getPersonName().equals(personName)) {
				personList.remove(tmp);
				return true;
			}
		}
		return false;
	}
	
	public void showAllPerson() {
		for(Person tmp : personList) {
			tmp.doWorks();
		}
	}

}
