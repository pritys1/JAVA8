package lambda;

import java.util.Comparator;

public class implComparator {

	public static void main(String[] args) {
		//prior java8
		Comparator<Integer> comparator=new Comparator<Integer>()
				{

					@Override
					public int compare(Integer o1, Integer o2) {
						// TODO Auto-generated method stub
						return o1.compareTo(o2);
					}
                    };
                    System.out.println(comparator.compare(2, 3));
                    
                    
                    //using lambda
          Comparator<Integer> comparator1=(a,b)->a.compareTo(b);
         System.out.println(comparator1.compare(2, 3)); 
		
		

	}

}
