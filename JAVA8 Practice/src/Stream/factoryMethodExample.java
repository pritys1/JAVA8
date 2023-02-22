package Stream;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

//of(),iterate(),generate()
public class factoryMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream string=Stream.of("Adam","Dan","jullie");
		//string.forEach(value->System.out.println(value));
		string.forEach(System.out::println);
		//Stream.iterate(2, x->x*2).limit(10).forEach(System.out::println);
		Supplier<Integer> integersupplier=new Random()::nextInt;
		Stream.generate(integersupplier).limit(5).forEach(System.out::println);

	}

}
