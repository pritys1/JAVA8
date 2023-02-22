package lambda;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import Data.Student;
import Data.StudentDatabase;

public class BiPredicateImpl {
	static BiPredicate<Integer,Double> bipredicate=(grade,gpa)->grade>=3&&gpa>3.9;
	static BiConsumer<String, List<String>> biconsumer=(name,activities)->System.out.println(name+" "+activities);
static Consumer<Student> consumer=(student)->{
	if(bipredicate.test(student.getGradelevel(),student.getGpa()))
		biconsumer.accept(student.getName(),student.getActivities());
};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> stulist=StudentDatabase.getAllStudents();
		stulist.forEach(consumer);

	}

}
