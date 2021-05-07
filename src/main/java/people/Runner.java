package people;

import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		Person piers = new Person("Piers", 25, "Consultant");
		Person andrew = new Person("Andrew", 20, "King");
		
		peopleStorage storage = new peopleStorage();
		
		storage.addPerson(piers);
		storage.addPerson(andrew);
		
		System.out.println(storage.searchPeople("Andrew"));
		System.out.println(storage.searchPeople("Piers"));
		
		storage.printPeople();
	}
}
