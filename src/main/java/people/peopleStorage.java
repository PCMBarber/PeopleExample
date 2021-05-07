package people;

import java.util.ArrayList;

public class peopleStorage {
	
	private ArrayList<Person> listOfPeople = new ArrayList();
	
	public void addPerson(Person person) {
		listOfPeople.add(person);
	}
	
	public Person searchPeople(String name) {
		for(int i = 0; i < listOfPeople.size(); i++) {
			if(name.equals(listOfPeople.get(i).getName())) {
				return listOfPeople.get(i);
			}
		}
		return null;
	}
	
	public void printPeople() {
		for(int i = 0; i < listOfPeople.size(); i++) {
			System.out.println(listOfPeople.get(i));
		}
	}
}
