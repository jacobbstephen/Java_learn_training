package oops.association.composition;

public class Home {
	String homeName;
	Room room;
	
	Home(String name){
		homeName = name;
		System.out.println(homeName);
		room = new Room("Bedroom");
	}
}
