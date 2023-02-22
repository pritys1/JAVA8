import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeDecalarative {
	public static void main(String[] args)
	{
		List<Integer> integerlist=Arrays.asList(1,2,3,4,4,55,55,66);
		//imperative way
		List<Integer> uniqueList=new ArrayList<>();
		for(Integer integer:integerlist)
		{
			if(!uniqueList.contains(integer))
			{
				uniqueList.add(integer);
			}
		}
		System.out.println(uniqueList);
		
		//Declarative way
		List<Integer> uniqueList1=integerlist.stream().distinct().collect(Collectors.toList());
		
	}
	

}
