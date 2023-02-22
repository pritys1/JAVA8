package lambda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import Data.Student;
import Data.StudentDatabase;

public class FunctionExample {
	public static String perfconcat(String str)
	{
		return FuctionImpl.addSomeString.apply(str);
	}
	static Function<List<Student>,Map<String,Double>> studentfunc=(students)->{
		Map<String,Double> studentgrademap=new HashMap<>();
		students.forEach((student)->{
			studentgrademap.put(student.getName(),student.getGpa());
		});
		return studentgrademap;
	};
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(perfconcat("Hello"));
		System.out.println(studentfunc.apply(StudentDatabase.getAllStudents()));
	}

}
