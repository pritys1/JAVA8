package lambda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import Data.Student;
import Data.StudentDatabase;

public class PredicateStudentExample {
	static Predicate<Student> p1=(student)->student.getGradelevel()>3;
	static Predicate<Student> p2=(student)->student.getGpa()>3.6;
	static Consumer<Student> student=(student)->{
		if(p2.test(student))
			System.out.println(student);
	};
	public static void filterstudentbygradelevel()
	{
		List<Student> stulist=StudentDatabase.getAllStudents();
		stulist.forEach((student)->{
			if(p1.test(student))
				System.out.println(student);
		});
	}
	public static void filterstudentbygpalevel()
	{
		List<Student> stulist=StudentDatabase.getAllStudents();
		stulist.forEach(student);
	}
	public static void filterstudentbygpaandgradelevel()
	{
		List<Student> stulist=StudentDatabase.getAllStudents();
		stulist.forEach((student)->{
			if(p1.or(p2).negate().test(student))
				System.out.println(student);
		});
	}

	public static void main(String[] args) {
		
		//filterstudentbygradelevel();
		System.out.println();
		filterstudentbygpalevel();
//		filterstudentbygpaandgradelevel();
	}

}
