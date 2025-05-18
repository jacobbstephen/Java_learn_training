package exceptions.intermediate.age;

public class Main {
	
	public static void main(String[] args) {
		Age age = new Age();
		try {
			age.validateAge(17);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
