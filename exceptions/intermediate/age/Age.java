package exceptions.intermediate.age;

public class Age {
	void validateAge(int age)  {
		if(age < 18) throw new  IllegalArgumentException("Age Must be greater than 18");	
		System.out.println("Valid age");
		
	}
}
