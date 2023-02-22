package lambda;

import java.util.function.Function;

public class FuctionImpl {
static Function<String,String> func=(s)->s.toUpperCase();
static Function<String,String> addSomeString=(s)->s.toUpperCase().concat("default");
	public static void main(String[] args) {
		System.out.println(func.andThen(addSomeString).apply("function"));//chaining
		System.out.println(func.compose(addSomeString).apply("function"));

	}

}
