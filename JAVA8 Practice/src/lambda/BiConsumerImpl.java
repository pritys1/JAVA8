package lambda;

import java.util.List;
import java.util.function.BiConsumer;

import Data.Student;
import Data.StudentDatabase;

public class BiConsumerImpl {
	public static void printnameandactivitiesusingbiconsumer()
	{
		BiConsumer<String,List<String>> print=(a,b)->System.out.println(a+" "+b);
		List<Student> stulist=StudentDatabase.getAllStudents();
		stulist.forEach((student)->{
			print.accept(student.getName(), student.getActivities());
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<String,String> biconsumer=(a,b)->System.out.println(a+" "+b);
		biconsumer.accept("bi","consumer");
		BiConsumer<Integer,Integer> mult=(x,y)->System.out.println(x*y);
		BiConsumer<Integer,Integer> div=(x,y)->System.out.println(x/y);
		mult.andThen(div).accept(10, 5);
		printnameandactivitiesusingbiconsumer();
		
		

	}

}
