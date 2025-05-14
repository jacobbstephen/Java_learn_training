package practice_set_3.advanced.lambda;

public class Main {

	public static void main(String[] args) {
		MyFunction func = (int num) -> num * num;
		System.out.println(func.squareOfNumber(25));
		

	}

}
