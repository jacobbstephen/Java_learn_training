package streams.objectStream;

import java.io.Serializable;

public class StudentData implements Serializable {
	String name;
	int age;
	public StudentData(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
