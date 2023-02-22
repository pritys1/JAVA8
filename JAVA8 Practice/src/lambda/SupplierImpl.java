package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import Data.Student;
import Data.StudentDatabase;

public class SupplierImpl {
	static Supplier<Student> supply=()-> new Student("adam",2,3.6,"male",Arrays.asList("abs","bdg","thd"));
static Supplier<List<Student>> list=()->StudentDatabase.getAllStudents();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(supply.get());
		System.out.println(list.get());

	}

}
