package lambda;

import java.util.function.Predicate;

public class PredicateImpl {
	static Predicate<Integer> pre=(a)->a%2==0;
	static Predicate<Integer> pre1=(a)->a%5==0;
	
	public static void predicateand()
	{
		System.out.println(pre.and(pre1).test(50));// predicate chaining using and() method
		System.out.println(pre.and(pre1).test(9));
	}
	public static void predicateOr()
	{
		System.out.println(pre.or(pre1).test(50));// predicate chaining using or() method
		System.out.println(pre.or(pre1).test(9));
	}
	public static void predicateNegate()
	{
		System.out.println(pre.or(pre1).negate().test(50));// predicate chaining or() and negate() method
		System.out.println(pre.or(pre1).negate().test(9));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(pre.test(10));
		//predicateand();
		predicateOr();
		predicateNegate();

	}

}
