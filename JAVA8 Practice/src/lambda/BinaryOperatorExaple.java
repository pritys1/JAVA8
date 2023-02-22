package lambda;

import java.util.function.BinaryOperator;

public class BinaryOperatorExaple {
	static BinaryOperator<Integer> binaryoperator=(a,b)->a+b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(binaryoperator.apply(10, 20));
		

	}

}
