package lambda;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import Data.Student;
import Data.StudentDatabase;

public class PredicateandConsumerExample {
	static Predicate<Student> p1=(s)->s.getGradelevel()>=3;
	static Predicate<Student> p2=(s)->s.getGpa()>=3.9;
	static BiConsumer<String, List<String>> biconsumer=(name,activities)->System.out.println(name+" "+activities);
	
	static Consumer<Student> studentconsumer=(student)->{
		if(p1.and(p2).test(student))
			biconsumer.accept(student.getName(), student.getActivities());
			
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> stulist=StudentDatabase.getAllStudents();
		stulist.forEach(studentconsumer);
	}

}
