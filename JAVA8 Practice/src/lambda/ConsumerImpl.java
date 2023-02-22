package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import Data.Student;
import Data.StudentDatabase;

public class ConsumerImpl {
	static Consumer<Student> c3=(student)->System.out.print(student.getName());
	static 	Consumer<String> c=(s)-> System.out.println(s.toUpperCase());
	static Consumer<Integer> c1=(s)-> System.out.println(s);
	static Consumer<Student> c2=(student)->System.out.println(student);
	static Consumer<Student> c4=(student)->System.out.println(student.getActivities());
	static Consumer<Student> c5=(student)->System.out.println(student.getGpa());
	public static void main(String[] args) {
		
		c.accept("abc");
		//complex impl
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		list.forEach((integer->{
			if(integer>5&&integer<9){
			c1.accept(integer);
			
			}
			
			}));
		printnameandActivitiesUsingCondition();
		

	}
	public static void printstudent()
	{
		List<Student> stulist=StudentDatabase.getAllStudents();
		stulist.forEach(c2);
	}
	public static void printname()
	{
		Consumer<Student> c3=(student)->System.out.println(student.getName());
		List<Student> stulist=StudentDatabase.getAllStudents();
		stulist.forEach(c3);
	}
	public static void printnameandActivities()
	{
		List<Student> stulist=StudentDatabase.getAllStudents();
		stulist.forEach(c3.andThen(c4)); //consumer chaining using andThen method
	}
	public static void printnameandActivitiesUsingCondition()
	{
		List<Student> stulist=StudentDatabase.getAllStudents();
		stulist.forEach((student)->{
			if(student.getGpa()>3.6)
				c3.andThen(c4).andThen(c5).accept(student);
		}); //consumer chaining
	}

}
