package lambdaExpression;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunInterface addition = (a, b) -> a + b;
		
		int result = addition.add(5, 6);
		System.out.println(result);
	}

}
