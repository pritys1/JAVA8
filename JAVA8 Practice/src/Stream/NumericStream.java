package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStream {
	public static int sumofNum(List<Integer> list){
		return list.stream().reduce(0,(a,b)->a+b);
	}
	public static int sumofNumIntStream(){
		return IntStream.rangeClosed(1,6).sum();
		//return list.stream().reduce(0,(a,b)->a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> inpu1=Arrays.asList(1,2,3,4,5,6);
System.out.println(sumofNum(inpu1));
System.out.println(sumofNumIntStream());

//IntStream intstream=IntStream.range(1, 50);

//System.out.println(intstream.count());
System.out.println(inpu1.stream().reduce((a,b)->a>b?a:b));

//IntStream.range(1,50).forEach(value->System.out.println(value));

//IntStream.rangeClosed(1,50).forEach(value->System.out.println(value));

//////IntStream.rangeClosed(1,50).asDoubleStream().forEach(value->System.out.println(value));

//System.out.println(IntStream.rangeClosed(1,50).count());

//int sum=IntStream.rangeClosed(1, 50).sum();

//System.out.println(sum);
//OptionalInt optint=IntStream.rangeClosed(1, 50).max();
//System.out.println(optint);
}
}