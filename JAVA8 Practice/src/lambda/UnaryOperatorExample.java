package lambda;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
	static UnaryOperator<String> unary=(s)->s.concat("default");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(unary.apply("java"));
	}

}
