package personData;

public class Person {
	private String name;
	private Address add;
	
	public Person(String name, Address add) {
		this.add = add;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Address getAdd() {
		return add;
	}
	
	
	
}
