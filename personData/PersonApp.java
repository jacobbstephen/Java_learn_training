package personData;

public class PersonApp {
	
	public static Person[] personDB = new Person[10];
	
	public static void findPerson(String country) {
		for(int i = 0; i < 10; i++) {
			Person p = personDB[i];
			if(p.getAdd().getCountry().equals(country)) {
				System.out.println(p.getName() + " => " + p.getAdd().getCountry() + " : " + p.getAdd().getStreet());
			}
		}
	}
	
	public static void  initPersonInfo(String name, Address add, int index) {
		Person p = new Person(name, add);
		personDB[index] = p;
	} 
	
	public static void main(String[] args) {
		Address add;
		for(int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				add = new Address("Old Street" + i, "UK");
			} else {
				add = new Address("New Street" + i, "India");
			}
			initPersonInfo("P" + i, add, i);
		}
		findPerson("UK");
	}
}
